package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
// a program that tells you if you guessed a random number between 1 and 100

    public static int number() {
        // generates a random number
        Random randomName = new Random();
        int number = randomName.nextInt(100) + 1;
        return number;
        //får "number" som mit tilfældige tal
    }

    public static int input() {
        //lets you pick a number 1-100
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        return input;
        //får " inputnumber " som mit gættede tal
    }

    public static void calc(int number, int input) {
        //calculates and tells you if your above or blow
        if (number == input) {
            System.out.println("correct, the number iI was thinking of was");

        } else if (number < input) {
            System.out.println("that number is too big");
        } else if (number > input) {
            System.out.println("that number is too small");

        } else {
            System.out.println("couldn't calculate");
        }
    }

    public static void main(String[] args) {
        System.out.println("what number am I thinking of between 1 and 100");
        calc(number(), input());

        //get main or another method to loop until the number is found
    }
}