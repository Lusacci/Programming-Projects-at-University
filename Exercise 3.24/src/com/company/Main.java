package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Game: Pick a card
        /*1.) Prompt the user to pick up a random card from the dec of 52.
          2.) Maybe use a switch to randomize the card value of suite.
          3.) Display that card.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to pick a random card from this deck? 0-yes 1- no");
        int cardPick = input.nextInt();
        if (cardPick == 1) {
            System.out.println("Okay, then goodbye!");
        }
        else if(cardPick == 0) {
            int randomCard = (int)(Math.random() * 52); // random 1-52.
            if(randomCard >= 39){

                switch(randomCard % 13){

                    case 0:
                        System.out.println("The card you picked is Ace of Spades.");
                        break;
                    case 1:
                        System.out.println("The card you picked is 2 of Spades.");
                        break;
                    case 2:
                        System.out.println("The card you picked is 3 of Spades.");
                        break;
                    case 3:
                        System.out.println("The card you picked is 4 of Spades.");
                        break;
                    case 4:
                        System.out.println("The card you picked is 5 of Spades.");
                        break;
                    case 5:
                        System.out.println("The card you picked is 6 of Spades.");
                        break;
                    case 6:
                        System.out.println("The card you picked is 7 of Spades.");
                        break;
                    case 7:
                        System.out.println("The card you picked is 8 of Spades.");
                        break;
                    case 8:
                        System.out.println("The card you picked is 9 of Spades.");
                        break;
                    case 9:
                        System.out.println("The card you picked is 10 of Spades.");
                        break;
                    case 10:
                        System.out.println("The card you picked is Jack of Spades.");
                        break;
                    case 11:
                        System.out.println("The card you picked is Queen of Spades.");
                        break;
                    case 12:
                        System.out.println("The card you picked is King of Spades.");
                        break;

                }
            }
            else if (randomCard >= 26){
                switch(randomCard % 13){

                    case 0:
                        System.out.println("The card you picked is Ace of Clubs.");
                        break;
                    case 1:
                        System.out.println("The card you picked is 2 of Clubs.");
                        break;
                    case 2:
                        System.out.println("The card you picked is 3 of Clubs.");
                        break;
                    case 3:
                        System.out.println("The card you picked is 4 of Clubs.");
                        break;
                    case 4:
                        System.out.println("The card you picked is 5 of Clubs.");
                        break;
                    case 5:
                        System.out.println("The card you picked is 6 of Clubs.");
                        break;
                    case 6:
                        System.out.println("The card you picked is 7 of Clubs.");
                        break;
                    case 7:
                        System.out.println("The card you picked is 8 of Clubs.");
                        break;
                    case 8:
                        System.out.println("The card you picked is 9 of Clubs.");
                        break;
                    case 9:
                        System.out.println("The card you picked is 10 of Clubs.");
                        break;
                    case 10:
                        System.out.println("The card you picked is Jack of Clubs.");
                        break;
                    case 11:
                        System.out.println("The card you picked is Queen of Clubs.");
                        break;
                    case 12:
                        System.out.println("The card you picked is King of Clubs.");
                        break;

                }
            }
            else if (randomCard >= 13){
                switch(randomCard % 13){

                    case 0:
                        System.out.println("The card you picked is Ace of Diamonds.");
                        break;
                    case 1:
                        System.out.println("The card you picked is 2 of Diamonds.");
                        break;
                    case 2:
                        System.out.println("The card you picked is 3 of Diamonds.");
                        break;
                    case 3:
                        System.out.println("The card you picked is 4 of Diamonds.");
                        break;
                    case 4:
                        System.out.println("The card you picked is 5 of Diamonds.");
                        break;
                    case 5:
                        System.out.println("The card you picked is 6 of Diamonds.");
                        break;
                    case 6:
                        System.out.println("The card you picked is 7 of Diamonds.");
                        break;
                    case 7:
                        System.out.println("The card you picked is 8 of Diamonds.");
                        break;
                    case 8:
                        System.out.println("The card you picked is 9 of Diamonds.");
                        break;
                    case 9:
                        System.out.println("The card you picked is 10 of Diamonds.");
                        break;
                    case 10:
                        System.out.println("The card you picked is Jack of Diamonds.");
                        break;
                    case 11:
                        System.out.println("The card you picked is Queen of Diamonds.");
                        break;
                    case 12:
                        System.out.println("The card you picked is King of Diamonds.");
                        break;

                }
            }
            else {
                switch(randomCard % 13){

                    case 0:
                        System.out.println("The card you picked is Ace of Hearts.");
                        break;
                    case 1:
                        System.out.println("The card you picked is 2 of Hearts.");
                        break;
                    case 2:
                        System.out.println("The card you picked is 3 of Hearts.");
                        break;
                    case 3:
                        System.out.println("The card you picked is 4 of Hearts.");
                        break;
                    case 4:
                        System.out.println("The card you picked is 5 of Hearts.");
                        break;
                    case 5:
                        System.out.println("The card you picked is 6 of Hearts.");
                        break;
                    case 6:
                        System.out.println("The card you picked is 7 of Hearts.");
                        break;
                    case 7:
                        System.out.println("The card you picked is 8 of Hearts.");
                        break;
                    case 8:
                        System.out.println("The card you picked is 9 of Hearts.");
                        break;
                    case 9:
                        System.out.println("The card you picked is 10 of Hearts.");
                        break;
                    case 10:
                        System.out.println("The card you picked is Jack of Hearts.");
                        break;
                    case 11:
                        System.out.println("The card you picked is Queen of Hearts.");
                        break;
                    case 12:
                        System.out.println("The card you picked is King of Hearts.");
                        break;

                }
            }

        }
        else {
            System.out.println("Invalid, please select a choice of 0 or 1.");
        }
    }
}
