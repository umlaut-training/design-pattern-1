package com.umlaut.patterntraining;

import com.umlaut.patterntraining.restaurant.AbstractRestaurant;
import com.umlaut.patterntraining.restaurant.AbstractRestaurantFactory;

public class RestaurantMain {
    public static void main(String[] args) {
        AbstractRestaurant restaurant = AbstractRestaurantFactory.createRestaurant(parseInput(args));
        restaurant.enterRestaurant();
    }

    private static String parseInput(String[] args) {
        return args.length > 0 ? args[0] : "unknown";
    }
}
