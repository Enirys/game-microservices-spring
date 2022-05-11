package com.enirys.eniryseconomyservice.web;

import com.enirys.eniryseconomyservice.entities.Currency;
import com.enirys.eniryseconomyservice.repositories.CurrencyRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
@RestController
public class CurrencyController {

    private CurrencyRepository currencyRepository;

    public CurrencyController(CurrencyRepository currencyRepository)
    {
        this.currencyRepository = currencyRepository;
    }

    @PostMapping(path = "/currency/{userId}")
    public void createCurrency(@PathVariable Long userId)
    {
        Currency currency = new Currency(null, userId, 0.0);
        currencyRepository.save(currency);
    }

    @GetMapping(path = "/currency/{userId}")
    public Currency getCurrency(@PathVariable Long userId)
    {
        return currencyRepository.getCurrencyByUserId(userId);
    }

    @PutMapping(path = "/currency/increase/{userId}/{amount}")
    public void increaseBalance(@PathVariable Long userId, @PathVariable double amount)
    {
        Currency currency = currencyRepository.getCurrencyByUserId(userId);
        currency.setBalance(currency.getBalance() + amount);
        currencyRepository.save(currency);
    }

    @PutMapping(path = "/currency/decrease/{userId}/{amount}")
    public void decreaseBalance(@PathVariable Long userId, @PathVariable double amount)
    {
        Currency currency = currencyRepository.getCurrencyByUserId(userId);
        currency.setBalance(currency.getBalance() - amount);
        currencyRepository.save(currency);
    }

    @DeleteMapping(path="/currency/{userId}")
    public void deleteByUserId(@PathVariable Long userId)
    {
        Currency currency = currencyRepository.getCurrencyByUserId(userId);
        currencyRepository.deleteById(currency.getId());
    }
}
