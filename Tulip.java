package com.company;

public class Tulip extends Flower {
    public Tulip(String country, int srok, double price){
        super(country, srok, price);
        this.country = "Ukraine";
        this.srok = 15;
        this.price = 10.90;
    }

    public Tulip() {
    }
}
