package com.umlaut.patterntraining.bill;

import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;

public class AdditionalSoupBillDecorator extends AbstractBillDecorator {
    private final double additionalSoupCost;

    public AdditionalSoupBillDecorator(IBill toDecorate, MenuItem additionalSoup) {
        super(toDecorate);
        additionalSoupCost = additionalSoup.getPrice();
    }

    @Override
    public double getTotal() {
        return decoratedComponent.getTotal() + additionalSoupCost;
    }
}
