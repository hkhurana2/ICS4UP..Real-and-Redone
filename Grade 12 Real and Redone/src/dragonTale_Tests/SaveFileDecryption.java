package dragonTale_Tests;

import java.util.ArrayList;

public class SaveFileDecryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		takeExtrasOut();
	}


	/**
	 * Takes binary values and converts them to a String
	 * @return s2
	 */
	public static String changeToString()
	{
		String s2 = "";   
		char nextChar = 0;
		String s = "0011001101010111011010000100011001100001011101000101010000100000011001000011100001101001011001000110010100100000011110010101000001101111011101010011010000100000011011000110010001100101011000010110011001110010011011100100011000111111";
		for(int i = 0; i <= s.length()-8; i += 8) //this is a little tricky.  we want [0, 7], [9, 16], etc
		{

			nextChar = (char)Integer.parseInt(s.substring(i, i+8), 2);
			s2 += nextChar;
		}

		System.out.println(s2);

		return s2;

	}
	/**
	 * Since when saving the data, it is encrypted by adding extra characters every ceratin number of characters
	 * This method finds where the extra characters are, teks them out, and output the original/useful data
	 */
	public static void takeExtrasOut()
	{
		//getting the string from the binary input
		String s2 = changeToString();

		//finds the constant which is used to space out the extr characters
		//{
		String takeNumOut = s2.substring(0, 1);
		int numOut = Integer.parseInt(takeNumOut);
		//}


		//System.out.println(numOut);
		//The contant number is taken out of the string
		s2 = s2.substring(1);

		//System.out.println(s2);

		//counter for the for loop to set the extra characters to null
		int counter = 0;
		//length of the string
		int s2Length = s2.length();

		//Arraylist of all the characters in the string to be decrypted
		ArrayList<String> s2Seperated2 = new ArrayList<>();
		//all the characters bring added to the arraylist
		for (int i =0; i < s2.length(); i++)
		{
			s2Seperated2.add(s2.substring(i, i+1));
		}
		//Sets all the extra characters to null value
		for (int i = 0; i< s2Length; i++)
		{
			counter++;
			if (counter == numOut)
			{
				s2Seperated2.set(i, null);
				counter = 0;
			}
		}

		String s2Decrypted = null;

		String[] s2Seperated = new String[s2.length()];
		//array;ist being converted to array
		s2Seperated2.toArray(s2Seperated);
		//If there's any of the indexes have a value of null htey are removed nad then the useful characters are added to the final string
		for (int i = 0; i < s2Seperated.length; i++)
		{
			if(!(s2Seperated[i] == null))
			{
				s2Decrypted+= s2Seperated[i];
			}
		}
		System.out.println(s2Decrypted);
		//The first 4 letters of the string are taken out because for some reason, they are "null" every time
		StringBuilder sb = new StringBuilder(s2Decrypted);
		for(int i = 0; i <4; i++)
		{
			if(i > -1)
			{
				sb.deleteCharAt(0);
			}

		}

		s2Decrypted = sb.toString();
		System.out.println(s2Decrypted);

	}


}
