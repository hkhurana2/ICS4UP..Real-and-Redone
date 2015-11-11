/**
 * 
 */
package khurana;

import java.util.Scanner;

/**
 * @author Harkirat Khurana
 *
 */
public class MainInputOutput1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContestantInformation contestant1 = new ContestantInformation();


		ContestantInformation contestant2 = new ContestantInformation();
		
      getInput(contestant1);
      printLabel(contestant1);

	}
	
	
	public MainInputOutput1()
	{
		

	}
	public static void getInput(ContestantInformation contestant1)
	{
		//scanner declared to be used to get user input for various things
		Scanner myInput = new Scanner(System.in);

		//empty constructor
		

		/*
		 * counter for the do while loop. If users do not enter the information in the correct format
		 * flag will stay false and won't let the user continue without inputting the correct information in a correct format
		 */

		boolean flag = false;

		/**
		 * Gets input from user for their first name
		 */

		do{
			flag = false;

			System.out.println("Please enter your first name.");
			try{


				String fNameInput = (myInput.nextLine());
				contestant1.setFirstName(fNameInput);

				// If the input is not entered correctly, this catches the problem and throws an exception at the user.
			}catch(InvalidInfoException i)
			{
				System.out.println(i.getMessage());
				flag = true;

			}
		} while(flag);



		/**
		 * Gets input from user for their last name
		 */

		do{

			flag  = false;
			System.out.println("Please enter your last name.");
			try{


				String lNameInput = (myInput.nextLine());
				contestant1.setLastName(lNameInput);

			}catch(InvalidInfoException e)
			{
				System.out.println(e.getMessage());
				flag = true;
			}
		} while(flag);


		/**
		 * Gets input from user for their street number
		 */

		do{


			System.out.println("Please enter your street number.");

			try{

				flag = false;

				String streetNumInput = (myInput.nextLine());
				contestant1.setStreetNum(streetNumInput);

			}catch(InvalidInfoException e)
			{

				System.out.println(e.getMessage());
				flag = true;
			}
		} while(flag);


		/**
		 * Gets input from user for their street name
		 */

		do{


			System.out.println("Please enter your street name.");
			try{


				String streetNameInput = (myInput.nextLine());
				contestant1.setStreetName(streetNameInput);

			}catch(InvalidInfoException e)
			{
				System.out.println(e.getMessage());
				flag = true;
			}
		} while(flag);


		/**
		 * Gets input from user for their city
		 */

		do{


			System.out.println("Please enter your city.");
			try{


				String cityInput = (myInput.nextLine());
				contestant1.setCity(cityInput);

			}catch(InvalidInfoException e)
			{
				flag = true;
				System.out.println(e.getMessage());

			}
		} while(flag);


		/**
		 * Gets input from user for their province
		 */

		do{


			System.out.println("Please enter your province.");
			try{


				String provinceInput = (myInput.nextLine());
				contestant1.setProvince(provinceInput);
				

			}catch(InvalidInfoException e)
			{
				flag = true;
				System.out.println(e.getMessage());

			}
			
		} while(flag);


		/**
		 * Gets input from user for their postal code
		 */

		do{


			System.out.println("Please enter your postal code.");
			try{


				String postalCodeInput = (myInput.nextLine());
				contestant1.setPostalCode(postalCodeInput);

			}catch(InvalidInfoException e)
			{
				System.out.println(e.getMessage());
				flag = true;
			}
		} while(flag);


		/**
		 * Gets input from user for their phone number
		 */

		do{


			System.out.println("Please enter your phone number.");
			try{


				String phoneNumInput = (myInput.nextLine());
				contestant1.setPhoneNum(phoneNumInput);

			}catch(InvalidInfoException e)
			{
				System.out.println(e.getMessage());
				flag = true;
			}
		} while(flag==true);

		do{


			System.out.println("Please enter your age of when the reality show will start.");
			try{


				String ageInput = (myInput.nextLine());
				contestant1.setAge(ageInput);

			}catch(InvalidInfoException e)
			{
				System.out.println(e.getMessage());
				flag = true;
			}
		} while(flag==true);
	}
	
	



	public static void  printLabel(ContestantInformation contestant1)
	{
		Label print = new Label(contestant1);

		print.toString();


	}
	
	
	public static void addContestant(ContestantInformation contestant1)
	{
		if (contestant1.getAge() < 18)
		{
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
