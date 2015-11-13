/**
 * 
 */
package khurana;

import java.util.ArrayList;

/**
 * @author Harkirat Khurana
 *
 */
public class LinearAndBinarySearches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * This class gets a variable and an array for each method(string, double, and integer)
	 * Each of the methods basically do the same thing:
	 * They go through every single element of the array and compare it to the target value 
	 * given. If found, the index the targets in is returned, but if the target in not found in the array, 
	 * -1 is returned
	 */

	/**
	 * 
	 * @param ints an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int linearSearchInt(int[] ints, int target)
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


	/**
	 * 
	 * @param ints  in an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int binarySearchInt(int[] ints, int target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = ints.length;
		mid = ((beg + end)/2) +1;

		for (int i = 0; i < ints.length; i++)
		{
			if (target > ints[mid])
			{
				mid = beg+1;	
			}
			else if (target < ints[mid])
			{
				mid = end-1;
			}
			else if (target == ints[mid])
			{
				i= ints.length;
				return mid;
			}

		}


		return -1;
	}
	/**
	 * 
	 * @param ints in an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int binarySearchDouble(double[] ints, double target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = ints.length;
		mid = ((beg + end)/2) +1;

		for (int i = 0; i < ints.length; i++)
		{
			if (target > ints[mid])
			{
				mid = beg+1;	
			}
			else if (target < ints[mid])
			{
				mid = end-1;
			}
			else if (target == ints[mid])
			{
				i= ints.length;
				return mid;
			}

		}


		return -1;
	}
	/**
	 * 
	 * @param ints in an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int binarySearchLName(ArrayList<ContestantInformation> ints, String target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = ints.size();
		mid = ((beg + end)/2) +1;

		for (int i = 0; i < ints.size(); i++)
		{
			if (target.compareTo(ints.get(mid).getLastName()) > 0)
			{
				mid = beg+1;	
			}
			else if (target.compareTo(ints.get(mid).getLastName()) < 0)
			{
				mid = end-1;
			}
			else if (target.compareTo(ints.get(mid).getLastName()) == 0)
			{
				i= ints.size();
				return mid;
			}

		}


		return -1;	
	}

	public static int binarySearchFName(ArrayList<ContestantInformation> contestants, String target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = contestants.size();
		mid = ((beg + end)/2) +1;

		for (int i = 0; i < contestants.size(); i++)
		{
			if (target.compareTo(contestants.get(mid).getFirstName()) > 0)
			{
				mid = beg+1;	
			}
			else if (target.compareTo(contestants.get(mid).getFirstName()) < 0)
			{
				mid = end-1;
			}
			else if (target.compareTo(contestants.get(mid).getFirstName()) == 0)
			{
				i= contestants.size();
				return mid;
			}

		}


		return -1;	
	}
}
