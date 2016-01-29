/**
 * This class encrypts the save data coming in for the save file. 
 * First 
 */
package dragonTale_Tests;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Harkirat Khurana
 *
 */
public class SaveFileEncrypiton {



	/**
	 * For testing purpose only, data for encyption will come from another rclass
	 * @param args
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
		/*
		while(encryptConst == 1)
		{
			encryptConst = r.nextInt(5)+1;	
		}
		*/

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




}
