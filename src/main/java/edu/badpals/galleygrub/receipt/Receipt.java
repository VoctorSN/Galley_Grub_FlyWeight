package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.Items.Item;
import edu.badpals.galleygrub.extras.Extra;
import edu.badpals.galleygrub.order.Comanda;

public class Receipt implements Ticket{
    private Extra chain;
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
        this.chain = chain;
    }

    @Override
    public Extra getChain() {
        return this.chain;
    }

    @Override
    public Double total() {
        if (this.order.getTotal().equals(0d)){
            if (this.getChain() == null){
                return getOrder().itemList().stream().map(Item::price).reduce(Double::sum).orElse(0d);
            } else {
                this.sumExtrasChange();
            }
        }
        return this.order.getTotal();
    }

    @Override
    public void sumExtrasChange() {
       chain.sumExtras(this.order);
    }

    @Override
    public void print() {
        System.out.println("\t" +"TOTAL" + " --------> "+ String.format("%.2f", this.order.getTotal()) + '$');
    }
}
