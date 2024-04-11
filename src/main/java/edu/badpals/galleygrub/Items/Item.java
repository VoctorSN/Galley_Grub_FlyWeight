package edu.badpals.galleygrub.Items;

public class Item implements Product{

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

    public Item(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra){
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String toString() {
        return name() + "...." + price() + '$';
    }
}
