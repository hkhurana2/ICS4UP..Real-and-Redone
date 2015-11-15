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
import java.util.Random;
import java.util.Scanner;


/**
 * @author Harkirat Khurana
 * This is the main class of this project.
 * In this class, the following tasks are completed:
 * -Adding a new contestant
 * -Deleting one/more than one contestant(s)
 * -Searching for a contestants profile
 * -Loading an already made file made of contestnts' information
 * -Saving the contestants' inforamtion into a new file
 * 
 */
public class MainInputOutput1 {

	/**
	 * Calls the menu in the beginning of the program
	 * @param args An array of strings 
	 * @throws IOException Input/output to text file exception thrown is there is error in inputting when one of the methods from this method is called
	 * @throws InvalidInfoException Input exception thrown is there is error in inputting when one of the methods from this method is called
	 */
	public static void main(String[] args) throws IOException, InvalidInfoException {
		// TODO Auto-generated method stub

		menu();

	}

	/**
	 * 
	 */
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
	/**
	 * Main Menu:
	 * Gives different options for the user to choose
	 * Is in infinite loop, so the program never ends unless the user chooses to
	 * @throws IOException to be used when the search method is being called
	 * @throws InvalidInfoException  to be used when the load method is being called
	 */
	public static void menu() throws IOException, InvalidInfoException
	{
		ArrayList<ContestantInformation>  contestants = new ArrayList<ContestantInformation>();

		ArrayList<Label> labels = new ArrayList<Label>();

		Scanner s = new Scanner(System.in);

		ContestantInformation contestant1 = new ContestantInformation();
		ContestantInformation contestant2 = new ContestantInformation();


		int contestantNum = 0;

		for (int i = 0; i <= 1; i--)
		{

			System.out.println("");
			System.out.println("");

			System.out.println("Welcome to our new reality show: The Caribbean Survivor");
			System.out.println("Please select one of the following options:");
			System.out.println("");
			System.out.println("1: Apply an application");
			System.out.println("2: Print Label");
			System.out.println("3: Search Applicant");
			System.out.println("4: Delete Applicant(s)");
			System.out.println("5: Save");
			System.out.println("6: Load");
			System.out.println("7: Sort all applications");
			System.out.println("8: Exit");


			String option = s.nextLine();

			if(option.equals("1")){

				int question = getInput1(contestant1, contestants, contestantNum);
				addContestant(contestant1, contestants, labels, contestantNum, question);
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
				saveFile( contestant1,  contestants);
			}
			else if (option.equals("6"))
			{
				loadFile( contestants ,  contestant1);
			}
			else if (option.equals("7"))
			{
				int sort =	sortDecide();
				if (sort == 1)
				{
					bubbleFNameSort( contestants,  contestant1) ;
				}
				else if (sort == 2)
				{
					bubbleLNameSort( contestants,  contestant1) ;
				}
				else
				{
					System.out.println("Please go back to the menu and try again.");
				}
			}
			else if (option.equals("8"))
			{
				System.out.println("Bye");
				System.exit(0);

			}

		}
		System.out.println("Please press ENTER to continue.");
		System.out.println("");
		System.out.println("");
		String m = s.nextLine();
	}

	/**
	 * Empty constructor
	 */
	public MainInputOutput1()

	{


	}
	/**
	 * Get information from the applicant
	 * @param contestant1 input from the user and stores it in the arraylist
	 * @param contestants object of applicant information to be stored in this array
	 * @param contestantNum keeps track of # of contestants
	 * @return returns if the user got the scurity question correct or incorrect
	 */
	public static int getInput1(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants,int contestantNum)
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

		int securityQ = securityQ();

		return securityQ;



	}
	/**
	 * Decides weather to delete one or all contestants
	 * @param contestant1 an instance of this object will be deleted
	 * @param contestants one or all of the objects to be deleted decided by the user.
	 * @throws InvalidInfoException When the menu method is called
	 * @throws IOException when the menu method is called
	 */
	public static void deleteDecide(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants) throws IOException, InvalidInfoException
	{
		//scanner is declared
		Scanner s = new Scanner(System.in);
		System.out.println("1: Delete 1 applications only");
		System.out.println("2: Delete all the applications");
		// option form the user is stored in a string
		String deleteOption = s.nextLine();
		//depending on the input of the user 3 things can happen

		if(deleteOption.equals("1"))
		{
			deleteOneContestant(contestant1, contestants);
		}
		else if (deleteOption.equals("2"))
		{
			deleteAllContestants(contestant1, contestants);
		}
		else
		{
			System.out.println("Plese Try Again.");

		}

	}
	/**
	 * A contestant is searched by their first or last name and if found, their label is printed
	 * @param contestants An object from this arraylist will be searched and printed 
	 * @param contestant1 An instance of this object will be searched 
	 */
	public static void sarchContestant(ArrayList<ContestantInformation> contestants , ContestantInformation contestant1)
	{

		LinearSearch search = new LinearSearch();
		Scanner s = new Scanner(System.in);
		//options are displyed to the user
		System.out.println("What information do of the contestant do you want to search by?");
		System.out.println("1: First Name");
		System.out.println("2: Last Name");
		//input is stored
		String searchOption = s.nextLine();

		//Contestant is searched by his/her first name by calling another method in another class
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
		//Contestant is searched by their last name by calling another method in another class
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
			//The contestant searched for does not exist
			else
			{
				System.out.println(target + " was not found or does not exist.");
			}
		}
		else
		{
			System.out.println("Invalid choice. Please try again from the main menu");
		}

	}
	/**
	 * Prints all of the contestants' information
	 * @param contestant1 An object which hold the information for an applicant
	 * @param contestants Arraylist holding objects holding the application information
	 * @param label An object of the Labl class which is used to print the contestants' information from the contestats araylist
	 * @param contestantNum The label # is used to print the label of the applicants
	 */
	public static void  printLabel(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants, ArrayList<Label> label,int contestantNum)
	{
		if(contestants.size() ==0)
		{
			System.out.println("There are no contestants to print the label(s) of.");
		}
		for (int i=0; i < contestants.size();i++){
			//information is formatted in the Label class
			Label label1 = new Label(contestants.get(i));
			//label is printed
			System.out.println(label1.toString()); 

			System.out.println("");
			System.out.println("");
			System.out.println("");
		}

	}
	/**
	 * Checks if the applicant is older than 18 years and if he/she got the security question right.
	 * If any of the 2 conditions are not met, the applicant wont be added as a contestant
	 * @param contestant1 Age used from this determine if the applicant is old enough to apply
	 * @param contestants contestant1 to be added to this arraylist
	 * @param label An object of the Label class whihc is used to print the contestants' information
	 * @param contestantNum used to add the contestant at the appropriate index
	 * @param question used to determine it the user is smart and/or if this a bot
	 */
	public static void addContestant(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants, ArrayList<Label> label, int contestantNum, int question)
	{
		//2 coditions are there to decide if the applicant becomes a contestant
		if (contestant1.getAge() >= 18 && question == 1)
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
	/**Deletes only one contestant from the arraylist. 
	 * The contestant to be deleted is chosen by the user
	 * @param contestant1 one of these instances will be deleted
	 * @param contestants one of the objects from this arraylist will be deleted
	 */
	public static void deleteOneContestant(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants)
	{

		Scanner s = new Scanner(System.in);



		/*
		 * The user is asked for the first name of the contestant.
		 * Goes through the arraylist of the contestants and finds the contestant to delete.
		 * If contestant is not found in the arraylist, a message is printed out to the user letting 
		 * him/her know that there is on such contestant.
		 */
		if (contestants.size() > 0)
		{
			System.out.println("Which of the following contestants do you want to delete");

			for(int i = 0; i < contestants.size(); i++)
			{
				System.out.println((i+1) + ": " + contestants.get(i).getFirstName() + " " + contestants.get(i).getLastName());
			}
			String deleteChoice = s.nextLine();

			for(int j = 0; j< deleteChoice.length(); j++)
			{
				if(!(Character.isDigit(deleteChoice.charAt(j))))
				{
					System.out.println("Only numbers should have been inputted.");
					System.out.println("Please go to the menu and try again.");
					break;
				}
				else
				{

				}
			}
			int deleteChoice1 =Integer.parseInt(deleteChoice);

			if(deleteChoice1 > 0 && deleteChoice1 < contestants.size())
			{
				contestants.remove(deleteChoice1);
				System.out.println(contestants.get(deleteChoice1-1).getFirstName() + " " + contestants.get(deleteChoice1-1).getLastName() + "'s application has beem removed.");
			}
		}
		else if (contestants.size() <= 0)
		{
			System.out.println("There are no contestants to delete");
		}
		else
		{
			System.out.println("");
		}


	}
	/**
	 * Deletes all of the contstants from the arraylist
	 * @param contestant1 all of the instances of this arraylist will be deleted
	 * @param contestants all the objects from this arraylist will be deleted
	 */
	public static void deleteAllContestants(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants)
	{
		if(contestants.size() <= 0)
		{
			System.out.println("There are no contestants to delete");
		}
		//All the objects from the arraylist are removed
		contestants.removeAll(contestants);
		System.out.println("All of the applications have been removed.");
	}
	/**Saves all of the application into a text file
	 * 
	 * @param contestant1 Objects holding the information for each contestant. Information from this object to be printed in the text file.
	 * @param contestants arraylist to by taken the objects and saved in a txt file
	 * @throws IOException Gives an exception if printing to the text file is not working
	 */
	public static void saveFile(ContestantInformation contestant1, ArrayList<ContestantInformation> contestants) throws IOException
	{

		if(contestants.size() <= 0)
		{
			System.out.println("There are no contestants to save. Please enter some contestants and try again.");	
		}
		else 
		{
			//allows saving to the selected file
			FileOutputStream fileOutputStream = new FileOutputStream("contestants.txt"); 
			PrintStream fps = new PrintStream(fileOutputStream);
			fps.println(contestants.size()); //Number of contestants
			//loop is ran the same number of times as the number of contestants to fill the information
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
			//printing is stopped after all the information is inputed
			fileOutputStream.close();
			//final message for the user to let them know that the contestants have been saved
			System.out.println("Contestants are saved.");
		}
	}
	/**Loads contestant information from a text file
	 * 
	 * @param contestants An arraylist holding the objects holding the contestant's information
	 * @param contestant1 the object's information stored holds the application's information  
	 * @throws IOException Throws an exception if there is any problem with outputting/inputting to and from/to the text file
	 * @throws InvalidInfoException throws exception if there is some type of error
	 */
	public static void loadFile(ArrayList <ContestantInformation> contestants , ContestantInformation contestant1) throws IOException, InvalidInfoException 
	{

		BufferedReader fbr = new BufferedReader(new FileReader("contestants.txt"));
		contestants.removeAll(contestants); //clears array before loading new text
		int size = Integer.parseInt(fbr.readLine());
		//information from the text file is first inputed into a string and then into an object and then the object is finally stored into an arraylist
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


			contestant1.setFirstName(fName);
			contestant1.setLastName(lName);
			contestant1.setStreetNum(streetNum);
			contestant1.setStreetName(streetName);
			contestant1.setCity(city);
			contestant1.setProvince(province);
			contestant1.setPostalCode(postalCode);
			contestant1.setPhoneNum(phoneNum);
			contestant1.setAge(age);


			contestants.add( new ContestantInformation(contestant1));


		}	


	}
	/**
	 * Another class is called to ask a simple randomly generted amth question
	 * @return returns if the applicant got the security question right or wrong
	 */
	public static int securityQ()
	{
		//message to the user
		System.out.println("Registration almost complete, to check if you are actually a human, here is a security question:");
		System.out.println("");
		System.out.println("");
		SecurityQ question = new SecurityQ();
		//random number to decide which operation of arithemtic to do
		Random rng1 = new Random();
		int QType = rng1.nextInt(4)+1;
		//if result of the questions are correct, 1 is returned else -1 
		if (QType == 1)
		{
			int QResult = question.add();

			if(QResult == 1)
			{
				return 1;
			}
			else 
			{
				return -1;
			}
		}
		else if (QType == 2)
		{
			int QResult = question.subtract();

			if(QResult == 1)
			{
				return 1;
			}
			else 
			{
				return -1;
			}
		}
		else	if (QType == 3)
		{
			int QResult = question.multiply();

			if(QResult == 1)
			{
				return 1;
			}
			else 
			{
				return -1;
			}
		}
		else	if (QType == 4)
		{
			int QResult = question.divide();

			if(QResult == 1)
			{
				return 1;
			}
			else 
			{
				return -1;
			}
		}


		return -1;
	}
	/** 
	 *  Re-arranges all the contestants from their first name
	 * original source: http://stackoverflow.com/questions/8938235/java-sort-an-array
	 * It was changes to work with arraylist and also to go through every single letter of the names
	 * @param array Arraylist of contestants
	 * @param contestant1 contestant object holing the contestant's information
	 */
	public static void bubbleFNameSort(ArrayList<ContestantInformation> array, ContestantInformation contestant1) 
	{

		boolean swapped = true;
		int j = 0;

		ContestantInformation lesser;
		ContestantInformation greater;
		while (swapped) 
		{
			swapped = false;
			j++;
			for (int i = 0; i < array.size() - j; i++) 
			{
				//first letters of the first name of contestants
				char fNameF1 = array.get(i).getFirstName().charAt(0);
				char fNameF2 = array.get(i+1).getFirstName().charAt(0);
				//if the first letter of the first names are not in order, they are switched
				if (fNameF1 > fNameF2)
				{
					greater = array.get(i);
					lesser = array.get(i+1);
					array.set(i, lesser);
					array.set(i+1, greater);
					swapped = true;
				}

				//if the first letter is the same of both names: 
				if (fNameF1 == fNameF2)
				{

					int smallerName;
					//smaller name is calculated
					if(array.get(i).getFirstName().length()  < array.get(i+1).getFirstName().charAt(0))
					{
						smallerName = array.get(i).getFirstName().length();
					}
					else 
					{
						smallerName = array.get(i+1).getFirstName().length();
					}
					//Starting from the second letter, all letters are compared, if first first name's i(th) is greater than the second contestants first name, the 2 names are swapped
					//Once the names are swapped, the for loop ends
					for(int m = 1; m < smallerName; m++)
					{
						char fNameF1Again = array.get(i).getFirstName().charAt(m);
						char fNameF2Again = array.get(i+1).getFirstName().charAt(m);
						if (fNameF1Again > fNameF2Again)
						{
							greater = array.get(i);
							lesser = array.get(i+1);
							array.set(i, lesser);
							array.set(i+1, greater);
							swapped = true;
							break;
						}
					}
				}
			}
		}

		System.out.println("The contestant have been sorted by their first name.");
	}
	/**
	 * Re-arranges all the contestants from their last name
	 * original source: http://stackoverflow.com/questions/8938235/java-sort-an-array
	 * It was changes to work with arraylist and also to go through every single letter of the names
	 * @param array Arraylist holing the contestants
	 * @param contestant1 Object holding the contestants information
	 */
	public static void bubbleLNameSort(ArrayList<ContestantInformation> array, ContestantInformation contestant1)

	{

		boolean swapped = true;
		int j = 0;

		ContestantInformation lesser;
		ContestantInformation greater;
		while (swapped) 
		{
			swapped = false;
			j++;
			for (int i = 0; i < array.size() - j; i++) 
			{
				//first letters of the first name of contestants
				char fNameF1 = array.get(i).getLastName().charAt(0);
				char fNameF2 = array.get(i+1).getLastName().charAt(0);
				if (fNameF1 > fNameF2)
				{
					greater = array.get(i);
					lesser = array.get(i+1);
					array.set(i, lesser);
					array.set(i+1, greater);
					swapped = true;
				}

				//if the first letter is the same of both names: 
				if (fNameF1 == fNameF2)
				{

					int smallerName;
					//smaller name is calculated
					if(array.get(i).getLastName().length()  < array.get(i+1).getLastName().charAt(0))
					{
						smallerName = array.get(i).getLastName().length();
					}
					else 
					{
						smallerName = array.get(i+1).getLastName().length();
					}
					//Starting from the second letter, all letters are compared, if first first name's i(th) is greater than the second contestants first name, the 2 names are swapped
					//Once the names are swapped, the for loop ends
					for(int m = 1; m < smallerName; m++)
					{
						char fNameF1Again = array.get(i).getLastName().charAt(m);
						char fNameF2Again = array.get(i+1).getLastName().charAt(m);
						if (fNameF1Again > fNameF2Again)
						{
							greater = array.get(i);
							lesser = array.get(i+1);
							array.set(i, lesser);
							array.set(i+1, greater);
							swapped = true;
							break;
						}
					}
				}
			}
		}

		System.out.println("The contestant have been sorted by their first name.");
	}
	/**
	 * Decides whether to sort from first name or last name
	 * @return between the value of -1, 1, 2
	 */
	public static int sortDecide()
	{
		//user decided whether to sort the contestants by their first name or last name
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to sort the contestants by their first name of last name?");
		System.out.println("1- First name");
		System.out.println("2- Last Name");
		String sortDecide = s.nextLine();
		if(sortDecide.equals("1") )
		{
			return 1;
		}
		else if (sortDecide.equals("2"))
		{
			return 2;
		}
		return -1;
	}




}
