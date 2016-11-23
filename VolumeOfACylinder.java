import java.util.*; //the wild card Java utility package, imported all of them
public class VolumeOfACylinder {
   public static void main(String [] args) {
   Scanner input = new Scanner(System.in); // My Scanner
   System.out.println("Please enter a value for the Radius! :D");
   double radius = input.nextDouble(); // User input as the next radius to be inputted in
   double area;
   final double pi = 3.14159;
   area = radius * radius * pi;
   System.out.println("Can you also give me a value for the length?");
   double length = input.nextDouble(); //Second user input 
   double volume;
   
   volume = area * length;
   
   System.out.println("So the area of the Cylinder is: " + area + " and the volume is going to be " + volume); // Prints out the final value, after calculating.
   
   }
}
   
   
   
     