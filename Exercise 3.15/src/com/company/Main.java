package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Game: lottery
        /*1.) Randomly generate a 3 digit number. 999 being the max.
          2.) Prompt the user to enter a 3 digit number
          3.) Determine whether the user wins according to rules.
              i.) exact order: $10,000 reward
              ii.) all digits match : $ 3,000 reward.
              iii.) single digit match: $1,000 reward.*/

        int lottery = (int)(Math.ceil((Math.random() * 999))); // sets a random number between 1-999.

        // get the digits from this lottery number.
        int digit1 = lottery / 100;
        int mover1 = lottery % 100;
        int digit2 = mover1 / 10;
        int digit3 = mover1 % 10;

        // So now we know every digit of this number
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome to my lottery!");
        System.out.println("Take a guess at what the 3 digit lottery number is!");
        int guess = input.nextInt();

        // Get the guess digits.
        int gdigit1 = guess / 100;
        int moverd1 = guess % 100;
        int gdigit2 = moverd1 / 10;
        int gdigit3 = moverd1 % 10;

        // Now the 3 cases.
        if(guess == lottery) {
            System.out.println("Exactly correct. Your reward: $10,000.");
        }
        else if ((gdigit1 == digit1 || gdigit1 == digit2 || gdigit1 == digit3) && (gdigit2 == digit1 || gdigit2 == digit2 || gdigit2 == digit3)
                && (gdigit3 == digit1 || gdigit3 == digit2 || gdigit3 == digit3)) {
            System.out.println("Well all the digits match. Your reward: $ 3,000.");
        }
        else if ((gdigit1 == digit1 || gdigit1 == digit2 || gdigit1 == digit3) || (gdigit2 == digit1 || gdigit2 == digit2 || gdigit2 == digit3)
                || (gdigit3 == digit1 || gdigit3 == digit2 || gdigit3 == digit3)){
            System.out.println("Not bad, one of em matched! Your reward: $ 1,000.");
        }
        else{
            System.out.println("Sorry, none of them matched.");
        }

    }
}
