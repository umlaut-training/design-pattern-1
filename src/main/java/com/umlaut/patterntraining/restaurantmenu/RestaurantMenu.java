package com.umlaut.patterntraining.restaurantmenu;

import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;
import com.umlaut.patterntraining.restaurantmenu.legacy.Soup;
import com.umlaut.patterntraining.restaurantmenu.legacy.SpecialSoupOffer;

import java.util.Arrays;
import java.util.List;

public class RestaurantMenu {
    public static final List<MenuItem> ITEMS = Arrays.asList(
            new Soup(5, "Onion soup"),
            new Soup(3.2, "Cheese soup"),
            new Soup(4.75, "Tomato soup"),
            new SpecialSoupOfferAdapter(SpecialSoupOffer.LENTIL_SOUP)
    );
}
