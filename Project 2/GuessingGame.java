import java.util.Random;
import java.util.Scanner;
public class GuessingGame{
   public static void main (String[] args){
      Scanner scanner= new Scanner(System.in);
      Random rand=new Random();
     
      
      int value = rand.nextInt(32)+1;
      int guess=0;
      int var=0;
      int Low=0;
      int High=0;  
     
      
      System.out.println("This is a Guessing Game!");
     
      
      while (guess != -1){
         var++;
         System.out.println("Guess a number between 1 and 32(-1 to exit):");
         guess = scanner.nextInt();
       
         if(guess<-1 || guess>32){
            System.out.println("Invalid. Please Try Again");
            var--;
         
         }                        
         if(guess > value && guess<32 ){
         
            System.out.println("Your guess is larger than the random value.");
            High++;
         
         }
         else if (guess < value && guess>0){
            System.out.println("Your guess is lower than the random value."); 
            Low++;
         }
         else if (guess == value){
            System.out.println("You've guessed correct!");
            System.out.println("It took you this many trys:"+var);
            
            for(int count=0;count<var;count++){
               System.out.printf("*");
            }
           
           
            System.out.println("");
            
            System.out.println("Smaller Guesses: "+Low);
            for(int count=0;count<Low;count++){
               System.out.printf("*");
            
            }
            System.out.println("");
            System.out.println("Larger Guesses: "+High);
            for(int count1=0;count1<High;count1++){
               System.out.printf("*");
            }
            
            
            System.exit(0);
         }
      }    
   }  
}
