package edu.badpals.galleygrub.Items;

public enum Prices {
    CHEESE(0.25d),SAUCE(0.5d),MEDIUM(0.25d),LARGE(0.5d);

    private final Double price;

    private Prices(Double price){
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
