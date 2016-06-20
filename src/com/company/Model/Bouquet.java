package com.company.Model;

import java.util.List;

/**
 * This class performs work with bouquet.
 * Bouquet contains flowers and different accessories.
 * It has a price.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public class Bouquet {
    private List<Flower> flowers;
    private List<Accessory> accessories;
    private BouquetPriceType type;
    private BouquetEventType event;
    private StemType stem;

    public Bouquet(List<Flower> flowers, BouquetPriceType type, BouquetEventType event, StemType stem) {
        this.flowers = flowers;
        this.type = type;
        this.event = event;
        this.stem = stem;
    }

    public void setAccessories(Accessory... accessories) {
        for (Accessory a : accessories){
            this.accessories.add(a);
        }
    }

    public double getPrice() {
        double price = 0;

        for (Flower f : flowers){
            price += f.getPrice()
                    * f.getFreshness().getCoefficient()
                    * f.getStemLength().getCoefficient(); // price depends on freshness
        }

        return price;
    }
}
