/****************************************************************************
*
* Created by: Patrick Nguyen
* Created on: November 2016
* This Program Uses Recursion To Produce A Pattern Of Numbers
* Part #2 Of Assignment 5
*
****************************************************************************/

import java.util.Scanner;

public class SingleInteger {
	
	// recursive procedure to solve the pattern 
	public static String solve(int inputVal) 
	{	       
	    String finalString;
		   
	    // if user only enters 1 value
		if (inputVal == 1)
		{
			return "1";
		}
		   
		// adds another line for inputs of over 5
		if (inputVal > 5)
		{		   
			finalString = solve(inputVal - 1) +  " " + Integer.toString(inputVal)
			+"\n" + solve(inputVal - 1); // moves to next line
	    }
		else
		{
			// for inputs under 5
			finalString =  solve(inputVal - 1) + " " + Integer.toString(inputVal)
			+ " " + solve(inputVal - 1);
		}  
		
		return finalString;
	}
	
	
	public static void main(String[] args) 
	{
        System.out.print("Enter Size Of Value: ");
	    Scanner scan = new Scanner(System.in);
	 	int numberOfDigits;
	 	      
	 	// try and catch to catch any errors
	    try 
	    {
	    	numberOfDigits = Integer.parseInt(scan.nextLine());	
	    	// catches int logic flaw
	    	if (numberOfDigits < 1)
			{
			    System.err.println("NOT VALID INT!");		  
			}
	    	else
	    	{
		 		System.out.println(solve(numberOfDigits));
	    	}
	 	} 	
	 	catch (NumberFormatException error) 
	 	{	
	 		System.err.println("NOT AN INT!");		    
	 	}      	  
	}		
}
