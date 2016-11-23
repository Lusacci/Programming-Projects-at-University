import java.util.Scanner;
public class Program5{
   public static void main(String[] args)
   {
   Scanner scan = new Scanner(System.in);
   System.out.println("Please enter a Value for Celsius");
   double celsius = scan.nextDouble();
   double fahrenheit;
   fahrenheit = (9.0 / 5.0) * celsius + 32.0;
   System.out.println("The Fahrenheit given " + celsius + " celsius is: " + fahrenheit + " fahrenheit" );
   }
}