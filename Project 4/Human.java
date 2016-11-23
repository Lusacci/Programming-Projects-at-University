/*Name: James Tam
  Class: Comp 110/L
  Professor James Bible
  Date: 4/20/2015
 */

import java.util.Random;  

public class Human {
   private int xPosition;
   private int yPosition;
   private String weapon;
   private String type;
   private String name;
   static int max = 0;
   static int born=0;
   int getMax() {
      return max;
   }


   void setWeapon(String newweapon){
      weapon = newweapon;
   }

   String getWeapon(){
      return weapon;
   }

   String getName(){
      return name;
   }

   String getType(){
      return type;
   }

   void setName(String newname){
      name=newname;
   }

   void set(int x, int y) {
      xPosition = x;
      yPosition = y;
   }
   int getxPos(){
      return xPosition;
   }

   int getyPos(){
      return yPosition;
   }

   boolean attack(int x, int y) {
      return (xPosition==x)&&(yPosition==y);
   }

   Random rand = new Random();

   public Human(){
      int randX = rand.nextInt(10) + 1;       
      max++;
      born++;
      xPosition=randX;
      int randY = rand.nextInt(10) + 1;   
      yPosition=randY;
      name="Human"+born;
   }

   public Human(String newname, String newweapon, String newtype) {
      max++;
      born++;
      name= newname;
      weapon = newweapon;
      int randX = rand.nextInt(10) + 1;       
      xPosition=randX;
      int randY = rand.nextInt(10) + 1;   
      yPosition=randY;
      type=newtype;
   }

   @Override
   public String toString() {
      String id;
      id = "The Human "+born+"  is at x:"+xPosition+" y:"+yPosition;
      return id;
   }
}
