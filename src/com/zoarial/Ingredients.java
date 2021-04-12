package com.zoarial;

public class Ingredients {

    private final byte milkForOneCup = 50;
    private final byte coffeeBeansForOneCup = 15;
    private final int waterForOneCup = 200;

    // What is in the machine
    private double water;
    private double milk;
    private double coffeeBeans;

    public Ingredients(double water, double milk, double coffeeBeans) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
    }


    public boolean Calculator(int cups) {
        boolean doWeHaveEnough = true;
        if (water <= cups * waterForOneCup) {
            doWeHaveEnough = false;
            System.out.println("We don't have enough water.");
        }
        if (coffeeBeans <= cups * coffeeBeansForOneCup) {
            doWeHaveEnough = false;
            System.out.println("We don't have enough coffee beans.");
        }
        if (milk <= cups * milkForOneCup) {
            doWeHaveEnough = false;
            System.out.println("We don't have enough milk.");
        }

        if (!doWeHaveEnough) {
            return false;

        }
        int water = waterForOneCup * cups;
        int milk = milkForOneCup * cups;
        int coffeeBeans = coffeeBeansForOneCup * cups;
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