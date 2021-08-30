package com.umlaut.patterntraining.dialogresult;

import com.umlaut.patterntraining.restaurantmenu.RestaurantMenu;
import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;

public class Order {
    // Builder exercise: implement with builder pattern and correct getter

    public MenuItem getSoup()
    {
        return RestaurantMenu.ITEMS.get(0);
    }

    public boolean isWithBread()
    {
        return true;
    }

    public boolean isWithSalt()
    {
        return true;
    }
}
