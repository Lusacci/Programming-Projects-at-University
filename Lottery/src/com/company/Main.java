package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Lottery generator!
        /*1.) Generate a random lottery number
          2.) Prompt user to guess
          3.) Get digits from lottery
          4.) Check the Guess*/


        //Randomed that number! Casted the double random function that displays 0.0 - 1.0 as an integer!
        int lottery = (int)(Math.random() * 100);

        //Prompt this user to enter a guess.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick, (2 digits please.)");
        int guess = input.nextInt();

        //Retrieve these digits from the lottery randomized number!
        int digit1 = lottery / 10;
        int digit2 = lottery % 10;

        //Get the digits from the Guess!
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery pick is: " + lottery);

        //Check the guess.
        if(guess == lottery) {
            System.out.println("Congratulations, you have won! Reward: $10,000");
        }
        else if (guessDigit2 == digit1 && guessDigit1 == digit2) {
            System.out.println("Matched all digits: you win $3,000");
        }
        else if (guessDigit1 == digit1 || guessDigit1 == digit2 || guessDigit2 == digit1 || guessDigit2 == digit2) {
            System.out.println("Matched one digit: you win $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }
}
