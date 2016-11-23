package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Game: Heads or Tails
        /*1.) Randomly generate an integer 0 or 1.
          2.) Represent 0 as heads and 1 as tails.
          3.) Prompt the user to guess and report whether the guess is correct or incorrect.*/
        int randomInt = (int)(Math.random() + .5); // math.random is a double method from 0.0-1.0

        //Prompt
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there! I'm a guessing game, tell me, 0-heads or 1-tails?");
        int guess = input.nextInt();

        if(guess == randomInt){
            boolean answer = true;
            System.out.println("Your guess is: " + answer);
        }
        else{
            boolean answer = false;
            System.out.println("Your guess is: " + answer);
        }



    }
}
