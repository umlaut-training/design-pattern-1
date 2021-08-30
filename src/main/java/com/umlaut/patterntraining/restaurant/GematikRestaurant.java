package com.umlaut.patterntraining.restaurant;

import com.umlaut.patterntraining.resources.ImageResourceLoader;

public class GematikRestaurant extends AbstractRestaurant {
    public void initGematikSpecial() {
        mainFrame.setIconImage(ImageResourceLoader.loadImageResource("Gematik_Logo.png"));
    }
}
