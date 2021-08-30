package com.umlaut.patterntraining.dialog;

import com.umlaut.patterntraining.dialogresult.EatMore;

import javax.swing.*;

public class EatDialog extends AbstractStateDialog {
    private final JCheckBox eatMore = new JCheckBox("Eat more");

    @Override
    public EatMore getResult() {
        return eatMore.isSelected() ? EatMore.YES : EatMore.NO;
    }

    @Override
    protected String getGoOnButtonText() {
        return "eat";
    }

    @Override
    protected JComponent getStateSpecificDialog() {
        return eatMore;
    }

    @Override
    protected ImageIcon getSymbolImage() {
        return SymbolImage.EAT.getIcon();
    }
}
