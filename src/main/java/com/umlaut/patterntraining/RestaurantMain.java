package com.umlaut.patterntraining;

import com.umlaut.patterntraining.restaurant.AbstractRestaurant;
import com.umlaut.patterntraining.restaurant.RestaurantFactory;

public class RestaurantMain {
    public static void main(String[] args) {
        AbstractRestaurant restaurant = new RestaurantFactory().createRestaurant(parseInput(args));
        restaurant.enterRestaurant();
    }

    private static String parseInput(String[] args) {
        return args.length > 0 ? args[0] : "unknown";
    }
}
