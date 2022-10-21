package com.example.exchangerateservice.repository;

import com.example.exchangerateservice.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    @Query("SELECT c FROM Currency c")
    List<Currency> findCurrencies();

    Currency findByAbbrev(String from);
}
