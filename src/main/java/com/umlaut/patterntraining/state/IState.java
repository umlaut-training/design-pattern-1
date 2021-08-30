package com.umlaut.patterntraining.state;

import java.beans.PropertyChangeEvent;

public interface IState {
    void enterState();
    void goOn(PropertyChangeEvent evt);
}
