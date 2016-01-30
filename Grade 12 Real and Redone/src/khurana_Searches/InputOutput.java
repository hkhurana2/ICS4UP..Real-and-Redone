package khurana_Searches;

import java.util.Scanner;
/*
 * This class gives an array and a variable of either a string, double or an integer 
 * and gets the value of the index the value is, if the value is not found ,then -1 is returned 
 */
public class InputOutput {

	public static void main(String[] args) {

		/**
		 * Array of integers used for searching
		 */
		int[] ints = {1,2,34,44,46,58,79,89,95,102,130,150,168,720};
		/**
		 * Array of doubles used for searching
		 */
		double[] doubles = {1.59,2.12,34.16,44.89,46.56,58.18,79.68,89.49,95.61,102.61,130.91,150.98,168.39,720.28};
		/**
		 * Array of strings used for searching
		 */
		String[] strings = {"Ant-Eater", "Bull", "Cow", "Dog", "Elephant", "Falcon", "Goose", "Horse", "Iguana", "Jaguar","Koala", "Lion", "Mongoose", "Narwhal", "Ostrich", "Penguin", "Quetzal", "Rhino", "Starfish", "Tiger", "Umbrella-Bird", "Vulture", "Walrus", "Yak", "Zebra"};

		/**
		 * The target integer value to search
		 */
		int targetInt;
		/**
		 * The target double value to search
		 */
		double targetDouble;
		/**
		 * The target string to search
		 */
		String targetString = null;
		/**
		 * Scanner Initailized
		 */
		Scanner s = new Scanner(System.in);
		/**
		 * 	Object for the LinearSearch class to search for integers, doubles, strings
		 */
		LinearSearch searchLin = new LinearSearch();
		/**
		 * Object for the BinarySearch class to search for integers, doubles, strings
		 */
		BinarySearch searchBin = new BinarySearch();



		/*
		 * menu in infinite loop, there are 3 options: integer, double, or string search
		 *if an option is chosen, program goes through an if structure
		 * and chooses the correct method to run corresponding to the type of linear search
		 * the results of the searches are finally output
		 */

		boolean flag = false;
		//Infinite loop
		do 
		{
			//Options for the searches printed out
			System.out.println("Please choose one of the following options:");
			System.out.println("1. Integer linear search.");
			System.out.println("2. Double linear search.");
			System.out.println("3. String linear search.");
			System.out.println("4. Integer binary search.");
			System.out.println("5.  Double binary search.");
			System.out.println("6. String binary search.");

			//The first integer that the user enter is recorded
			int option = s.nextInt();

			//Option is chosen according to the user's choice
			if(option == 1)
			{
				System.out.println("Please choose one of these integers to search through the array");

				System.out.println("[ ");
				for(int i = 0; i < ints.length; i++)
				{
					System.out.print(ints[i] + ", ");
				}
				System.out.println("]");
				targetInt = s.nextInt();

				int indexOfInt = searchLin.linearSearchInt(ints, targetInt);
				printIntLinear(indexOfInt, targetInt);
			}
			else if (option == 2)
			{
				System.out.println("Please choose one of these double values to search through the array");

				System.out.println("[ ");
				for(int i = 0; i < doubles.length; i++)
				{
					System.out.print(doubles[i] + ", ");
				}
				System.out.println("]");
				targetDouble = s.nextDouble();


				int indexOfDouble = searchLin.linearSearchDouble(doubles, targetDouble);
				printDoubleLinear(indexOfDouble, targetDouble);
			}
			else if (option == 3)
			{
				System.out.println("Please choose one of these words/strings to search through the array");

				System.out.println("[ ");
				for(int i = 0; i < strings.length; i++)
				{
					System.out.print(strings[i] + ", ");
				}
				System.out.println("]");
				targetString = s.next();

				int indexOfString = searchLin.linearSearchString(strings, targetString);
				printStringLinear(indexOfString, targetString);
			}
			else if (option == 4)
			{
				System.out.println("Please choose one of these integers to search through the array");

				System.out.println("[ ");
				for(int i = 0; i < ints.length; i++)
				{
					System.out.print(ints[i] + ", ");
				}
				System.out.println("]");
				targetInt = s.nextInt();

				int	indexOfInt = searchBin.binarySearchInt(ints, targetInt);
				printIntLinear(indexOfInt, targetInt);
			}
			else if (option == 5)
			{
				System.out.println("Please choose one of these double values to search through the array");

				System.out.println("[ ");
				for(int i = 0; i < doubles.length; i++)
				{
					System.out.print(doubles[i] + ", ");
				}
				System.out.println("]");
				targetDouble = s.nextDouble();

				int indexOfDouble = searchBin.binarySearchDouble(doubles, targetDouble);
				printDoubleLinear(indexOfDouble, targetDouble);
			}
			else if (option == 6)
			{
				System.out.println("Please choose one of these words/strings to search through the array");

				System.out.println("[ ");
				for(int i = 0; i < strings.length; i++)
				{
					System.out.print(strings[i] + ", ");
				}
				System.out.println("]");
				targetString = s.next();

				int indexOfString = searchBin.binarySearchString(strings, targetString);

				printStringBinary(indexOfString, targetString);

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
	 * Prints that " ______ was found at ______ index of the array" if finds it
	 * Else, prints that the value is not in the array
	 * @param indexOfInt Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetInt  Target value which was/was not found
	 */
	public static void printIntLinear(int indexOfInt, int targetInt)
	{
		//If the value was found, it is displayed with the index it was in, if ont then value not found is printed
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
	 * Prints that " ______ was found at ______ index of the array" if finds it
	 * Else, prints that the value is not in the array
	 * @param indexOfDouble Index of the double when searched
	 * @param targetDouble target double
	 */
	public static void printDoubleLinear(int indexOfDouble, double targetDouble)
	{
		//If the value was found, it is displayed with the index it was in, if ont then value not found is printed
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
	 *  Prints that " ______ was found at ______ index of the array" if finds it
	 * Else, prints that the value is not in the array
	 * @param indexOfString Index of the string when searched
	 * @param targetString target string
	 */
	public static void printStringLinear(int indexOfString, String targetString)
	{
		//If the value was found, it is displayed with the index it was in, if ont then value not found is printed
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



	/** 
	 * Prints that " ______ was found at ______ index of the array" if finds it
	 * Else, prints that the value is not in the array
	 * Prints in which index the target value of the integer was found. If the target value is not found, "target value is not found"
	 * @param indexOfInt Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetInt Target value which was/was not found
	 */
	public static void printIntBinary(int indexOfInt, int targetInt )
	{
		//If the value was found, it is displayed with the index it was in, if ont then value not found is printed
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
	 *   Prints that " ______ was found at ______ index of the array" if finds it
	 * Else, prints that the value is not in the array
	 * @param indexOfDouble Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetDouble Target value which was/was not found
	 */
	public static void printDoubleBinary(int indexOfDouble, double targetDouble)
	{
		//If the value was found, it is displayed with the index it was in, if ont then value not found is printed
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
	 * Prints that " ______ was found at ______ index of the array" if finds it
	 * Else, prints that the value is not in the array
	 * @param indexOfString Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetString Target value which was/was not found
	 */
	public static void printStringBinary(int indexOfString, String targetString)
	{
		//If the value was found, it is displayed with the index it was in, if ont then value not found is printed
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
