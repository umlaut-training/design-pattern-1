package com.umlaut.patterntraining.state;

import com.umlaut.patterntraining.bill.AdditionalSoupBillDecorator;
import com.umlaut.patterntraining.bill.BreadBillDecorator;
import com.umlaut.patterntraining.bill.IBill;
import com.umlaut.patterntraining.bill.SaltBillDecorator;
import com.umlaut.patterntraining.dialogresult.Order;

import java.beans.PropertyChangeEvent;

public class OrderState implements IState {
    private final RestaurantContext context;

    public OrderState(RestaurantContext context) {
        this.context = context;
    }

    @Override
    public void enterState() {
        context.getDialog().showOrderDialog();
    }

    @Override
    public void goOn(PropertyChangeEvent evt) {
        Order order = (Order) evt.getNewValue();
        IBill newBill = decorateBill(context.getBill(), order);
        context.setBill(newBill);
        context.setState(context.eatState);
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
