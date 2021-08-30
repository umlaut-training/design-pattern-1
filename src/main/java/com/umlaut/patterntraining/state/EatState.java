package com.umlaut.patterntraining.state;

import com.umlaut.patterntraining.dialogresult.EatMore;

import java.beans.PropertyChangeEvent;

public class EatState implements IState {
    private final RestaurantContext context;

    public EatState(RestaurantContext context) {
        this.context = context;
    }

    @Override
    public void enterState() {
        context.getDialog().showEatDialog();
    }

    @Override
    public void goOn(PropertyChangeEvent evt) {
        EatMore eatMore = (EatMore) evt.getNewValue();
        IState nextState = (eatMore == EatMore.YES) ? context.orderState : context.payState;
        context.setState(nextState);
    }
}
