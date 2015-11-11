package khurana;

public class ContestantInformation {


	/**
	 *  @author Harkirat Khurana
	 */

	String specialChars[] = {"!","@","#","$","%","^","&","*","(",")","|","{","}","[","]","'",";",":",">","<","=","|","~","`",};

	private String firstName , lastName, streetNum, streetName, city, province, postalCode, phoneNum, age;

	/**
	 * 
	 * @param firstName1 sets first name
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setFirstName (String firstName1) throws InvalidInfoException
	{
		if (firstName1.length() <= 0)
		{
			throw new InvalidInfoException("Your name cannot have 0 letters.");
		}
		firstName = firstName1;
	}
	/**
	 * 
	 * @param lastName1 Sets lasttName
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setLastName (String lastName1)throws InvalidInfoException

	{

		if(lastName1.length()<= 0)
		{
			throw new InvalidInfoException("Your last name cannot have 0 letters.");	
		}
		lastName1= lastName1.toLowerCase();
		this.lastName = lastName1;

	}
	/**
	 *
	 * @param streetNum1 Sets streetNum 
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setStreetNum (String streetNum1) throws InvalidInfoException
	{
		if(streetNum1.length()<=0)
		{
			throw new InvalidInfoException("Please enter a street number. If you do not have a street number, please input 'zero'.");
		}
		else if ((streetNum1.matches("[A-Z]*")))
		{
			throw new InvalidInfoException("Please enter a street number. If you do not have a street number, please input 'zero'.awef");
		}
		streetNum = streetNum1;



	}
	/**
	 *
	 * @param streetName1 Sets streetName 
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setStreetName (String streetName1)throws InvalidInfoException
	{
		int streetNameLength = streetName1.length();

		for ( int i = 0; i>= streetNameLength; i++)
		{
			if (!(Character.isLetter(i) == true))
			{

				throw new InvalidInfoException("Please do not include numbers.");

			}
		}
		this.streetName = streetName1;
	}
	/**
	 * 
	 * @param city1 sets city
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setCity (String city1)throws InvalidInfoException
	{
		int cityLength = city1.length();

		for ( int i = 0; i>= cityLength; i++)
		{
			if (!(Character.isLetter(i)== true))
			{

				throw new InvalidInfoException("Please only include letters.");
			}
		}
		this.city = city1;
	}
	/**
	 * 
	 * @param province1 sets province
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setProvince (String province1) throws InvalidInfoException
	{



		if (!(province1.equalsIgnoreCase("AB") || province1.equalsIgnoreCase("BC") || province1.equalsIgnoreCase("MB") || province1.equalsIgnoreCase("NL") || province1.equalsIgnoreCase("NS") || province1.equalsIgnoreCase("NT") || province1.equalsIgnoreCase("NU") || province1.equalsIgnoreCase("ON") || province1.equalsIgnoreCase("PE") || province1.equalsIgnoreCase("QS") || province1.equalsIgnoreCase("SK") || province1.equalsIgnoreCase("YT") )|| province1.matches("[0-9]"))
		{

			throw new InvalidInfoException("Province name invalid. Please enter one of the following:AB- Alberta, BC- British Colombia, MB- Manitoba, NL- Newfoundland and Labrador, NS- Nova Scotia, NT- Northwest Territories, NU- Nunavut, ON- Ontario, PE- Prince Edward Island, QS- Quebec, SK- Seskatchewan, YT- Yukon Territory");


		}

		if (province1.equals("AB") ||province1.equals("Alberta"))
		{
			province = "AB";
		}

		else if (province1.equals("BC") ||province1.equals("British Colombia"))
		{
			province1 = "BC";
		}
		else if (province1.equals("MB") ||province1.equals("Manitoba"))
		{
			province1 = "MB";
		}
		else if (province1.equals("NL") ||province1.equals("Newfoundland and Labrador"))
		{
			province1 = "NL";
		}
		else if (province1.equals("NS") ||province1.equals("Nova Scotia"))
		{
			province1 = "NS";
		}
		else if (province1.equals("NT") ||province1.equals("Nunavut"))
		{
			province1 = "NT";
		}
		else if (province1.equals("ON") ||province1.equals("Ontario"))
		{
			province1 = "ON";
		}
		else if (province1.equals("PE") ||province1.equals("Prince Edward Island"))
		{
			province1 = "PE";
		}
		else if (province1.equals("QS") ||province1.equals("Quebec"))
		{
			province1 = "QS";
		}
		else if (province1.equals("SK") ||province1.equals("Saskatchewan"))
		{
			province1 = "SK";
		}
		else if (province1.equals("YK") ||province1.equals("Yukon Territory"))
		{
			province1 = "YK";
		}


		this.province = province1;
	}
	/**
	 * 
	 * @param postalCode1 sets postalCode
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setPostalCode (String postalCode1)throws InvalidInfoException
	{
		if(postalCode1.length()> 6 || postalCode1.length()< 6)
		{
			throw new InvalidInfoException("Postal code invalid. Please only write the numbers and the letters. Do not include any - or () or spaces.");
		}
		else if (!(postalCode1.matches("[A-Z][0-9][A-Z][0-9][A-Z][0-9]")))
		{
			throw new InvalidInfoException("Postal Code Invalid. Please try again.");
		}


		this.postalCode = postalCode1;
	}
	/**
	 * 
	 * @param phoneNum1 sets phoneNum
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setPhoneNum (String phoneNum1)throws InvalidInfoException
	{
		if (!(phoneNum1.length() ==10))
		{
			throw new InvalidInfoException("Please enter a valid phone number.");
		}
		if(!phoneNum1.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
		{
			throw new InvalidInfoException("Only include numbers please.");
		}


		this.phoneNum = phoneNum1;

	}
	/**
	 * 
	 * @param birthDay1 sets birthDay
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setAge (String age1)throws InvalidInfoException
	{ 
		for(int k = 0; k >= age1.length(); k++)
		{
			if(!(Character.isDigit(age1.charAt(k)))== true)
			{
				throw new InvalidInfoException("Please use only digits.");
			}
		}

		if(Integer.parseInt(age1)  <=0)
		{
			throw new InvalidInfoException("Being under 0 years is not possible. Also, if you are 0 and can use a computer, please book an appointment with us so we can talk to you personally.");
		}
		else if(Integer.parseInt(age1) > 125 )
		{
			throw new InvalidInfoException("We are sorry, but you are way too old to participate in our reality show.");
		}

		this.age = age1;
	}


	/**
	 * 	
	 * @return firstName returns firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 *
	 * @return lastName returns firstName 
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * 
	 * @return streetNum returns firstName
	 */
	public String getStreetNum()
	{
		return streetNum;
	}
	/**
	 * 
	 * @return streetName returns streetName
	 */
	public String getStreetName()
	{
		return streetName;
	}
	/**
	 * 
	 * @return city returns city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * 
	 * @return province returns province
	 */
	public String getProvince()
	{
		return province;
	}
	/**
	 * 
	 * @return postalCode returns postalCode
	 */
	public String getPostalCode()
	{
		return postalCode;
	}
	/**
	 * 
	 * @return phoneNum sets phoneNum
	 */
	public String getPhoneNum()
	{
		return phoneNum;
	}
	/**
	 * 
	 * @return birthDay returns birthDay
	 */
	public int getAge()
	{
		return (Integer.parseInt(age)) ;
	}


	public ContestantInformation()

	{

	}
	/**
	 * 
	 * @param firstName a
	 * @param lasttName a
	 * @param streetNum a
	 * @param streetName a 
	 * @param city a
	 * @param province a
	 * @param postalCode a
	 * @param birthDay a
	 * @param birthMonth a
	 * @param birthYear a
	 */
	public ContestantInformation(String firstName, String lasttName, String streetNum, String streetName, String city, String province, String postalCode, int birthDay, int birthMonth, int birthYear )
	{

	}


	/**
	 * 
	 * @param firstName a
	 * @param lasttName a
	 * @param streetNum a
	 * @param streetName a 
	 * @param city a
	 * @param province a 
	 * @param postalCode a
	 * @param birthDay a
	 * @param birthMonth a
	 * @param birthYear a
	 * @return (firstName +  " " + lastName +  " " + streetNum +  " " + streetName +  " " + city +  " " + province +  " " + postalCode +  " " + phoneNum +  " " + birthDay +  " " + birthMonth +  " " + birthYear)
	 */
	public String toString (String firstName, String lasttName, String streetNum, String streetName, String city, String province, String postalCode, int birthDay, int birthMonth, int birthYear)
	{
		return (firstName +  " " + lastName +  " " + streetNum +  " " + streetName +  " " + city +  " " + province +  " " + postalCode +  " " + phoneNum +  " " + birthDay +  " " + birthMonth +  " " + birthYear);

	}

}
