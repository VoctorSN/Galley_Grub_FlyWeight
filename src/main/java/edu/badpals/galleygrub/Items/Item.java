package edu.badpals.galleygrub.Items;

public class Item implements Product {

    String name = "";

    Double price = 0d;

    String extra = "";

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return extra().isEmpty();
    }

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name + " w/ " + extra;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String toString() {
        if (this.extra.isEmpty()) {
            return name() + "...." + String.format("%.2f", price()) + '$';
        } else {
            return name() + "...." + String.format("%.2f", price()) + "$ + " + String.format("%.2f", Prices.getPrice(extra)) + '$';
        }
    }
}