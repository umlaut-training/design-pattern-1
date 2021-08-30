package com.umlaut.patterntraining.bill;

public class SaltBillDecorator extends AbstractBillDecorator {
    public SaltBillDecorator(IBill toDecorate) {
        super(toDecorate);
    }

    @Override
    public double getTotal() {
        return decoratedComponent.getTotal() + 0.5;
    }
}
