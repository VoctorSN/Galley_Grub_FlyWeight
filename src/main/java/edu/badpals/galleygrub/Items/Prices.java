package edu.badpals.galleygrub.Items;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prices {
    static Map<String, Double> prices = new HashMap<>();

    public Prices(){

    }

    public static void init_prices(){
        prices.put("cheese", 0.25d);
        prices.put("sauce", 0.50d);
        prices.put("medium", 0.25d);
        prices.put("large", 0.50d);
    }

    public static Double getPrice(String product){
        return prices.get(product);
    }

    public static boolean contains(String item){
        return prices.containsKey(item);
    }

    public static void display(){
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println("\t" +entry);
        }
    }

}