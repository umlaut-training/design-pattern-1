package com.umlaut.patterntraining.state;

import java.beans.PropertyChangeEvent;

public class PayState implements IState {
    private final RestaurantContext context;

    public PayState(RestaurantContext context) {
        this.context = context;
    }

    @Override
    public void enterState() {
        // State exercise: implement method
    }

    @Override
    public void goOn(PropertyChangeEvent evt) {
        // State exercise: implement method
    }
}
