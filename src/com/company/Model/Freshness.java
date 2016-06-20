package com.company.Model;

/**
 * This class contains levels of flower's freshness and coefficient for price.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public enum Freshness {
    VERY_FRESH(1.5),
    FRESH(1),
    BAD(0.8),
    WILTED(0.5);

    public final double coefficient;

    Freshness(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
