import java.util.Scanner;

public class Machine{
   
    //declare money(Global var.)
   static final int penny = 1;
   static final int nickel= 5;
   static final int dime = 10;
   static final int quarter = 25;
   static final int dollar = 100;
   //count for coins
   static int pennyCount = 100;
   static int nickelCount = 100;
   static int dimeCount = 100;
   static int quarterCount = 100;
   static int credit=0;
     
   public static void main (String[] args) {
      Machine d=new Machine();//con.
      //items(final)
      final int Snickers= 150;
      final int Twix = 110 ;
      final int Gum= 75;
      final int Milkyway= 125;
      //Item count
      int snickersCount= 4;
      int twixCount = 4;
      int gumCount=4;
      int milkywayCount=4;
    
      Scanner scanner= new Scanner(System.in) ;
      System.out.println("Welcome to the Vending Machin`come and spend your money!!!!");
   //inif. loop; outofstock....loop 
      while(true) {
          
         System.out.printf("Your Credit: " + credit);
         System.out.printf(" This items are outstock: ");
         if (twixCount==0){
            System.out.printf("Twix ");
         }
         if (snickersCount==0){
            System.out.printf("Snickers ");
         }
         if(gumCount==0){
            System.out.printf("Gum ");
         }
         if(milkywayCount==0){
            System.out.printf("Milkyway ");
         }
         //Menu (Fancy isn't it)
         System.out.printf("\nSelect product:\n0-Insert Money\t5-Return Change\n1-Twix (110)\t2-Snikers  (150)\n3-Gum   (75)\t4-Milkyway (125)",Twix,Snickers,Gum,Milkyway);
         System.out.println("\nFor a item Enter 1-4;0 to insert money or 5 to return money:");
         int item = scanner.nextInt();
       
         switch (item) {
         
            case 0: insertMoney();
               break;
               
            case 1:
               if(credit >= Twix && twixCount > 0){
                  System.out.println("Here's your Twix!\n");
                  vend(Twix);
                  twixCount--;
               }
               else if(twixCount == 0)
                  vend("Sorry out of Twix\n");
               else
                  vend("Please insert more money for this item\n");
               break;
              
            case 2:
               if(credit >= Snickers && snickersCount > 0){
                  System.out.println("Here's your Snickers\n");
                  vend(Snickers);
                  snickersCount--;
               }
               else if (snickersCount ==0)
                  vend("Sorry out of Snickers\n");
               else
                  vend("Please insert more money for this item\n");
               break;
             
            case 3:
               if(credit >= Gum && gumCount > 0){
                  System.out.println("Here's your Gum\n");
                  vend(Gum);
                  gumCount--;
               }
               else if (gumCount ==0)
                  vend("Out of Gum\n");
               else
                  vend("Please insert more money for this item\n");
               break;
                 
            case 4:
               if(credit >= Milkyway && milkywayCount > 0){
                  System.out.println("Here's your Milkyway!\n");
                  vend(Milkyway);
                  milkywayCount--;
               }
               else if (milkywayCount ==0)
                  vend("Sorry out of KitKats!\n");
               else
                  vend("Please insert more money for this item\n");
               break;
         
            case 5:vend("Heres your change!"); 
               d.changeReturn();
               break;
         }
      }
   }
   
   public static void vend(String message){
      System.out.println(message);
   }
  
   public static void vend(int cost){
      credit = credit - cost;
   }
   
   public static void insertMoney(){
      Scanner scanner = new Scanner(System.in);
         
          //coin menu
      int coins;
      System.out.println("Press 1 To Insert Nickel(s)");
      System.out.println("Press 2 To Insert Dime(s)");
      System.out.println("Press 3 To Insert Quarter(s)");
      System.out.println("Press 4 To Insert Dollar(s)");
      System.out.println("Press 5 To Insert Penny(s)");
      int selection = scanner.nextInt();
          //coin loop
      switch(selection){
         case 1: System.out.println("How many Nickels: ");
            coins = scanner.nextInt();
            for(int i = 0; i < coins; i++){
               nickelCount++;//<---coin count
               credit = credit + nickel;
            }
               break;
         case 2: System.out.println("How many Dimes: ");
            coins = scanner.nextInt();
            for(int i = 0; i < coins; i++){
               dimeCount++; //<---coin count
               credit = credit + dime;
            }
               break;
         case 3: System.out.println("How many Quarters: ");
            coins = scanner.nextInt();
            for(int i = 0; i < coins; i++){
               quarterCount++; //<---coin count
               credit = credit + quarter;
            }
               break;
         case 4: System.out.println("How many Dollars: ");
            coins = scanner.nextInt();
            for(int i = 0; i < coins; i++) 
               credit = credit + dollar;
         case 5: System.out.println("How many Pennies: ");
            coins = scanner.nextInt();
            for(int i = 0; i < coins; i++)
               credit = credit + penny;             
             
             }
   }

   public String changeReturn() {
      //coin return var.
      int returnPenny = 0;
      int returnNickel = 0;
      int returnDime = 0;
      int returnQuarter = 0;
     
      System.out.printf("Your change: " + credit);
     
   
      while(credit >= 25 && quarterCount > 0){
         credit = credit - quarter;
         quarterCount--;//<--- -1 to coin count
         returnQuarter++;
      }
      while(credit >= 10 && dimeCount > 0){
         credit = credit - dime;
         dimeCount--;//<--- -1 to coin count
          returnDime++;
      }
      while(credit >= 5 && nickelCount > 0){
         credit = credit - nickel;
         nickelCount--;//<--- -1 to coin count
         returnNickel++;
      }
      while(credit >=1 && pennyCount > 0) {
         credit = credit - penny;
         pennyCount --;
         returnPenny++;
      }
       //when theres is no coins  
      if(quarterCount == 0 && dimeCount == 0 && nickelCount == 0){
         System.out.println("\nquarters: " + returnQuarter);
         System.out.println("dimes: " + returnDime);
         System.out.println("nickels: "+ returnNickel);
         System.out.println("pennys: " + returnPenny);
         credit = 0;
         System.out.println("Were out of change, we just stole your money ;)");
         return "";
      }
      else{
         System.out.println("\nquarters: " + returnQuarter);
         System.out.println("dimes: " + returnDime);
         System.out.println("nickels: "+ returnNickel);
         System.out.println("pennys: " + returnPenny);
         return "";
      }
   }
}
