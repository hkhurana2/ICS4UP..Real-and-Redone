package dragonTale_Tests;

import java.util.ArrayList;
import java.util.Random;

public class EncryptionAndDecryption {

	public EncryptionAndDecryption() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * For testing purpose only, data for encyption will come from another rclass
	 * @param args input
	 */
	public static void main(String[] args)
	{
		String saveData ="What did you learn?";
		System.out.println(saveData);
		final int ENCRYPTION_CONSTANT = chooseConstant();
		addRandomChar(saveData, ENCRYPTION_CONSTANT);

	}
/**
 * 
 * @return Returns the value which decides after how many letters to put an extra character
 */
	public static int chooseConstant()
	{

		Random r = new Random();
		int encryptConst = r.nextInt(5)+1; 

		for(int i = 0; i< 1; i--)
		{
			if (encryptConst != 1)
			{
				i = 10;
			}
			else
			{
			encryptConst = r.nextInt(5)+1;
			}
		}

		return encryptConst;
	}

	public static void encrypt(String saveData,final int ENCRYPTION_CONSTANT ){




String coded = Integer.toString(ENCRYPTION_CONSTANT) + saveData ;
		byte[] bytes = ((coded).getBytes());

		StringBuilder binary = new StringBuilder();

		for (byte b : bytes)
		{
			int val = b;
			for (int i = 0; i < 8; i++)
			{
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append("");
		}
		System.out.println("'" + coded + "' to binary: " + binary);


		//invert(saveData, binary,  ENCRYPTION_CONSTANT);
	}
	/*
	public static void invert (String saveData, StringBuilder binary, final int ENCRYPTION_CONSTANT)


	{


		Random r = new Random();



		String newSaveData = binary.toString();

		ArrayList<String> s = new ArrayList();

		String a[]  = new String[s.size()];

		for (int i = 0; i < newSaveData.length(); i ++)
		{

			s.add(Character.toString(newSaveData.charAt(i)));
			System.out.print(s.get(i));

		}


		for(int k = 0; k<s.size(); k++)
		{
			System.out.print(s.get(k));
		}

		a = s.toArray(a);

		System.out.println("");
		for(int m = 0; m< a.length; m++)
		{
			System.out.print(a[m]);
		}

		for(int j = 0; j< a.length; j++)
		{
			if( a[j].equals("1"))
			{
				a[j] = "0";
			}
			if( a[j].equals("0"))
			{
				a[j] = "1";
			}
		}
		System.out.println("");
		for(int m = 0; m< a.length; m++)
		{
			System.out.print(a[m]);
		}


	}
	 */

	public static void addRandomChar (String saveData , final int ENCRYPTION_CONSTANT)
	{

		Random r = new Random();



		String[] randomChar = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};


		System.out.println(randomChar.length);
		
	
		System.out.println(ENCRYPTION_CONSTANT);

		ArrayList<String> a = new ArrayList();

		for(int i  = 0 ; i<saveData.length(); i++)
		{
			a.add(saveData.substring(i, i+1));
		}

		int counter = 0;

		for(int j = 0; j <=a.size(); j++)
		{
			counter++;
			if(counter == ENCRYPTION_CONSTANT)
			{
				counter =0;
				a.add(j, randomChar[r.nextInt(60)+1]);
			}
		}


		String newSaveData = "";
		for(int m = 0; m< a.size(); m++)
		{
			newSaveData = newSaveData + a.get(m);

		}
		System.out.println(newSaveData);
		encrypt(newSaveData, ENCRYPTION_CONSTANT );






	}

	public static String changeToString()
	{
		String s2 = "";   
		char nextChar = 0;
		String s = "00110010010110110011100100110001011110000011101001101010001100110110101100111001010011010010000001001110010000010100011101001101010101110101110100110100001000000110111101001110010001000110010100110101011101000100101000100000011011100100111001000110011001010110101001110010011110000110010001010011001110100111101000100000010011010011110001000110001111000100101000111100011011100010000001110101011011000011000101100001011110000111010001001110011010010110011101101110010110000010000001000110011001000110100001110101011011010110110101001011011011010100100001111001010101110010000001010101011101000100110101100101010011010111100001110100011101000110111000100000011100010110100101000010011100110100111000100000011100100110001000110101011101010101101001101100001100010110110001100111011100110100111001101000001101010110100101001000011101000111001001001110011100110110010101110000011101000011011000100000010000110100111001011010011001010100110101110010011110010110010001110101001011000110101000100000011011010101010001000100011011110101101001100100011100000110000101110101011110010100111000100000001101010011000101011000001110100110000100110011011101010011100101010011001000000111100101000001011010100100110101101100";
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

