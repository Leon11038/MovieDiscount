/*
 * Programmer: Ryan Dubeau
 * Date: 9/25/2020
 * Purpose: To check the cost of someone buying a movie ticket
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        
    	double ticket = 14.5;
    	
    	// Create the input scanner
        Scanner input = new Scanner(System.in);
   


        // Ask the user for their age
        System.err.print("How old are you? ");
         int age = input.nextInt();

        
        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean coupon = input.nextBoolean();
      
    	   
    
      
        if (age < 13 || age >= 65  ) {
        	ticket -= 3;
        }
        if(coupon == true ) {
        		ticket -= 2;
        }		
        
        System.out.println("Your ticket costs $" + ticket + ".");	
        
    
    
    }
    }


