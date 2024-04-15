package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.order.Comanda;

import java.util.Optional;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";
    Optional<Extra> nextExtra;
    String extraProduct;

    Extra(){}

    public void setNextExtra(Extra extra) {
        nextExtra = Optional.ofNullable(extra);
    }

    public abstract void sumExtras(Comanda order);
}
