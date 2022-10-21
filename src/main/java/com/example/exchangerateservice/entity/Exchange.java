package com.example.exchangerateservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Exchange {

    @Id
    @Column(name = "exchange_id")
    private Long exchangeId;

    @ManyToOne
    @JoinColumn(name = "currency_from")
    private Currency from;

    @ManyToOne
    @JoinColumn(name = "currency_to")
    private Currency to;

    private BigDecimal rate;
    private BigDecimal quantity;
    private BigDecimal total;

    public Exchange() {

    }

    public Exchange(Long exchangeId, Currency from, Currency to, BigDecimal rate, BigDecimal quantity, BigDecimal total) {
        this.exchangeId = exchangeId;
        this.rate = rate;
        this.quantity = quantity;
        this.total = total;
        this.from = from;
        this.to = to;
    }

    public Long getExchangeId() {
        return exchangeId;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        this.setTotal(quantity.multiply(rate));
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}