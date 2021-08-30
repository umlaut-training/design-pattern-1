package com.umlaut.patterntraining.restaurantmenu.legacy;

public class SpecialSoupOffer {
    public static final SpecialSoupOffer LENTIL_SOUP = new SpecialSoupOffer(12.99, "Lentil soup");

    private final double cost;
    private final String offerName;

    public SpecialSoupOffer(double cost, String offerName) {
        this.cost = cost;
        this.offerName = offerName;
    }

    public double getCost() {
        return cost;
    }

    public String getOfferName() {
        return "THE BEST: " + offerName;
    }

}
