package com.umlaut.patterntraining.state;

import com.umlaut.patterntraining.dialog.RestaurantDialog;
import com.umlaut.patterntraining.bill.IBill;

public class RestaurantContext {
    public final IState orderState = new OrderState(this);
    public final IState eatState = new EatState(this);
    public final IState payState = new PayState(this);

    private IState state;
    private RestaurantDialog dialog;
    private IBill bill = () -> 0;

    public void enterRestaurant(RestaurantDialog dialog) {
        this.dialog = dialog;
        state = orderState;
        state.enterState();
    }

    public IBill getBill() {
        return bill;
    }

    public void setBill(IBill bill) {
        this.bill = bill;
    }

    public RestaurantDialog getDialog() {
        return dialog;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
