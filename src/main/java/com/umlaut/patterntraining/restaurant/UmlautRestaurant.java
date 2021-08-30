package com.umlaut.patterntraining.restaurant;

import com.umlaut.patterntraining.resources.ImageResourceLoader;

public class UmlautRestaurant extends AbstractRestaurant {
    public void initUmlautSpecial() {
        mainFrame.setIconImage(ImageResourceLoader.loadImageResource("umlaut_logo_square.png"));
    }
}
