package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HachapuriRecipe {

    public static void main(String[] args) {
        int flourAmount;
        int flourMin = 2; //cup
        int eggsAmount;
        int eggsMin = 2;
        double waterAmount;
        double waterMin = 0.5; //cup
        double sugarAmount;
        double sugarMin = 0.5; //spoon
        double saltAmount;
        double saltMin = 0.5; //spoon
        double yeastAmount;
        double yeastMin = 0.5; //spoon
        int cheeseAmount; //grams
        int cheeseMin = 150;

        System.out.println("Hello, comrade!");
        System.out.println("Welcome to HachapuriMaker");
        System.out.println("How much flour do you have?");

        Scanner userInput;
        userInput = new Scanner(System.in);
        flourAmount = userInput.nextInt();
        System.out.println("you have " + flourAmount + " grams of flour");

        System.out.println("How many cups of water do you have?");
        userInput = new Scanner(System.in);
        waterAmount = userInput.nextInt();
        System.out.println("you have " + waterAmount + " cups of water");

        System.out.println("How many eggs do you have?");
        userInput = new Scanner(System.in);
        eggsAmount = userInput.nextInt();
        System.out.println("you have " + eggsAmount + " eggs");

        System.out.println("How many spoons of sugar do you have?");
        userInput = new Scanner(System.in);
        sugarAmount = userInput.nextInt();
        System.out.println("you have " + sugarAmount + " spoons of sugar");

        System.out.println("How many spoons of salt do you have?");
        userInput = new Scanner(System.in);
        saltAmount = userInput.nextInt();
        System.out.println("you have " + saltAmount + " spoons of salt");

        System.out.println("How many spoons of yeast do you have?");
        userInput = new Scanner(System.in);
        yeastAmount = userInput.nextInt();
        System.out.println("you have " + saltAmount + " spoons of yeast");

        System.out.println("How many grams of cheese do you have?");
        userInput = new Scanner(System.in);
        cheeseAmount = userInput.nextInt();
        System.out.println("you have " + saltAmount + " grams of cheese");

        //main code
        if (eggsAmount < eggsMin || waterAmount < waterMin || flourAmount < flourMin || sugarAmount < sugarMin
                || saltAmount < saltMin || yeastAmount < yeastMin || cheeseAmount < cheeseMin) {
            System.out.println("no hachapuri today :(");
        } else {
            //calculation
            flourAmount = flourAmount / flourMin;
        }
    }
}
