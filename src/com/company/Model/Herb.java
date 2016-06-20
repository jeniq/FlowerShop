package com.company.Model;

/**
 * This class contains additional herbs for bouquet
 * and their prices.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public enum Herb {
    BRANCH(5),
    BUSH(10);

    private final int price;

    Herb(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
