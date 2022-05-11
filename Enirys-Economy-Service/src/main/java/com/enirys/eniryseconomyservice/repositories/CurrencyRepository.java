package com.enirys.eniryseconomyservice.repositories;

import com.enirys.eniryseconomyservice.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    @Query("SELECT curren from currency curren where curren.userId=?1")
    public Currency getCurrencyByUserId(Long userId);
}
