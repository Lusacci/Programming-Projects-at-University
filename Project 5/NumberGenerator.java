/* Name: James Tam
   Date created: 5/2/2015
   Project info: Project 5 (no Gui) - "Arrays, Files, and Sorting"
   Description: A number generator that randomly generates a number that determines the amount looped and stored into numbers.txt  */
   
import java.util.*;
import java.io.*;

public class NumberGenerator {

   public static void main(String [] args) throws IOException{ // This is so it throws the code into the txt
   
      Random rng = new Random(); // the random object, rng stands for random number generated
      PrintWriter writer = new PrintWriter("numbers.txt"); // where I am going to store my code, in numbers.txt
      
   
      int count = rng.nextInt(10)+5; // I set the parameters to 5-15 so it looks nicer
      writer.println(count); // telling the writer object to print the randomly generated number
   
      int i; //i variable
   
      for(i=0; i < count; i++){ // this is my loop for the number of times it loops, given randomly generated number
      
         int rn = rng.nextInt(99)+0;   // rn variable (random number) with parameters 0-30
         writer.println(rn); // prints out rn.
      }
     writer.close(); //closes writer
   }
}