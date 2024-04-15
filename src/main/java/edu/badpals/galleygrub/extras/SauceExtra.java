package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.Items.Prices1;
import edu.badpals.galleygrub.order.Comanda;

public class SauceExtra extends Extra{
    private Double SAUCE_PRICE = 0d;

    public void sumExtras(Comanda order) {
        this.SAUCE_PRICE = order.itemList()
                .stream()
                .filter(item -> item.extra().equals(SAUCE))
                .map(item -> Prices1.getPrice(item.extra()))
                .reduce(Double::sum)
                .orElse(0d);
        order.updateTotal(this.SAUCE_PRICE);
        if (!(this.nextExtra == null)){
            this.nextExtra.stream().findFirst().get().sumExtras(order);
        }
    }
}
