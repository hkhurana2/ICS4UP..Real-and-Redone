/**
 * 
 */
package khurana;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
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

		menu();

	}

	public static void searchMenu()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please select one of the following available items to search by:");
		System.out.println("1: By First Name");
		System.out.println("2: By Last Name");
		System.out.println("3: By Index");

		String searchIn= in.nextLine();

		if(searchIn.equals("1"))
		{

		}
		else if(searchIn.equals("2"))
		{

		}
		else if(searchIn.equals("3"))
		{

		}
	}

	public static void menu()
	{
		ArrayList<ContestantInformation>  contestants = new ArrayList<ContestantInformation>();

		ArrayList<Label> labels = new ArrayList<Label>();

		Scanner s = new Scanner(System.in);

		ContestantInformation contestant1 = new ContestantInformation(contestant1);
		ContestantInformation contestant2 = new ContestantInformation(contestant2);


		int contestantNum = 0;

		for (int i = 0; i <= 1; i--)
		{
			System.out.println("Welcome to our new reality show: The Caribbean Survivor");
			System.out.println("Please select one of the following options:");
			System.out.println("1: Apply an application");
			System.out.println("2: Print Label");
			System.out.println("3: Search Applicant");
			System.out.println("4: Delete Applicant(s)");
			System.out.println("5: Save");
			System.out.println("6: Load");
			System.out.println("7: Sort all applicants");
			System.out.println("8: Exit");

			String option = s.nextLine();

			if(option.equals("1")){

				getInput1(contestant1, contestants, contestantNum, labels);
				addContestant(contestant1, contestants, labels, contestantNum);
			}
			else if(option.equals("2"))
			{
				printLabel(contestant1, contestants, labels, contestantNum);
			}
			else if(option.equals("3"))
			{
				sarchContestant( contestants ,  contestant1);
			}
			else if(option.equals("4"))
			{
				deleteDecide( contestant1, contestants);
			}
			else if (option.equals("5"))
			{
				//PUT IN THE SAVE METHOD
			}
			else if (option.equals("6"))
			{
				//PUT IN LOAD METHOD
			}
			else if (option.equals("7"))
			{
				sortList( contestant1, contestants);//DOESN'T WORK
			}
			else if (option.equals("8"))
			{
				System.out.println("Bye");
				System.exit(0);

			}

		}
		System.out.println("Please press ENTER to continue.");
		String m = s.nextLine();
	}

	public static void sortList(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants)
	{
		//Collections.sort(contestants);
	}

	public MainInputOutput1()
	{


	}
	public static void getInput1(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants,int contestantNum, ArrayList<Label> label)
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


			System.out.println("Please enter your first name.");
			try{

				flag = false;
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


			System.out.println("Please enter your last name.");
			try{

				flag  = false;
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

				flag= false;
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

				flag= false;
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

				flag= false;
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

				flag= false;
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

				flag= false;
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

				flag= false;
				String ageInput = (myInput.nextLine());
				contestant1.setAge(ageInput);

			}catch(InvalidInfoException e)
			{
				System.out.println(e.getMessage());
				flag = true;
			}
		} while(flag==true);





	}
	public static void deleteDecide(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants)
	{

		Scanner s = new Scanner(System.in);
		System.out.println("1: Delete 1 applications only");
		System.out.println("2: Delete all the applications");

		String deleteOption = s.nextLine();
		if(deleteOption.equals("1"))
		{
			deleteOneContestant(contestant1, contestants);
		}
		else if (deleteOption.equals("2"))
		{
			deleteAllContestants(contestant1, contestants);
		}
	}

	public static void sarchContestant(ArrayList<ContestantInformation> contestants , ContestantInformation contestant1)
	{
		LinearSearch search = new LinearSearch();
		Scanner s = new Scanner(System.in);
		System.out.println("What information do of the contestant do you want to search by?");
		System.out.println("1: First Name");
		System.out.println("2: Last Name");
		String searchOption = s.nextLine();

		if(searchOption.equals("1"))
		{
			System.out.println("Please enter the first name of tha applicant who is to be searched:");
			String target = s.nextLine();
			int searchResult = search.linearSearchFName(contestants, target);
			if(!(searchResult == -1))
			{
				System.out.println(target + ":");
				System.out.println(contestants.get(searchResult));

			}
			else
			{
				System.out.println(target + " was not found or does not exist.");
			}
		}
		else if (searchOption.equals("2"))
		{
			System.out.println("Please enter the last name of tha applicant who is to be searched:");
			String target = s.nextLine();
			int searchResult = search.linearSearchLName(contestants, target);
			if(searchResult == 0)
			{
				System.out.println(target + ":");
				System.out.println(contestants.get(searchResult));
			}
			else
			{
				System.out.println(target + " was not found or does not exist.");
			}
		}

	}

	public static void  printLabel(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants, ArrayList<Label> label,int contestantNum)
	{

		for (int i=0; i < contestants.size();i++){
			Label label1 = new Label(contestants.get(i)); //formats information in the label
			System.out.println(label1.toString()); //prints the label

			System.out.println("");
			System.out.println("");
			System.out.println("");
		}

	}


	public static void addContestant(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants, ArrayList<Label> label, int contestantNum)
	{
		if (contestant1.getAge() > 18)
		{
			contestants.add( new ContestantInformation(contestant1));
			label.add(new Label(contestants.get(contestantNum)));
			contestantNum ++;



		}
		else
		{
			System.out.println("You are not eligible to take part in The Caribbean Survivor.");

		}
	}



	public static void deleteOneContestant(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants)
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Please enter the fist name of the contestent");

		String Cname = name.nextLine();
		/*
		 * The user is asked for the first name of the contestant.
		 * Goes through the arraylist of the contestants and finds the contestant to delete.
		 * If contestant is not found in the arraylist, a message is printed out to the user letting 
		 * him/her know that there is on such contestant.
		 */
		for(int i = 0; i <contestants.size(); i ++)
		{
			if(Cname.equals(contestants.get(i)))
			{
				System.out.println(contestants.get(i));
				System.out.println("Do you want to delete this contestant's application? Please reply in only 'yes' or 'no'.");

				String option = name.nextLine();

				if(option.equals("yes"))
				{
					contestants.remove(i);
					System.out.println(Cname + "'s was deleted");
				}
			}
			else if (!(Cname.equals(contestants.get(i))))
			{
				System.out.println(Cname + " is not a contestant of the reality sho yet.");
			}
		}
	}


	public static void deleteAllContestants(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants)
	{

		for( int i = 0; i < contestants.size(); i ++)
		{
			contestants.remove(i);
		}
		System.out.println("All of the applications have been removed.");
	}


	public static void saveContestants(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants) throws IOException
	{
		
		
		FileOutputStream fileOutputStream = new FileOutputStream("contestants.txt"); //allows saving to the selected file
		PrintStream fps = new PrintStream(fileOutputStream);
		fps.println(contestants.size()); //Number of contestants
		for(int i = 0; i < contestants.size(); i++)
		{ 			
			fps.println(contestants.get(i).getFirstName());
			fps.println(contestants.get(i).getLastName());
			fps.println(contestants.get(i).getStreetNum());
			fps.println(contestants.get(i).getStreetName());
			fps.println(contestants.get(i).getCity());
			fps.println(contestants.get(i).getProvince());
			fps.println(contestants.get(i).getPostalCode());
			fps.println(contestants.get(i).getPhoneNum());
			fps.println(contestants.get(i).getAge());
		}
		fileOutputStream.close();
		
	}

	public static void loadFile(ArrayList <ContestantInformation> contestants , ContestantInformation contestant1) 
	{
	
	BufferedReader fbr = new BufferedReader(new FileReader("contestants.txt"));
	contestants.removeAll(contestants); //clears array before loading new text
		int size = Integer.parseInt(fbr.readLine());
		for (int i = 0; i<size; i++){
			String fName = fbr.readLine();
			String lName = fbr.readLine();
			String streetNum = fbr.readLine();
			String streetName = fbr.readLine();
			String city = fbr.readLine();
			String province = fbr.readLine();
			String postalCode = fbr.readLine();
			String phoneNum = fbr.readLine();
			String age = fbr.readLine();
			
			try {
				contestants.add(new ContestantInformation(fName, lName, streetNum, streetName, city, province, postalCode, phoneNum, age ));
			} catch (InvalidInfoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	


}


}
