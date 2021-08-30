package com.umlaut.patterntraining.restaurant;

public class UmlautRestaurantFactory extends AbstractRestaurantFactory {
    @Override
    protected AbstractRestaurant factoryMethod() {
        UmlautRestaurant restaurant = new UmlautRestaurant();
        restaurant.initUmlautSpecial();
        return restaurant;
    }
}
