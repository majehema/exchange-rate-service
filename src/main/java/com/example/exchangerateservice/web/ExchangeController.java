package com.example.exchangerateservice.web;

import com.example.exchangerateservice.entity.Currency;
import com.example.exchangerateservice.entity.Exchange;
import com.example.exchangerateservice.repository.CurrencyRepository;
import com.example.exchangerateservice.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

import java.math.BigDecimal;

@RestController
public class ExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeRepository exchangeRepository;

    @Autowired
    private CurrencyRepository currencyRepository;

    @GetMapping("/api/currency-exchange/from/{from}/to/{to}")
    public Exchange retrieveExchange(@PathVariable Currency from, @PathVariable Currency to){
        Exchange exchange = exchangeRepository.findByFromAndTo(from, to);
        exchange.setQuantity(new BigDecimal(1));
        Currency currency = exchange.getFrom();
        Currency.incrementRequested(exchange.getFrom());
        if (from != to){
            Currency.incrementRequested(exchange.getTo());
        }
        currencyRepository.save(currency);
        return exchange;
    }

    @GetMapping("/api/currency-exchange/from/{quantity}/{from}/to/{to}")
    public Exchange retrieveExchange(@PathVariable BigDecimal quantity, @PathVariable Currency from, @PathVariable Currency to){
        Exchange exchange = exchangeRepository.findByFromAndTo(from, to);
        exchange.setQuantity(quantity);
        Currency currency = exchange.getFrom();
        Currency.incrementRequested(exchange.getFrom());
        if (from != to) {
            Currency.incrementRequested(exchange.getTo());
        }
        currencyRepository.save(currency);
        return exchange;
    }

    @GetMapping("/api/currency-exchange/from-currency/{from}/to-currency/{to}")
    public Exchange retrieveExchangeCurrency(@PathVariable String from, @PathVariable String to){
        Exchange exchange = exchangeRepository.findByFromAbbrevAndToAbbrev(from, to);
        exchange.setQuantity(new BigDecimal(1));
        Currency currency = exchange.getFrom();
        Currency.incrementRequested(exchange.getFrom());
        if (from != to) {
            Currency.incrementRequested(exchange.getTo());
        }
        currencyRepository.save(currency);
        return exchange;
    }

    @GetMapping("/api/currency-exchange/from-currency/{quantity}/{from}/to-currency/{to}")
    public Exchange retrieveExchangeCurrency(@PathVariable BigDecimal quantity, @PathVariable String from, @PathVariable String to){
        Exchange exchange = exchangeRepository.findByFromAbbrevAndToAbbrev(from, to);
        exchange.setQuantity(quantity);
        Currency currency = exchange.getFrom();
        Currency.incrementRequested(exchange.getFrom());
        if (from != to) {
            Currency.incrementRequested(exchange.getTo());
        }
        currencyRepository.save(currency);
        return exchange;
    }

    @GetMapping("/api/charts/from/{from}/to/{to}")
    public String retrieveChart(@PathVariable Currency from, @PathVariable Currency to){
        String chart = "Chart not available";
        Exchange exchange = exchangeRepository.findByFromAndTo(from, to);
        exchange.setQuantity(new BigDecimal(1));
        Currency currency = exchange.getFrom();
        Currency.incrementRequested(exchange.getFrom());
        if (from != to) {
            Currency.incrementRequested(exchange.getTo());
            chart = "https://www.tradingview.com/symbols/"+from.getAbbrev()+to.getAbbrev()+"/";
        }
        currencyRepository.save(currency);
        return chart;
    }

    @GetMapping("/api/charts/from-currency/{from}/to-currency/{to}")
    public String retrieveChart(@PathVariable String from, @PathVariable String to){
        String chart = "Chart not available";
        Currency currency = currencyRepository.findByAbbrev(from);
        Currency.incrementRequested(currency);
        if (from != to) {
            currency = currencyRepository.findByAbbrev(to);
            Currency.incrementRequested(currency);
            chart = "https://www.tradingview.com/symbols/"+from+to+"/";
        }
        currencyRepository.save(currency);
        return chart;
    }
}