package com.example.exchangerateservice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Currency {
    @Id
    @Column(name = "currency_id")
    private Long currencyId;

    private String abbrev;
    private String name;
    private Integer requested;

    @OneToMany(mappedBy = "from")
    private List<Exchange> from;

    @OneToMany(mappedBy = "to")
    private List<Exchange> to;

    public Currency(){}

    public Currency(Long id, String abbrev, String name, Integer requested) {
        this.currencyId = id;
        this.abbrev = abbrev;
        this.name = name;
        this.requested = requested;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public String getName() {
        return name;
    }

    public Integer getRequested() {
        return requested;
    }

    public void setRequested(Integer requested) {
        this.requested = requested;
    }

    public static void incrementRequested(Currency currency){
        currency.setRequested(currency.getRequested()+1);
    }

}
