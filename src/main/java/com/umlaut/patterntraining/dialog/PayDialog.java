package com.umlaut.patterntraining.dialog;

import javax.swing.*;

import static java.text.NumberFormat.getCurrencyInstance;

public class PayDialog extends AbstractStateDialog {
    private final JLabel billLabel = new JLabel();

    @Override
    public void initDialog() {
        super.initDialog();
        setBill(0);
    }

    @Override
    public Integer getResult() {
        return 0;
    }

    public void setBill(double bill) {
        billLabel.setText("Bill: " + getCurrencyInstance().format(bill));
    }

    @Override
    protected String getGoOnButtonText() {
        return "pay and leave restaurant";
    }

    @Override
    protected JComponent getStateSpecificDialog() {
        return billLabel;
    }

    @Override
    protected ImageIcon getSymbolImage() {
        return SymbolImage.PAY.getIcon();
    }
}
