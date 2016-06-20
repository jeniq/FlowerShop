package com.company.Model;

import java.util.List;

/**
 * This class set of methods for creating bouquet, adding flowers, accessories
 * and removing bouquet.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public abstract class BouquetMaker {
    abstract Bouquet makeBouquet();
    abstract List<Flower> addFlowers(Flower... flowers);
    abstract List<Accessory> addAccessories(Accessory... accessories);
    abstract void removeBouquet(Bouquet bouquet);
}
