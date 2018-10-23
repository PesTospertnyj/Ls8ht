package com.company;

public abstract class Flower {
    protected String country;
    protected int srok;

    public Flower(String country, int srok, double price) {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSrok() {
        return srok;
    }

    public void setSrok(int srok) {
        this.srok = srok;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected double price;

    public Flower() {
    }
}
