package com.zoarial;

public class Ingredients {

    // What is in the machine
    private double water;
    private double milk;
    private double coffeeBeans;

    public Ingredients(double water, double milk, double coffeeBeans) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
    }


    public boolean Calculator(CoffeeInterface type, int cups) {
        boolean doWeHaveEnough = true;
        if (water <= cups * type.getWater()) {
            doWeHaveEnough = false;
            System.out.println("We don't have enough water.");
        }
        if (coffeeBeans <= cups * type.getCoffeeBeans()) {
            doWeHaveEnough = false;
            System.out.println("We don't have enough coffee beans.");
        }
        if (milk <= cups * type.getMilk()) {
            doWeHaveEnough = false;
            System.out.println("We don't have enough milk.");
        }

        if (!doWeHaveEnough) {
            return false;

        }
        int water = type.getWater() * cups;
        int milk = type.getMilk() * cups;
        int coffeeBeans = type.getCoffeeBeans() * cups;
        System.out.printf("For %d cups of coffee you wil need: \n", cups);
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        this.milk -= milk;
        this.water -= water;
        this.coffeeBeans -= coffeeBeans;
        return true;
    }

    public void Refill(int water, int milk, int coffeeBeans) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
    }
}