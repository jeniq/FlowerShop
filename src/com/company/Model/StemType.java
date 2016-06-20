package com.company.Model;

/**
 * This class contains types of stem and coefficients of their price.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public enum StemType {
    NO_STEM(1),
    SHORT(1.1),
    MIDDLE(1.3),
    LONG(1.5);

    private final double coefficient;

    StemType(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
