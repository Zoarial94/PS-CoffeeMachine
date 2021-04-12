package com.zoarial;

public class Expresso implements CoffeeInterface {
    int water = 250;
    int milk = 0;
    int coffeeBeans = 16;
    int price = 4;

    @Override
    public int getPrice() {
        return price;
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
    }
}
