package com.umlaut.patterntraining.dialogresult;

import com.umlaut.patterntraining.restaurantmenu.legacy.MenuItem;

public class Order {
    // datatypes used in builder pattern are immutable in general
    private MenuItem soup;
    private Boolean withBread;
    private Boolean withSalt;

    private Order() {
    }

    public MenuItem getSoup() {
        return soup;
    }

    public boolean isWithBread() {
        return withBread;
    }

    public boolean isWithSalt() {
        return withSalt;
    }

    public static class Builder extends AbstractBuilder<Order> {
        public Builder() {
            super(new Order());
        }

        @Override
        protected void validate(Order toValidate) {
            // typically general validations like null checks are done via reflection in the base class
            // and a concrete builder just checks against domain specific logic
            rejectIfNull(toValidate.soup, "soup");
            rejectIfNull(toValidate.withBread, "withBread");
            rejectIfNull(toValidate.withSalt, "withSalt");
        }

        private void rejectIfNull(Object toCheck, String name) {
            if (toCheck == null) {
                throw new RuntimeException(name + " must not be null");
            }
        }

        public Builder withSoup(MenuItem soup) {
            bean.soup = soup;
            return this;
        }

        public Builder withBread(boolean withBread) {
            bean.withBread = withBread;
            return this;
        }

        public Builder withSalt(boolean withSalt) {
            bean.withSalt = withSalt;
            return this;
        }
    }
}
