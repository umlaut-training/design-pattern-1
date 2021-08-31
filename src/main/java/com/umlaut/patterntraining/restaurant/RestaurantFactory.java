package com.umlaut.patterntraining.restaurant;

public class RestaurantFactory {
    public AbstractRestaurant createRestaurant(String choice) {
        if ("gematik".equals(choice)) {
            GematikRestaurant restaurant = new GematikRestaurant();
            restaurant.initCommon();
            restaurant.initGematikSpecial();
            return restaurant;
        } else if ("umlaut".equals(choice)) {
            UmlautRestaurant restaurant = new UmlautRestaurant();
            restaurant.initCommon();
            restaurant.initUmlautSpecial();
            return restaurant;
        } else {
            return new AbstractRestaurant() {
            };
        }
    }
}
