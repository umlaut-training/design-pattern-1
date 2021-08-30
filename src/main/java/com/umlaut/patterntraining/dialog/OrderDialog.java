package com.umlaut.patterntraining.dialog;

import com.umlaut.patterntraining.dialogresult.Order;
import com.umlaut.patterntraining.restaurantmenu.RestaurantMenu;
import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;

import javax.swing.*;
import java.awt.*;

import static java.text.NumberFormat.getCurrencyInstance;

public class OrderDialog extends AbstractStateDialog {
    private final JPanel orderContainer = createOrderMenu();
    private JComboBox<MenuItemAdapter> menuItems;
    private JCheckBox bread;
    private JCheckBox salt;

    @Override
    public Order getResult() {
        // Builder exercise: fill the builder with getSelectedItem(), salt.isSelected(), bread.isSelected()
        return new Order();
    }

    @Override
    protected String getGoOnButtonText() {
        return "place order";
    }

    @Override
    protected JComponent getStateSpecificDialog() {
        return orderContainer;
    }

    @Override
    protected ImageIcon getSymbolImage() {
        return SymbolImage.ORDER.getIcon();
    }

    private JPanel createOrderMenu() {
        JPanel orderMenu = new JPanel();
        orderMenu.setLayout(new GridLayout(3, 1));
        menuItems = new JComboBox<>(getMenuItems());
        menuItems.setMaximumSize(new Dimension(150, 20));
        bread = new JCheckBox("Bread (2,50 €)");
        salt = new JCheckBox("Salt (0,50 €)");
        orderMenu.add(menuItems);
        orderMenu.add(bread);
        orderMenu.add(salt);

        return orderMenu;
    }

    private MenuItem getSelectedItem() {
        return ((MenuItemAdapter) menuItems.getSelectedItem()).item;
    }

    private MenuItemAdapter[] getMenuItems() {
        return RestaurantMenu.ITEMS.stream().map(MenuItemAdapter::new).toArray(MenuItemAdapter[]::new);
    }

    private static class MenuItemAdapter {
        final MenuItem item;

        MenuItemAdapter(MenuItem item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return item.getDescription() + " " + getCurrencyInstance().format(item.getPrice());
        }
    }
}
