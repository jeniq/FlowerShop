package com.company.Controller.Initialization;

import com.company.Model.Flower;
import com.company.Model.Freshness;
import com.company.Model.Shop;

import java.util.Random;

/**
 * This class initialize flower's data to shop.
 */
public class Initialize {
    /**
     * This method initialize flowers to shop.
     * @param shop selected shop.
     */
    public void initFlowersToShop(Shop shop){
        // init roses
        for (int  i = 0; i < Flowers.ROSE; i++){
            shop.addFlower(new Flower("Rose", true, randomFreshness(), Flowers.ROSE_PRICE, Flowers.ROSE_STEM,
                    false, true));
        }
        // init orchid
        for (int  i = 0; i < Flowers.ORCHID; i++){
            shop.addFlower(new Flower("Orchid", false, randomFreshness(), Flowers.ORCHID_PRICE, Flowers.ORCHID_STEM,
                    true, true));
        }
        // init gerbera
        for (int  i = 0; i < Flowers.GERBERA; i++){
            shop.addFlower(new Flower("Gerbera", true, randomFreshness(), Flowers.GERBERA_PRICE, Flowers.GERBERA_STEM,
                    false, true));
        }
        // init carnation
        for (int  i = 0; i < Flowers.CARNATION; i++){
            shop.addFlower(new Flower("Carnation", true, randomFreshness(),
                    Flowers.CARNATION_PRICE, Flowers.CARNATION_STEM, false, false));
        }
    }

    /**
     * This method selects flower's freshness by random.
     * @return flower's freshness
     */
    public Freshness randomFreshness(){
        Random random = new Random();
        Freshness[] freshness = Freshness.values();
        return freshness[random.nextInt(freshness.length)];
    }
}
