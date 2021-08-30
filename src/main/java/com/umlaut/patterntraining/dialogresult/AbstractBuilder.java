package com.umlaut.patterntraining.dialogresult;

public class AbstractBuilder<BEAN> {
    protected BEAN bean;

    public AbstractBuilder(BEAN bean)
    {
        this.bean = bean;
    }

    // A more convenient way would be to offer a method for adding a validator, but I hope this demonstrates the principle
    protected void validate(BEAN toValidate)
    {
        /*Empty default;*/
    }

    public final BEAN build()
    {
        validate(bean);
        BEAN returnValue = bean;
        bean = null;
        return returnValue;
    }
}
