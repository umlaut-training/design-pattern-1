package com.umlaut.patterntraining.restaurantmenu.legacy;

public class Soup implements MenuItem {
    private final double price;
    private final String description;

    public Soup(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
