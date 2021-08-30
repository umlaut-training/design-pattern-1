package com.umlaut.patterntraining.state;

import java.beans.PropertyChangeEvent;

public class PayState implements IState {
    private final RestaurantContext context;

    public PayState(RestaurantContext context) {
        this.context = context;
    }

    @Override
    public void enterState() {
        double bill = context.getBill().getTotal();
        context.getDialog().getPayDialog().setBill(bill);
        context.getDialog().showPayDialog();
    }

    @Override
    public void goOn(PropertyChangeEvent evt) {
        System.exit(0);
    }
}
