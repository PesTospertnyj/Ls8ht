package com.company;

public class Rose extends Flower {
    public Rose(String country, int srok, double price){
        super(country, srok, price);
        this.country = "England";
        this.srok = 12;
        this.price = 25.30;
    }

    public Rose() {
    }
}
