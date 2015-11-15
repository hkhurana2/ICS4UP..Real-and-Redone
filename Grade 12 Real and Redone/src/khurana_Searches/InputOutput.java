package khurana_Searches;

import java.util.Scanner;
/*
 * This class gives an array and a variable of either a string, double or an integer 
 * and gets the value of the index the value is, if the value is not found ,then -1 is returned 
 */
public class InputOutput {

	public static void main(String[] args) {
		//Ordered array from which linear search will happen.
		int[] ints = {1,2,34,44,46,58,79,89,95,102,130,150,168,720};
		double[] doubles = {1.59,2.12,34.16,44.89,46.56,58.18,79.68,89.49,95.61,102.61,130.91,150.98,168.39,720.28};
		String[] strings = {"Ant-Eater", "Bull", "Cow", "Dog", "Elephant", "Falcon", "Goose", "Horse", "Iguana", "Jaguar","Koala", "Lion", "Mongoose", "Narwhal", "Ostrich", "Penguin", "Quetzal", "Rhino", "Starfish", "Tiger", "Umbrella-Bird", "Vulture", "Walrus", "Yak", "Zebra"};
		
		//targets for the linear search to find
		int targetInt = 168;
		double targetDouble= 2.12;
		String targetString = "Falcon";
		
		//object initialized		
		LinearSearch search = new LinearSearch();
		
		//scanner initialized
		Scanner s = new Scanner(System.in);
		
		/*
		 * menu in infinite loop, there are 3 options: integer, double, or string search
		 *if an option is chosen, program goes through an if structure
		 * and chooses the correct method to run corresponding to the type of linear search
		 * the results of the searches are finally output
		 */
		
		boolean flag = false;
		do 
		{
			System.out.println("Please choose one of the following options:");
			System.out.println("1. Integer linear search.");
			System.out.println("2. Double linear search.");
			System.out.println("3. String linear search.");
			
			int option = s.nextInt();
			
			if(option == 1)
			{
				int indexOfInt = LinearSearch.linearSearchInt(ints, targetInt);
				PrintInt(indexOfInt, targetInt);
			}
			else if (option == 2)
			{
				int indexOfDouble = LinearSearch.linearSearchDouble(doubles, targetDouble);
				PrintDouble(indexOfDouble, targetDouble);
			}
			else if (option == 3)
			{
				int indexOfString = LinearSearch.linearSearchString(strings, targetString);
				PrintString(indexOfString, targetString);
			}
			else
			{
				System.out.println("please try again.");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
			
		}while (flag== false);
		
	}
	
	
	/**
	 * 
	 * @param indexOfInt Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetInt  Target value which was/was not found
	 */
	public static void PrintInt(int indexOfInt, int targetInt)
	{
		if (indexOfInt >= 0)
		{
			System.out.println(targetInt + " was found at " + (indexOfInt+1) + " index of the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else
		{
			System.out.println(targetInt + " in not in the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	
	public static void PrintDouble(int indexOfDouble, double targetDouble)
	{
		if (indexOfDouble >= 0)
		{
			System.out.println(targetDouble + " was found at " + (indexOfDouble+1) + " index of the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else
		{
			System.out.println(targetDouble + " in not in the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		
	}

	public static void PrintString(int indexOfString, String targetString)
	{
		if (indexOfString >= 0)
		{
			System.out.println(targetString + " was found at " + (indexOfString+1) + " index of the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else
		{
			System.out.println(targetString + " in not in the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		
	}
	
	
	
	
	
	
	
	
	

}
