/****************************************************************************
*
* Created by: Patrick Nguyen
* Created on: November 2016
* This Program Uses Recursion To Create An Hourglass
* Part #3 Of Assignment 5
*
****************************************************************************/


import java.util.Scanner;

public class HourGlass {

	// adds the spaces of the hourglass for it is symmetrical recursively
	public static String addSpace(int spaceNum)
	{
		String spaceBetween = "";
		
	    if (spaceNum > 0)
	    {
		spaceBetween =  " " + addSpace(spaceNum - 1) ;
	    }
	    	return spaceBetween;		
	}
	
	// adds the stars of the hourglass recursively
	public static String addStar(int starNum)
	{
		String starsBetween = "";
		
	    if (starNum > 0)
	    {
	    	starsBetween =  "* " + addStar(starNum - 1) ;
	    }
	    	return starsBetween;		
	}
	
	// uses recursion to determine both halves of the hourglass
	public static void hourGlassSolve(int layerNum, int placeHolder)
	{
		if (layerNum > 0)
		{                      
			// addSpace(placeHolder - layerNum) determines the spacing required to make hourglass symmetrical
			// addStar(layerNum) determines the number of stars of the hourglass layer 
			System.out.println(addSpace(placeHolder - layerNum) + addStar(layerNum));
			hourGlassSolve(layerNum - 1, placeHolder);
			System.out.println( addSpace(placeHolder - layerNum) + addStar(layerNum)); //addSpace2(layerNum);
		}
	}
	
	public static void main(String[] args) 
	{
	    System.out.print("Enter Size Of Hourglass: ");
	    Scanner scan = new Scanner(System.in);
	    int numberOfRows = 0;
	    
	    try 
		{
		    numberOfRows = Integer.parseInt(scan.nextLine());		
		 			
			if (numberOfRows < 1)
			{
			    System.err.println("NOt VALID INT!");		  
			}
			else
		    {
		 		hourGlassSolve(numberOfRows, numberOfRows);
		    } 	
		}
	    catch (NumberFormatException error) 
		{	
		 	System.err.println("NOT AN INT!");		    
		}  
	}
}
		

	
	
	