import java.util.*;
public class FinancialApplication {
   public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter a value for the subtotal: ");
   double subtotal = input.nextDouble();
   
   
   System.out.println("Now give me the gratuity rate, (How much do you want to tip them? in (%) ?)");
   double gratuityRate = input.nextDouble();
   
   double gratuity = gratuityRate / 100; 
   double tip = subtotal * gratuity;
   double total = subtotal + tip;
   
   System.out.println("So your tip is gonna be: " + tip + " then your total will be $ " + total);
   }
}
   
   