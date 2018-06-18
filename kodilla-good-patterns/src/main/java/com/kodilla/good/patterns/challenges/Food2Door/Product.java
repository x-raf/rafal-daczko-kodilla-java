package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {
    private String productName;
    private int productId;

    public Product(String productName, int productId) {
        this.productName = productName;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return  productName + ", Id: " + productId + ", ";
    }
}
