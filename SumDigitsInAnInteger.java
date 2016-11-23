import java.util.*;
public class SumDigitsInAnInteger {
   public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter a number from 0 - 1000!");
   int yourNumber = input.nextInt();
   int firstDigitForAdding = yourNumber % 10;
   int trickToGettinDaSecondNumber = yourNumber / 10;
   int secondDigitForAdding = trickToGettinDaSecondNumber % 10;
   int trickToGettinDaThirdNumber = trickToGettinDaSecondNumber / 10;
   int thirdDigitForAdding = trickToGettinDaThirdNumber % 10;
   int sum = firstDigitForAdding + secondDigitForAdding + thirdDigitForAdding;
   System.out.println("So the sum of all of your integers is: " + sum);
   }
}
   