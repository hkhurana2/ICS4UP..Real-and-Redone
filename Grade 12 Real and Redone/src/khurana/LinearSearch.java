package khurana;

import java.util.ArrayList;

/*
 * This class gets a variable and an array for each method(string, double, and integer)
 * Each of the methods basically do the same thing:
 * They go through every single element of the array and compare it to the target value 
 * given. If found, the index the targets in is returned, but if the target in not found in the array, 
 * -1 is returned
 */
/**
 * 
 * @author Harkirat Khurana
 *
 */
public class LinearSearch {

	
	
	
	/**
	 * 
	 * @param contestants object passed to use the information to find and look for the first name of the contestant 
	 * @param target last name of the contestant which the user is looking for
	 * @return returns if the first name of and contestant is found or not
	 */
	public static int linearSearchFName(ArrayList<ContestantInformation> contestants, String target)
	{
		for (int i = 0; i < contestants.size(); i++)
		{
			if (  contestants.get(i).getFirstName().equals(target))
			{
				return i;
			}
			
		}
		return -1;
	}
	/**
	 * 
	 * @param contestants object passed to use the information to find and look for the last name of the contestant 
	 * @param target last name of the contestant which the user is looking for
	 * @return returns if the last name of and contestant is found or not
	 */
	public static int linearSearchLName(ArrayList<ContestantInformation> contestants, String target)
	{
		for (int i = 0; i < contestants.size(); i++)
		{
			if (  contestants.get(i).getLastName().equals(target))
			{
				return i;
			}
			
		}
		return -1;
	}
	/**
	 * 
	 * @param ints an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int linearSearchDouble(double[] ints, double target)
	{
		for (int i = 0; i < ints.length; i++)
		{
			if ( target == ints[i])
			{
				return i;
			}
			
		}
		return -1;
	}
	
	
	/**
	 * 
	 * @param ints  an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int linearSearchString(String[] ints, String target)
	{
		for (int i = 0; i < ints.length; i++)
		{
			if ( target.equals(ints[i]))
			{
				return i;
			}
			
		}
		return -1;
	}
	
	
	
	
	
}
