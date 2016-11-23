/*Name: James Tam
Date created or Date last modified: 11/18/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Measures the growth rate of the different sort methods */
import java.util.*;

public class BubbleSort extends BasicSort{
   
   public BubbleSort() {
      super("BubbleSort");
   }
   
   @Override
   public void sort(){
      int temp = 0;
      for(int i = 0; i< data.length; i++){
         for(int j = 1; j< data.length-1; j++){
            if(data[j-1] > data[j]){
               temp = data[j-1];
               data[j-1] = data[j];
               data[j] = temp;
               }
            }
       }
   } 
 } 