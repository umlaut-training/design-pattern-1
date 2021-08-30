package com.umlaut.patterntraining.dialog;

import javax.swing.*;
import java.awt.*;

public class RestaurantDialog {
    private static final String ORDER_DIALOG_NAME = "order";
    private static final String EAT_DIALOG_NAME = "eat";
    private static final String PAY_DIALOG_NAME = "pay";

    private final JPanel mainPanel = new JPanel();
    private final CardLayout stateCardLayout = new CardLayout();

    private final OrderDialog orderDialog = new OrderDialog();
    private final EatDialog eatDialog = new EatDialog();
    private final PayDialog payDialog = new PayDialog();


    public void initDialog() {
        orderDialog.initDialog();
        eatDialog.initDialog();
        payDialog.initDialog();

        mainPanel.setLayout(stateCardLayout);
        mainPanel.add(orderDialog, ORDER_DIALOG_NAME);
        mainPanel.add(eatDialog, EAT_DIALOG_NAME);
        mainPanel.add(payDialog, PAY_DIALOG_NAME);
    }

    public void showOrderDialog() {
        showDialog(ORDER_DIALOG_NAME);
    }

    public void showEatDialog() {
        showDialog(EAT_DIALOG_NAME);
    }

    public void showPayDialog() {
        showDialog(PAY_DIALOG_NAME);
    }

    public OrderDialog getOrderDialog() {
        return orderDialog;
    }

    public EatDialog getEatDialog() {
        return eatDialog;
    }

    public PayDialog getPayDialog() {
        return payDialog;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void showDialog(String dialogName) {
        stateCardLayout.show(mainPanel, dialogName);
    }
}
