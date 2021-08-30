package com.umlaut.patterntraining.bill;

public abstract class AbstractBillDecorator implements IBill {
    protected final IBill decoratedComponent;

    public AbstractBillDecorator(IBill toDecorate) {
        this.decoratedComponent = toDecorate;
    }
}
