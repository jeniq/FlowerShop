package com.company.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class executes actions in shop.
 * It implements observer pattern.
 * It contains method to check every flower in shop and notify
 * in case they are wilted.
 * If flower is wilted, it removes from shop.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public class Shop extends BouquetMaker implements ObservedFlower{
    List<Flower> flowers = new ArrayList<>();

    @Override
    public void addFlower(Flower o) {
        flowers.add(o);
    }

    @Override
    public void checkFreshness() {
        List<Flower> removeList = new ArrayList<>();
        for (Flower f : flowers){
            if (f.getFreshness().equals(Freshness.WILTED)){
                notifyObservers(f);
                removeList.add(f);
            }
        }
        removeFlowers(removeList);
    }

    @Override
    public void removeFlowers(List<Flower> removeFlowers){
        for (Flower f : removeFlowers){
            flowers.remove(f);
        }
    }

    @Override
    public void notifyObservers(Flower o) {
            o.handleEvent();
    }

    @Override
    public Bouquet makeBouquet() {
        return null;
    }

    @Override
    public List<Flower> addFlowers(Flower... flowers) {
        return null;
    }

    @Override
    public List<Accessory> addAccessories(Accessory... accessories) {
        return null;
    }

    @Override
    public void removeBouquet(Bouquet bouquet) {

    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    @Override
    public String toString() {
        return flowers.toString();
    }
}
