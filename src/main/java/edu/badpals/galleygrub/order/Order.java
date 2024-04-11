package edu.badpals.galleygrub.order;

import edu.badpals.galleygrub.Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total = 0d;
    private List<Item> items = new ArrayList<>();

    public Order(){}

    @Override
    public void addItem(String item, Double price) {

    }

    @Override
    public void addItem(String item, Double price, String extra) {

    }

    @Override
    public int size() {
        return itemList().size();
    }

    @Override
    public List<Item> itemList() {
        return this.items;
    }

    @Override
    public Double getTotal() {
        return this.total;
    }

    @Override
    public void updateTotal(Double total) {

    }

    @Override
    public void display() {

    }
}
