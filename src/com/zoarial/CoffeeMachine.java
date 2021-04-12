package com.zoarial;

public class CoffeeMachine {
    private String start = "Starting to make a coffee";
    private String grinding = "Grinding coffee beans";
    private String boiling = "Boiling water";
    private String mixing = "Mixing boiled water with crushed coffee beans";
    private String pourCoffee = "Pouring coffee into the cup";
    private String pourMilk = "Pouring some milk into the cup";
    private String ready = "Coffee is ready";

    private static <T> void println(T var) {
        System.out.println(var);
    }
    private static void println() {
        System.out.println();
    }

    public CoffeeMachine() {
    }

    public void makeCoffee() {
        println(start);
        println(grinding);
        println(boiling);
        println(mixing);
        println(pourCoffee);
        println(pourMilk);
        println(ready);
    }

}
