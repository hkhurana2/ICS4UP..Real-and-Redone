/**
 * 
 */
package khurana_Searches;

import java.util.Scanner;

/**
 * @author Harkirat Khurana
 *
 */
public class BinaryInputOutput {
/*
 * This is binary search of integers, doubles, and Strings.
 * 
 */
	
	
	
/**
 * 
 * @param args args
 */
	public static void main(String[] args) {
		//Ordered array from which linear search will happen.
		int[] ints = {1,2,34,44,46,58,79,89,95,102,130,150,168,720};
		double[] doubles = {1.59,2.12,34.16,44.89,46.56,58.18,79.68,89.49,95.61,102.61,130.91,150.98,168.39,720.28};
		String[] strings = {"Ant-Eater", "Bull", "Cow", "Dog", "Elephant", "Falcon", "Goose", "Horse", "Iguana", "Jaguar","Koala", "Lion", "Mongoose", "Narwhal", "Ostrich", "Penguin", "Quetzal", "Rhino", "Starfish", "Tiger", "Umbrella-Bird", "Vulture", "Walrus", "Yak", "Zebra"};
		
		//targets for the linear search to find
		int targetInt = 168;
		double targetDouble= 2.12;
		String targetString = "Falcon";
		
		//scanner initialized
		Scanner s = new Scanner(System.in);

		//object initialized
		BinarySearch search = new BinarySearch();
		
		//indexes of the targets recoded to use to print in methods
	   int	indexOfInt = search.binarySearchInt(ints, targetInt);
		int indexOfDouble = search.binarySearchDouble(doubles, targetInt);
		int indexOfString = search.binarySearchString(strings, targetString);
		
	}
	/**
	 * Prints in which index the target value of the integer was found. If the target value is not found, "target value is not found"
	 * @param indexOfInt Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetInt Target value which was/was not found
	 */
	public static void binaryInt(int indexOfInt, int targetInt )
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
	
	/**
	 * Prints in which index the target value of the double was found. If the target value is not found, "target value is not found"
	 * @param indexOfDouble Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetDouble Target value which was/was not found
	 */
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
	
	/**
	 * Prints in which index the target value of the string was found. If the target value is not found, "target value is not found"
	 * @param indexOfString Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetString Target value which was/was not found
	 */
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
