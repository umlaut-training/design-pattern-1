package com.umlaut.patterntraining.restaurant;

public abstract class AbstractRestaurantFactory {
    public static AbstractRestaurant createRestaurant(String choice) {
        if("gematik".equals(choice))
        {
            return new GematikRestaurantFactory().createRestaurant();
        }
        else if("umlaut".equals(choice))
        {
            return new UmlautRestaurantFactory().createRestaurant();
        }
        else
        {
            return new AbstractRestaurantFactory(){
                @Override
                protected AbstractRestaurant factoryMethod() {
                    return new AbstractRestaurant() {};
                }
            }.createRestaurant();
        }
    }

    protected AbstractRestaurant createRestaurant() {
        AbstractRestaurant restaurant = factoryMethod();
        restaurant.initCommon();
        return restaurant;
    }

    protected abstract AbstractRestaurant factoryMethod();

}
