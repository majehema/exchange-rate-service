package com.example.exchangerateservice.repository;

import com.example.exchangerateservice.entity.Exchange;
import com.example.exchangerateservice.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange, Long>{
    Exchange findByFromAndTo(Currency from, Currency to);

    Exchange findByFromAbbrevAndToAbbrev(String from, String to);

}