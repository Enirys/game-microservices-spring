package com.enirys.eniryseconomyservice;

import com.enirys.eniryseconomyservice.entities.Currency;
import com.enirys.eniryseconomyservice.repositories.CurrencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnirysEconomyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnirysEconomyServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CurrencyRepository currencyRepository)
    {
        return args -> {
            currencyRepository.save(new Currency(null, 1L, 500.0));
            currencyRepository.save(new Currency(null, 2L, 500.0));
            currencyRepository.save(new Currency(null, 3L, 500.0));
        };
    }

}
