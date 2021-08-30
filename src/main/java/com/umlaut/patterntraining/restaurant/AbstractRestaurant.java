package com.umlaut.patterntraining.restaurant;

import com.umlaut.patterntraining.dialog.RestaurantDialog;
import com.umlaut.patterntraining.state.RestaurantContext;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractRestaurant {
    protected final JFrame mainFrame = new JFrame("Restaurant");
    protected final RestaurantDialog mainDialog = new RestaurantDialog();
    protected final RestaurantContext restaurantContext = new RestaurantContext();

    public void enterRestaurant() {
        restaurantContext.enterRestaurant(mainDialog);
        mainFrame.setVisible(true);
    }

    public void initCommon() {
        mainDialog.initDialog();
        mainFrame.setSize(350, 200);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.add(mainDialog.getMainPanel());
    }
}
