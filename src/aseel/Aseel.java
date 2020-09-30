/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aseel;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Aseel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("_____________________________________________________");
         System.out.printf("%-30s%-20s%-20s\n",  
      "Spending Category", "Expenses", "percentage");
                 System.out.println("_____________________________________________________");

        Scanner input= new Scanner(System.in);
        double monthlyIncom,rentAndMaintenance,electricityAndGas,
                water,phoneAndInternet,carPaymentAndMaintanance,gasoline,superMarket,
                restautants,health,pharmacies,schoolTuitins,trainings,books,
                clothesAndShoes,hobbiesAndEntertainment;
        System.out.println("Please enter your total monthly income: ");
        monthlyIncom=input.nextDouble();
        System.out.println("note:your total expenses should not exceed the monthly income");
         System.out.println("Enter the home rent and maintenance expernces: ");
         rentAndMaintenance=input.nextDouble();
         System.out.println("Enter the electricity and gas expenses: ");
         electricityAndGas=input.nextDouble();
         System.out.println("Enter the water expenses: ");
        water=input.nextDouble();
        System.out.println("Enter the phones and internet expenses:  ");
        phoneAndInternet=input.nextDouble();
        System.out.println("Enter the Car payment and maintanance expenses: ");
        carPaymentAndMaintanance=input.nextDouble();
        System.out.println("Enter the gasoline expenses: ");
        gasoline=input.nextDouble();
        System.out.println("Enter the supermarkets expenses: ");
        superMarket=input.nextDouble();
        System.out.println("Enter the restautants expenses: ");
        restautants=input.nextDouble();
               System.out.println("Enter the health insurances expenses: ");
           health=input.nextDouble();
           System.out.println("Enter the pharmacies expenses: ");
pharmacies=input.nextDouble();
System.out.println("Enter the school tuitions expenses: ");
schoolTuitins=input.nextDouble();
System.out.println("Enter the trainings expenses: ");
trainings=input.nextDouble();
System.out.println("Enter the books expenses: ");
books=input.nextDouble();
System.out.println("Enter the Clothes and shoes expenses: ");
clothesAndShoes=input.nextDouble();
System.out.println("Enter the hobbies and entertainment expenses:");
hobbiesAndEntertainment=input.nextDouble();



 System.out.printf("%-10s%-10s%-10s\n",  
      "Spending Category", "Expenses", "percentage");
        




        
        
        
        
        
        /*
        
    // Display the header of the table 
    System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", 
      "Radians", "Sine", "Cosine", "Tangent");

    // Display values for 30 degrees
    int degrees = 30;
    double radians = Math.toRadians(degrees);
    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, 
      radians, Math.sin(radians), Math.cos(radians),
      Math.tan(radians));

    // Display values for 60 degrees
    degrees = 60;
    radians = Math.toRadians(degrees);
    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, 
      radians, Math.sin(radians), Math.cos(radians), 
      Math.tan(radians));
        // TODO code application logic here*/
    }
    
}
