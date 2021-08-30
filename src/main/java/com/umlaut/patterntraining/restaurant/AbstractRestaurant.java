package com.umlaut.patterntraining.restaurant;

import com.umlaut.patterntraining.dialog.RestaurantDialog;
import com.umlaut.patterntraining.state.RestaurantState;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractRestaurant {
    protected final JFrame mainFrame = new JFrame("Restaurant");
    protected final RestaurantDialog mainDialog = new RestaurantDialog();
    protected final RestaurantState restaurantState = new RestaurantState();

    public void enterRestaurant() {
        // State exercise: use RestaurantContext instead
        restaurantState.init(mainDialog);
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
