package com.zoarial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeeMachineStatus machine = new CoffeeMachineStatus();
        machine.makeCoffee();

        Scanner input = new Scanner(System.in);
        final Expresso expresso = new Expresso();
        final Latte latte = new Latte();
        final Cappuccino cappuccino = new Cappuccino();
        int coffeeType;

        System.out.print("How much water does the coffee machine have: ");
        int water = input.nextInt();
        System.out.print("How much milk does the coffee machine have: ");
        int milk = input.nextInt();
        System.out.print("How many coffee beans does the coffee machine have: ");
        int coffeeBeans = input.nextInt();

        Ingredients ingredients = new Ingredients(water, milk, coffeeBeans);

        System.out.print("What type of coffee do you want? Espresso(1), Latte(2), Cappuccino(3): ");
        coffeeType = input.nextInt();

        System.out.print("Please specify how many cups of coffee you will need: ");
        int cups = input.nextInt();

        boolean madeCoffee;
        switch (coffeeType) {
            case 1:
                madeCoffee = ingredients.Calculator(expresso, cups);
                break;
            case 2:
                madeCoffee = ingredients.Calculator(latte, cups);
                break;
            case 3:
                madeCoffee = ingredients.Calculator(cappuccino, cups);
                break;
            default:
                madeCoffee = false;

        }

        if(!madeCoffee) {
            System.out.print("Do you want to refill (true/false): ");
            boolean b = input.nextBoolean();
            if(b) {
                System.out.print("How much water do you want to add: ");
                water = input.nextInt();
                System.out.print("How much milk do you want to add: ");
                milk = input.nextInt();
                System.out.print("How many coffee beans do you want to add: ");
                coffeeBeans = input.nextInt();
                ingredients.Refill(water, milk, coffeeBeans);

            }
        }
    }
}
