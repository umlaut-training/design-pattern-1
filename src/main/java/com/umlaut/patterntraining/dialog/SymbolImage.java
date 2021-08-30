package com.umlaut.patterntraining.dialog;

import javax.swing.*;

import static com.umlaut.patterntraining.resources.ImageResourceLoader.loadImageResource;

  enum SymbolImage {
    ORDER("order.jpg"),
    PAY("pay.jpg"),
    EAT("eat.jpg");

    SymbolImage(String fileName) {
        icon = new ImageIcon(loadImageResource(fileName));
    }

    private final ImageIcon icon;

    ImageIcon getIcon() {
        return icon;
    }
}
