package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.extras.Extra;
import edu.badpals.galleygrub.order.Comanda;

public class Receipt implements Ticket{

    private Double total = 0d;
    private Comanda order = null;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public void setChain(Extra chain) {

    }

    @Override
    public Extra getChain() {
        return null;
    }

    @Override
    public Double total() {
        getOrder().itemList().forEach(item -> {
            total += item.price();
        });
        return total;
    }

    @Override
    public void sumExtrasChange() {

    }

    @Override
    public void print() {
        System.out.println("\t" +"TOTAL" + " --------> "+ String.format("%.2f", total) + '$');
    }
}
