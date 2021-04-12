package com.zoarial;

public class Latte implements CoffeeInterface {
    int water = 200;
    int milk = 100;
    int coffeeBeans = 12;
    int price = 7;

    public Latte() {
        water = 200;
        milk = 100;
        coffeeBeans = 12;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getWater() {
        return water;
    }

    @Override
    public int getMilk() {
        return milk;
    }

    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }}
