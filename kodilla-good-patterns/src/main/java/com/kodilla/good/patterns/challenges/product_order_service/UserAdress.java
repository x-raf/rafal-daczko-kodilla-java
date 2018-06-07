package com.kodilla.good.patterns.challenges.product_order_service;

public class UserAdress {
    private String street;
    private String homeNumber;
    private String zipCode;
    private String town;

    public UserAdress(final String street, final String homeNumber, final String zipCode, final String town) {
        this.street = street;
        this.homeNumber = homeNumber;
        this.zipCode = zipCode;
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getTown() {
        return town;
    }

    @Override
    public String toString() {
        return "UserAdress{" +
                "street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
