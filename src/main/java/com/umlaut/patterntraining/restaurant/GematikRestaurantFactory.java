package com.umlaut.patterntraining.restaurant;

public class GematikRestaurantFactory extends AbstractRestaurantFactory {
    @Override
    protected AbstractRestaurant factoryMethod() {
        GematikRestaurant restaurant = new GematikRestaurant();
        restaurant.initGematikSpecial();
        return restaurant;
    }
}
