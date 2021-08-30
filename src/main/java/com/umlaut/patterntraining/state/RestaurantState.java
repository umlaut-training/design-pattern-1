package com.umlaut.patterntraining.state;

import com.umlaut.patterntraining.bill.AdditionalSoupBillDecorator;
import com.umlaut.patterntraining.bill.BreadBillDecorator;
import com.umlaut.patterntraining.bill.IBill;
import com.umlaut.patterntraining.bill.SaltBillDecorator;
import com.umlaut.patterntraining.dialog.RestaurantDialog;
import com.umlaut.patterntraining.dialogresult.EatMore;
import com.umlaut.patterntraining.dialogresult.Order;

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
        dialog.getOrderDialog().addResultListener(this::goOn);
        dialog.getEatDialog().addResultListener(this::goOn);
        dialog.getPayDialog().addResultListener(this::goOn);
    }

    public void goOn(PropertyChangeEvent evt) {
        if (state == StateName.ORDER) {
            Order order = (Order) evt.getNewValue();
            bill = decorateBill(bill, order);
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

    private IBill decorateBill(IBill bill, Order order) {
        bill = new AdditionalSoupBillDecorator(bill, order.getSoup());
        if (order.isWithBread()) {
            bill = new BreadBillDecorator(bill);
        }
        if (order.isWithSalt()) {
            bill = new SaltBillDecorator(bill);
        }
        return bill;
    }
}

