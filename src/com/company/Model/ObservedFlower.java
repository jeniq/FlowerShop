package com.company.Model;

import java.util.List;

/**
 * This interface set methods to observing
 * flower state.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public interface ObservedFlower {
    void addFlower(Flower o);
    void removeFlowers(List<Flower> flowerList);
    void checkFreshness();
    void notifyObservers(Flower o);
}
