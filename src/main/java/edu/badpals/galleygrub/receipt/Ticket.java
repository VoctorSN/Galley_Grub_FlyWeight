package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.extras.Extra;
import edu.badpals.galleygrub.order.Comanda;

public interface Ticket {
    Comanda getOrder();

    void setChain(Extra chain);

    Extra getChain ();

    Double total();

    void sumExtrasChange();

    void print();
}
