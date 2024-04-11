package edu.badpals.galleygrub.order;

import edu.badpals.galleygrub.Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total = 0d;
    private List<Item> items = new ArrayList<>();

    public Order(){}

    @Override
    public void addItem(String name, Double price) {
        this.items.add(ItemFactory.getItem(name,price));
    }

    @Override
    public void addItem(String name, Double price, String extra) {
        this.items.add(ItemFactory.getItem(name,price,extra));
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
        this.total += total;
    }

    @Override
    public void display() {
        itemList().forEach(System.out::println);
    }
}
