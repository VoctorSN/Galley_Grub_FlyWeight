package edu.badpals.galleygrub.Items;

import edu.badpals.galleygrub.Items.Item;
import edu.badpals.galleygrub.Items.Product;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static Map<String, Item> itemMap = new HashMap<>();

    ItemFactory() {}

    public static Item getItem(String name, Double price) {
        if (!itemMap.containsKey(name)){
            Item item = new Item(name,price);
            itemMap.put(name,item);
            return item;
        } else {
            return itemMap.get(name);
        }
    }

    public static Item getItem(String name, Double price, String extra) {
        if (!itemMap.containsKey(name+ " w/ "+ extra)){
            Item item = new Item(name,price,extra);
            itemMap.put(name,item);
            return item;
        } else {
            return itemMap.get(name);
        }
    }

    public static int size(){
        return itemMap.size();
    }

    public static void clear(){
        itemMap.clear();
    }

}