package com.umlaut.patterntraining.state;

import com.umlaut.patterntraining.dialogresult.EatMore;
import com.umlaut.patterntraining.dialogresult.Order;
import com.umlaut.patterntraining.bill.IBill;
import com.umlaut.patterntraining.bill.SoupBill;
import com.umlaut.patterntraining.dialog.RestaurantDialog;

import java.beans.PropertyChangeEvent;

public class RestaurantState {

    // State exercise: refactor this code to use state pattern
    private StateName state;
    private IBill bill = () -> 0;
    private RestaurantDialog dialog;

    public void init(RestaurantDialog dialog) {
        this.dialog = dialog;
        dialog.showOrderDialog();
        state = StateName.ORDER;
        // Observer exercise: register the goOn method as PropertyChangeListener for the subdialogs
    }

    public void goOn(PropertyChangeEvent evt) {
        if (state == StateName.ORDER) {
            Order order = (Order) evt.getNewValue();
            // Decorator exercise: calculate correct bill with decorator
            bill = new SoupBill(order.getSoup());
            dialog.showEatDialog();
            state = StateName.EAT;
        } else if (state == StateName.EAT) {
            EatMore eatMore = (EatMore) evt.getNewValue();
            if (eatMore == EatMore.YES) {
                dialog.showOrderDialog();
                state = StateName.ORDER;
            } else {
                dialog.getPayDialog().setBill(bill.getTotal());
                dialog.showPayDialog();
                state = StateName.PAY;
            }
        } else if (state == StateName.PAY) {
            System.exit(0);
        }
    }
}

