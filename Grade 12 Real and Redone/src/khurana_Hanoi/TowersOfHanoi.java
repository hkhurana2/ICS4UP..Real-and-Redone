/**
 * 
 */
package khurana_Hanoi;

import java.util.Scanner;

/**
 * @author Harkirat Khurana
 *
 */
/**
 * @author Harkirat Khurana
 *
 */
public class TowersOfHanoi {


	



/**
 * Main method
 * Calls the method to solve the hanoi puzzle
 * @param args array of strings
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);


		final String SRC = "src";
		final String AUX = "aux";
		final String DST = "dst";

		int temp = Integer.parseInt(myInput.nextLine());
		solver(temp,SRC,AUX,DST);
	}
	/**
	 * 
	 * @param temp tepmorary
	 * @param src the source 
	 * @param aux the auxilary
	 * @param dst the destination
	 */
	public static void solver(int temp, String src,String aux, String dst)
	{
		
		if (temp == 0)
		{
			
			return;
		}
		else 
		{
			
			solver(temp-1,src,dst,aux);
			
			System.out.println("Moved " + src + " to " + dst );
			solver(temp-1,aux,src,dst);
		}
	}

}
