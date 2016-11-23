import java.util.Scanner;
import javax.swing.JOptionPane;
public class Program9
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   JOptionPane.showMessageDialog(null, "Enter a value for the subtotal");
   double subtotal = input.nextDouble();
   
   System.out.println("Now enter a value in percent for the tiprate");   
   double tiprate = input.nextDouble() / 100.0;
   
   double tip = subtotal * tiprate;
   double total = subtotal + tip;
   
   JOptionPane.showMessageDialog(null, "So your total comes out to: " + total + " and your tip comes out to: " + tip);
   }
}