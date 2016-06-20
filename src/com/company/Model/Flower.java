package com.company.Model;

/**
 * This class performs work with flower.
 * It contains constructor for creating new flower.
 * Flower should have the name, type of flowers in that one,
 * level of freshness, price, length of stem and role in bouquet.
 *
 * @version 20 June 2016
 * @author Yevhen Hryshchenko
 */
public class Flower implements ObserverFlower{
    private String name;
    private Freshness freshness;
    private StemType stemLength;
    private int price;
    private boolean isOneFlower;
    private boolean isMain;
    private boolean needTopDressing;
    private boolean needSupport;

    public Flower(String name, boolean isOneFlower, Freshness freshness, int price,
                  StemType stemLength, boolean needTopDressing, boolean needSupport) {
        this.name = name;
        this.isOneFlower = isOneFlower;
        this.freshness = freshness;
        this.price = price;
        this.stemLength = stemLength;
        this.needTopDressing = needTopDressing;
        this.needSupport = needSupport;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    @Override
    public void handleEvent() {
        System.out.println("Flower " + name + " removed cause wilted.");
    }

    public int getPrice() {
        return price;
    }

    public StemType getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return  "\n"
                +"Flower " + name
                + ", price: " + price + "hrn"
                + ", freshness: " + freshness;
    }
}
