package edu.badpals.galleygrub.order;

import edu.badpals.galleygrub.Items.Item;

import java.util.List;

public interface Comanda {
    void addItem(String item, Double price);

    void addItem(String item, Double price, String extra);

    int size();

    List<Item> itemList();

    Double getTotal();

    void updateTotal(Double total);

    void display();

}
