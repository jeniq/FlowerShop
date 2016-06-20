package com.company.Controller;

import com.company.Controller.Initialization.Initialize;
import com.company.Model.Shop;
import com.company.View.View;

/**
 * This class executes work in flower shop.
 * It initialize flowers to shop, show flowers to console
 * and remove wilted flowers from the shop.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public class Controller {
    private Shop shop;
    private Initialize initialize;
    private View view;

    public Controller(Shop shop, Initialize initialize, View view) {
        this.shop = shop;
        this.initialize = initialize;
        this.view = view;
    }

    // The work method
    public void processUser(){
        initialize.initFlowersToShop(shop);
        view.print(shop.getFlowers().toString());
        shop.checkFreshness();
        view.print(shop.getFlowers().toString());
    }

}
