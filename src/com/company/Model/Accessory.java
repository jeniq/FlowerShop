package com.company.Model;

/**
 * This class contains accessory for bouquet
 * and their prices.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public enum Accessory {
    POT(20), WRAP(10), RIBBON(5), BASKET(15);

    private final int price;

    Accessory(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
