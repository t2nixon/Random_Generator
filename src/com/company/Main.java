package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var randGenerator = new Random();
        var number = randGenerator.nextInt(10)+1;
        System.out.println("Guess a number between 1 and 10.");
        var user_guess = 0;
        while (user_guess != number) {
            var Reader = new Scanner(System.in);
            user_guess = Reader.nextInt();
            if (user_guess == number)
                System.out.println("You guessed " + number + " which is correct!");
            else if (user_guess < number)
                System.out.println("You guessed " + user_guess + " which is too low, try again!");
            else
                System.out.println("You guessed " + user_guess + " which is too high, try again");
        }
    }
}
