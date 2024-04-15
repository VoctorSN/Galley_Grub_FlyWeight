package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.Items.Prices;
import edu.badpals.galleygrub.order.Comanda;

import java.util.Optional;

public class CheeseExtra extends Extra{
    private Double CHEESE_PRICE = 0d;

    public void sumExtras(Comanda order) {
        this.CHEESE_PRICE = order.itemList()
                .stream()
                .filter(item -> item.extra().equals(CHEESE))
                .map(item -> Prices.getPrice(item.extra()))
                .reduce(Double::sum)
                .orElse(0d);
        order.updateTotal(this.CHEESE_PRICE);
        if (!(this.nextExtra == null)){
            this.nextExtra.stream().findFirst().get().sumExtras(order);
        }
    }
}
