package com.example.exchangerateservice.web;

import com.example.exchangerateservice.entity.Currency;
import com.example.exchangerateservice.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyController {
    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyRepository currencyRepository;

    @GetMapping("/api/currencies")
    public List<Currency> retrieveCurrencies(){
        List<Currency> list = currencyRepository.findCurrencies();
        return list;
    }
}
