/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animal;

import static animal.FoodType.*;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    int weight;
    FoodType food;
    char bloodtype;
    
    public Animal(char bloodtype,int weight, FoodType food)
    {
     this.bloodtype = bloodtype;
     this.weight = weight;
     this.food = food;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Does your object have a bloodtype? y for yes n for no");
        char bloodtype = input.next().charAt(0);
        
        System.out.println("What is the weight of your object? (Give me an integer)");
        int weight = input.nextInt();
        
        System.out.println("Is it an herbivore, omnivore, or carnivore?");
        String foodString = input.next().toLowerCase();
        FoodType food;
        
        switch(foodString)
        {
            case "herbivore": 
                food = Herbivore;
                break;
            
            case "omnivore":
                food = Omnivore;
                break;
            
            case "carnivore":
                food = Carnivore;
                break;
            default:
                System.out.println("Invalid response");
        }
        
        // TODO code application logic here
    }
    
}
