package com.company;

import com.company.Controller.Controller;
import com.company.Controller.Initialization.Initialize;
import com.company.Model.Shop;
import com.company.View.View;

public class Main {

    public static void main(String[] args) {
	    // Initialization
        Shop shop = new Shop();
        Initialize initialize = new Initialize();
        View view = new View();
        Controller controller = new Controller(shop, initialize, view);

        // Run
        controller.processUser();
    }
}
