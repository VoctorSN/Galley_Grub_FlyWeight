package edu.badpals.galleygrub.Items;

import edu.badpals.galleygrub.Items.Item;
import edu.badpals.galleygrub.Items.Product;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static Map<String, Item> itemMap = new HashMap<>();

    ItemFactory() {}

    public static Item getItem(String name, Double price) {
        itemMap.putIfAbsent(name,new Item(name,price));
        return itemMap.get(name);
    }

    public static Item getItem(String name, Double price, String extra) {
        itemMap.putIfAbsent(name + " w/ " + extra,new Item(name,price,extra));
        return itemMap.get(name + " w/ " + extra);
    }

    public static int size(){
        return itemMap.size();
    }

    public static void clear(){
        itemMap.clear();
    }

}