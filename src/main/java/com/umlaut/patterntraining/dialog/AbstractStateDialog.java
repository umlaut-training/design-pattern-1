package com.umlaut.patterntraining.dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class AbstractStateDialog extends JPanel {
    // we could also use the PropertyChangeSupport from JPanel
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void initDialog() {
        setBackground(Color.white);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 2;
        add(new JLabel(getSymbolImage()), c);
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        add(createGoOnButton(), c);
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        add(getStateSpecificDialog(), c);

        setVisible(false);
    }

    public void addResultListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener("result", listener);
    }

    private JButton createGoOnButton() {
        JButton goOnButton = new JButton();
        goOnButton.addActionListener(this::onGoOnButtonClick);
        goOnButton.setText(getGoOnButtonText());
        return goOnButton;
    }

    protected abstract Object getResult();

    protected abstract String getGoOnButtonText();

    protected abstract JComponent getStateSpecificDialog();

    protected abstract ImageIcon getSymbolImage();

    private void onGoOnButtonClick(ActionEvent e) {
        propertyChangeSupport.firePropertyChange("result", null, getResult());
    }
}
