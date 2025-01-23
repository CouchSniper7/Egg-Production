// Joseph Simonin
// COP-2800-98672 Java Programming
// Proffessor Seely
// 1/23/2025
// Assignmnet: P1 Egg Production
// This program will ask for the total number of chickens on a farm. It will then ask user for rooster count in those chickens. It will 
// then ask the user for the percentage cjance a random chicken lays a egg daily. it will then ask for the total number of days and will
// output the estimated numbeer of eggs that will be produced on the farm. 

import java.util.Scanner; // Scanner is in the java.util package

public class Eggproduction {
    
    public static void main(String[] args) throws Exception {

// Create a scanner object
        try (Scanner input = new Scanner(System.in)) {

// welcome message
        System.out.println("Welcome to Egg Production Estimator. ");

// Prompt user to enter total number of chickens
        System.out.print("Please enter the total number of chickens on the farm: ");
        float chickens = (float) input.nextFloat();

// Prompt user to enter the number of chickens on the farm who are roosters
        System.out.print("Please enter the total number of roosters on the farm: ");
        float roosters = (float) input.nextFloat(); 
        
// Prompt the user to enter the percentage chance any random chicken lays an egg in a day        
        System.out.print("Please enter the percentage chance any random chicken lays an egg in a day (between 0.0 and 1.0): ");
        float egg_percentage = (float) input.nextFloat(); 
        
// Prompt user to enter the total number of days to estimate
        System.out.print("Please enter the total number of days: ");
        int days = input.nextInt();

// Compute estimate
        int estimate = (int) ((chickens - roosters) * egg_percentage * days);

// Display estimate
        System.out.println("The estimated egg production for " + days + " days is " + estimate + " eggs.");
        input.close();
        }
    }
}
