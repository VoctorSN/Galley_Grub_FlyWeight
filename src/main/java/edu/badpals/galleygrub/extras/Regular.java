package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.Items.Item;
import edu.badpals.galleygrub.Items.Prices;
import edu.badpals.galleygrub.order.Comanda;

import java.util.Optional;

public class Regular extends Extra{

    private Double REGULAR_PRICE = 0d;
    public void sumExtras(Comanda order) {
        this.REGULAR_PRICE = order.itemList().stream().map(Item::price).reduce(Double::sum).orElse(0d);
        order.updateTotal(this.REGULAR_PRICE);
        if (!(this.nextExtra == null)){
            this.nextExtra.stream().findFirst().get().sumExtras(order);
        }
    }
}
