package khurana_Searches;
/**
 * This class has  3 binary searches, one for integers, one for doubles, and one for strings
 * The way binary search works is that it looks at the target value and then compares it to the middle valus of the array.
 * If the targt value is greater than the middle value, the whole array is split into the second halof for searching.
 * If the target values is lass than the middle value, the whole array is split into the first half for searching
 * The same process keeps on going until the target value is found in the array. 
 * If the value is found in the array, the index number of where the target was found is returned.
 * If the target value is not found, then -1 is returned 
 * 
 * @author Harkirat Khurana
 *
 */
public class BinarySearch {

	/**
	 * Searches for am integer from an array of doubles using binary search
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

		while (beg  <= end)
		{
			//New middle value is claculated
			mid = beg + (end - beg)/2;
			//if the target comes after the current value being compared to, beginning becomes the mid of the array + 1 index
			if (target > ints[mid])
			{
				beg = mid +1;	
			}
			//if the target comes before the current value being compared to, end becomes the mid of the array - 1 index
			else if (target < ints[mid])
			{
				end = mid - 1;
			}
			//if the target is the value of the index in the array,the index is returned
			else 
			{
				return mid;
			}

		}



		return -1;
	}
	/**
	 * Searches for a double from an array of doubles using binary search
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

		while (beg  <= end)
		{
			//new middle of array is calculated
			mid = beg + (end - beg)/2;
			
			//if the target comes after the current value being compared to, beginning becomes the mid of the array + 1 index
			if (target > ints[mid])
			{
				beg = mid +1;	
			}
			//if the target comes before the current value being compared to, end becomes the mid of the array - 1 index
			else if (target < ints[mid])
			{
				end = mid - 1;
			}
			//if the target is the value of the index in the array,the index is returned
			else 
			{
				return mid;
			}

		}


		return -1;
	}
	/**
	 * Searches for a string from an array using binary search
	 * @param ints in an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int binarySearchString(String[] ints, String target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = ints.length-1;
		mid = ((beg + end)/2) ;

		while(beg <= end ){
			//if the target comes before the current value being compared to, end becomes the mid of the array - 1 index
			if (target.compareTo(ints[mid]) < 0 )
			{
				end = mid -1;
			}
			//if the target comes after the current value being compared to, beginning becomes the mid of the array + 1 index
			else if (target.compareTo(ints[mid])>0)
			{
				beg = mid +1;	
			}
			//if the target is the value of the index in the array,the index is returned
			else if (target.compareTo(ints[mid]) == 0)
			{

				return mid;
			}
			mid = beg + (end - beg)/2;

		}
		return mid;
	}





}








