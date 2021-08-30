package com.umlaut.patterntraining.bill;

import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;

public class SoupBill implements IBill {
    private final double total;

    public SoupBill(MenuItem menuItem) {
        total = menuItem.getPrice();
    }

    @Override
    public double getTotal() {
        return total;
    }
}
