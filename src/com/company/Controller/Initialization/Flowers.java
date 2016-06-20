package com.company.Controller.Initialization;

import com.company.Model.StemType;

/**
 * This interface set initialization data with flowers.
 */
public interface Flowers {
    // Roses
    int ROSE = 55;
    int ROSE_PRICE = 35;
    StemType ROSE_STEM = StemType.MIDDLE;

    // Orchid
    int ORCHID = 5;
    int ORCHID_PRICE = 120;
    StemType ORCHID_STEM = StemType.LONG;

    // Gerbera
    int GERBERA = 85;
    int GERBERA_PRICE = 15;
    StemType GERBERA_STEM = StemType.SHORT;

    // Carnation
    int CARNATION = 30;
    int CARNATION_PRICE = 12;
    StemType CARNATION_STEM = StemType.MIDDLE;
}
