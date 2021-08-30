package com.umlaut.patterntraining;

import com.umlaut.patterntraining.restaurant.UmlautRestaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        // Factory exercise: use Factory to create the restaurant depending on args
        UmlautRestaurant umlautRestaurant = new UmlautRestaurant();
        // Factory exercise: init shall be called in the general factory
        umlautRestaurant.initCommon();
        // Factory exercise: this shall be called in the type specific factory
        umlautRestaurant.initUmlautSpecial();
        umlautRestaurant.enterRestaurant();
    }
}
