package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.Items.Item;
import edu.badpals.galleygrub.Items.Prices;
import edu.badpals.galleygrub.order.Comanda;

import java.util.Optional;

public class SizeLargeExtra extends Extra {
    private Double SIZE_PRICE = 0d;

    public void sumExtras(Comanda order) {
        this.SIZE_PRICE = order.itemList()
                .stream()
                .filter(item -> item.extra().equals(SIZE_LARGE))
                .map(item -> Prices.getPrice(item.extra()))
                .reduce(Double::sum)
                .orElse(0d);
        order.updateTotal(this.SIZE_PRICE);
        if (!(this.nextExtra == null)){
            this.nextExtra.stream().findFirst().get().sumExtras(order);
        }
    }
}
