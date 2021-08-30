package com.umlaut.patterntraining.restaurantmenu;

import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;
import com.umlaut.patterntraining.restaurantmenu.legacy.SpecialSoupOffer;

public class SpecialSoupOfferAdapter implements MenuItem {
    private final SpecialSoupOffer adaptee;

    public SpecialSoupOfferAdapter(SpecialSoupOffer adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getPrice() {
        return adaptee.getCost();
    }

    @Override
    public String getDescription() {
        return adaptee.getOfferName();
    }
}
