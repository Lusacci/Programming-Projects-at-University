public class ApproximatePi {
   public static void main(String [] args){
   double p = 4;
   double total1;
   
   total1 = p*(1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0 / 11));
   
   double total2;
   
   total2 = p*(1.0 - (1.0/3) + (1.0 /5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));
   
   System.out.println("The first total is: " + total1);
   System.out.println("The second total is: " + total2);
   }
}
