import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Formatter;

public class GuessingGameGUI {
   public static void main (String [] args) {
     
     
      Random rand = new Random () ;
      int value= rand.nextInt(32)+1;
      int var=0;
      int guess=0;
      int largeGuess = 0;
      int smallGuess = 0;
     
      String usersInput; 
      usersInput= JOptionPane.showInputDialog(null,"\nGuess the number I'm thinking of, from 1-32:(-1 to exit)");
      guess=Integer.parseInt(usersInput);
     
      while(guess != -1) {
      var++;
       if(guess<-1 || guess>32){
              
                  var--;
                  String f;
                  f =JOptionPane.showInputDialog(null,"Invalid Input,Try Agian,but be sure 1-32:");
                  guess=Integer.parseInt(f);
}
         
      
         if ( guess > value && guess<32) {
         String g;
            g =JOptionPane.showInputDialog(null,"Your guess is larger than the random value. Next guess:");
                  guess=Integer.parseInt(g);

         
            largeGuess++;
         
         }
         
         else if ( guess < value && guess > 0) {
         String s;
         
            s=JOptionPane.showInputDialog (null,"Your guess is smaller than the random value. Next guess.");
                 
                  guess=Integer.parseInt(s);

            smallGuess++;
         
         
         }
         
         else if (guess == value) {
         
            JOptionPane.showMessageDialog(null,"You've guessed correct!");
           
           
            StringBuilder stringBuilder = new StringBuilder();
            Formatter outputStr = new Formatter(stringBuilder);
         
         
            for(int count=0; count<var;count++) {
            
            
               outputStr.format("*");
            
            }
            
            
            StringBuilder stringBuilder1 = new StringBuilder();
            Formatter outputStr1 = new Formatter(stringBuilder1);
         
            for( int count=0; count < smallGuess; count++) {
            
               outputStr1.format("*");
            
            }
            
            
            StringBuilder stringBuilder2 = new StringBuilder();
            Formatter outputStr2 = new Formatter(stringBuilder2);
         
            
            for (int count = 0; count < largeGuess; count ++) {
            
               outputStr2.format("*");
            
            }
            JOptionPane.showMessageDialog(null, ("Total number of guesses: "+var)+("\n")+(outputStr)+("\n")+("Smaller Guesses:"+ smallGuess)+("\n")+(outputStr1)+("\n")+("Larger Guesses: " + largeGuess)+("\n")+(outputStr2));
            
            System.exit(0);
         
         }
         
         if(guess==-1){
            JOptionPane.showMessageDialog(null,"what you quit");
         }
      
      }
      guess=Integer.parseInt(usersInput);
   
   }   
} 
