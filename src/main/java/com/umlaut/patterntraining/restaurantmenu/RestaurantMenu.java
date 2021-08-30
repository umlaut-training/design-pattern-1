package com.umlaut.patterntraining.restaurantmenu;

import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;
import com.umlaut.patterntraining.restaurantmenu.legacy.Soup;

import java.util.Arrays;
import java.util.List;

public class RestaurantMenu {
    public static final List<MenuItem> ITEMS = Arrays.asList(
            new Soup(5, "Onion soup"),
            new Soup(3.2, "Cheese soup"),
            new Soup(4.75, "Tomato soup")
            // Adapter exercise:
            // Add LENTIL_SOUP from SpecialSoupOffer with an adapter
            // Don't change code in the legacy package
    );
}
