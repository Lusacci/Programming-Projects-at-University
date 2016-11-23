/*Name: James Tam
Date created or Date last modified: 5/5/2015
Project info: Project 5 (no Gui) - "Arrays, Files, and Sorting"
Description: Given the string in names.txt, this file sorts it and outputs into nameout.txt */
import java.util.*;
import java.io.*;

public class StringSorter{

   public static void main(String[]args) throws IOException{
   
      String myFileName = "names.txt"; // the string declared to store the names in names.txt
      Scanner myInput = new Scanner(new File(myFileName)); //takes these names as input
      
      int myCount = myInput.nextInt(); //count that is going to keep track of every input
      String[]theArray = new String[myCount]; //array that contains my count
      
      myInput.nextLine();
      for(int i = 0; i < myCount; i++){ //the loop that stores each given string name into the array
         theArray[i] = myInput.nextLine();
      }
      
      myInput.close(); //always close the inputter
      
      insertionSorter(theArray); //this method contains the array 
      
      String myFileOutputName = "nameout.txt"; //where I'm going to output
      PrintWriter theOutputter = new PrintWriter (myFileOutputName); //output object
      
      for(int i = 0; i < myCount; i++){ //the output loop that is going to use the array values
         theOutputter.println(theArray[i]);
      }
      
      theOutputter.close();  //close the outputter
   }
   
   public static void insertionSorter(String[] list) { //this is the method that actually sorts the string array
      for (int i = 1; i < list.length; i++) { 
         String valueStored = list[i];
         int j;
         for (j = i - 1; j >= 0 && list[j].compareTo(valueStored) > 0; j--) {
            list[j + 1] = list[j];
         }
         list[j + 1] = valueStored;
      
      }
   }


}