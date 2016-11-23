/*
Name:James Tam
Date Created:02/24/2015
Project Info:Bowling Scores
Description:.Calculate average of Bowling Scores among the 4 players, print highest average
*/

import java.util.Scanner; 
public class BowlingScores
{ 

   public static void main (String [] args)
   { 
     
      int count,total,input=0;
       
      double avg,max=0.0;
      Scanner in = new Scanner(System.in); 
      
     
      for(int i=1;i<=4;i++){
         System.out.println("Player" + i); 
         total=count=input = 0;
         while(input>-1){
            System.out.print("Enter your bowling score: "); 
            input = in.nextInt();
            if(input>-1){
               total = total + input;
               count++; 
            } 
         }
         avg=(double)total/count;
         System.out.println("Average = "+ avg);
         if (avg>max)
            max = avg;
      
      } 
      System.out.println("Highest Average = " +max );
   }
}

