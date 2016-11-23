package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Game: Scissor, rock, paper
        /*1.) Randomly generate a number from 0-2.
          2.) Set the 3 integers as scissor, rock, and paper. scissors beats paper, rock beats scissors, paper beats rock.
          3.) Prompt user to guess
          4.) Check if user won. */

        int compGuess = (int)(Math.random() * 2);


        Scanner input = new Scanner(System.in);
        System.out.println("Wanna play rock, paper, scissors?");
        System.out.println("Type 0-scissors, 1-rock, 2-paper.");
        int userGuess = input.nextInt();

        if (compGuess == 0) {
            if (userGuess == compGuess) {
                System.out.println("The computer is scissors. You are scissors. It is a draw.");
            }
            else if (userGuess > compGuess + 1){
                System.out.println("The computer is scissors. You are paper. You Lost.");
            }
            else {
                System.out.println("The computer is scissors. You are rock. You Won.");
            }

        }
        else if (compGuess == 1) {
            if (userGuess == compGuess) {
                System.out.println("The computer is rock. You are rock. It is a draw.");
            }
            else if (userGuess > compGuess){
                System.out.println("The computer is rock. You are paper. You Won.");
            }
            else {
                System.out.println("The computer is rock. You are scissors. You Lost.");
            }
        }
        else {
            if (userGuess == compGuess) {
                System.out.println("The computer is paper. You are paper. It is a draw.");
            }
            else if (userGuess < compGuess - 1){
                System.out.println("The computer is paper. You are scissors. You Won.");
            }
            else {
                System.out.println("The computer is paper. You are rock. You Lost.");
            }
        }

    }
}
