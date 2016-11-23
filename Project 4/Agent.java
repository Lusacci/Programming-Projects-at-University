/*Name: James Tam
  Class: Comp 110/L
  Professor James Bible
  Date: 4/20/2015
 */

import java.util.Random; 

public class Agent {
   Random rand = new Random();
   private int xPosition; 
   private int yPosition; 
   static int max=0;
   static int born=0;
   private String id;

   int getmax(){
      return max;
   }

   int getxPos(){
      return xPosition;
   }

   int getyPos(){
      return yPosition;
   }

   String getId(){
      return id;
   }

   void set(int x, int y){
      xPosition=x;
      yPosition=y;
   }
   boolean attack(int x, int y) {
      return (xPosition == x) && (yPosition == y);
   }
   
   public Agent(){
      max++;
      born++;
      xPosition= rand.nextInt(10) + 1;
      int randY = rand.nextInt(10) + 1;
      yPosition=randY;
   }

   public Agent(int x, int y, String newId){    
      xPosition=x;
      yPosition=y;
      max++;
      born++;
      id=newId;
   }

   @Override
   public String toString(){ 
      String id;
      id= "The Agent"+born+" is at x:"+xPosition+" y:"+yPosition;
      return id;
   }
}
