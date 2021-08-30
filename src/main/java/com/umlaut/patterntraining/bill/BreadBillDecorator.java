package com.umlaut.patterntraining.bill;

public class BreadBillDecorator extends AbstractBillDecorator {
    public BreadBillDecorator(IBill toDecorate) {
        super(toDecorate);
    }

    @Override
    public double getTotal() {
        return decoratedComponent.getTotal() + 2.5;
    }
}
