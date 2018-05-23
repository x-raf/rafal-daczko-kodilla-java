package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal countryAmountOfPeople;

    public Country(String countryName, BigDecimal countryAmountOfPeople) {
        this.countryName = countryName;
        this.countryAmountOfPeople = countryAmountOfPeople;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return countryAmountOfPeople;
    }
}
