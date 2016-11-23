/* Name: James Tam
   Class: Comp 110/L
   Professor James Bible
   Date: 4/20/2015
 */

public class Infestation { //infestation class: Run this for the whole program to work, since it has main method
   static long totalTime;
   static long elapsedTime;
   static int hdead[] = {0, 0, 0, 0, 0};

   public static void main(String[] args) {
      int dead;
   
      Agent[] agent = new Agent[5];
      for (int i = 0; i < agent.length; i++) {
         agent[i] = new Agent();
         System.out.println(agent[i].toString());
      }
      System.out.println("\n");
   
      Human[] human;
      human = new Human[5];
      int i = 0;
      while (i < human.length) {
         human[i] = new Human();
         dead = 0;
      
         for (Agent anAgent : agent) {
            if (!human[i].attack(anAgent.getxPos(), anAgent.getyPos())) {
               continue;
            }
            dead = 99;
         }
      
         if (dead != 99) {
            System.out.println(human[i].toString());
         } 
         else {
            System.out.println("The human " + (i + 1) + " at(" + human[i].getxPos() + "," + human[i].getyPos() + ") is dead");
            Human.max--;
         }
         i++;
      }
   
      System.out.printf("\n");
      dead = 0;
   
      Human human6; // My special human, Barney haha
      human6 = new Human("Barney, the guy in a Purple Dinosaur costume", "Tail Whip", "117");
      System.out.println("The Human " + human6.getName() + " was located at x:" + human6.getxPos() + " y:" + human6.getyPos());
     
      System.out.println("...... Human " + human6.getName() + " moved to " + human6.getxPos() + "," + human6.getyPos());
   
      for (Agent anAgent : agent) {
         if (!human6.attack(anAgent.getxPos(), anAgent.getyPos())) {
            continue;
         }
         dead = 99;
      }
   
      if (dead != 99) {
         System.out.println("The Human " + human6.getName() + " is located at x:" + human6.getxPos() + " y:" + human6.getyPos());
      } 
      else {
         System.out.println("The human6 at (" + human6.getxPos() + "," + human6.getyPos() + ") is dead");
         Human.max--;
      }
      System.out.println("\nHuman" + Human.born + " named " + human6.getName() + " has a weapon of " + human6.getWeapon());
      System.out.println("Number of Humans dead: " + (Human.born - Human.max));
      System.out.println("Number of Humans survived: " + Human.max);
   }
}

 
