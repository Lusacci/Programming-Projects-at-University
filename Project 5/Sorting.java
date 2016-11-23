/*Name: James Tam
Date created or Date last modified: 5/5/2015
Project info: Project 5 (no Gui) - "Arrays, Files, and Sorting"
Description: Sorts the data taken in numbers.txt and outputs it with an array into numout.txt */

import java.io.*;
import java.util.*;
public class Sorting{

   public static void main(String[]args) throws IOException{ // to throw out into .txt
   
      String fileName = "numbers.txt"; //String stores values inside txt
      Scanner myInput = new Scanner(new File(fileName)); //scanner that designates my Input to store fileName
      
      int myCount = myInput.nextInt(); //this counter will keep track of the # of inputs
      int[] myArray = new int[myCount]; // array that stores this counter
      
      int indexer = 0; //the array's indexer, array starts at 0
      while (myInput.hasNext()) { // read line by line in java
         myArray[indexer] = myInput.nextInt();// the array that stores index, will store the input
         indexer++;
      }
      
      myInput.close();
      insertionSorting(myArray); //Sorter for the array
   
      String outputFile = "numout.txt"; //outputs into numout.txt file
      PrintWriter outputWriter = new PrintWriter (outputFile); //output writer
      
      for(int i = 0; i < myCount; i++){ // for loop that will output given the values in array, excluding 1st number
         outputWriter.println(myArray[i]);
      }
      
      outputWriter.close();
   }
   
   public static void insertionSorting(int[] list) {
      for (int i = 1; i < list.length; i++) { // this sorts 1-i within the array
         int valueCount = list[i];
         int j;
         for (j = i - 1; j >= 0 && list[j] > valueCount; j--) { 
            list[j + 1] = list[j];
         }
         list[j + 1] = valueCount;
      
      }
   }
}


