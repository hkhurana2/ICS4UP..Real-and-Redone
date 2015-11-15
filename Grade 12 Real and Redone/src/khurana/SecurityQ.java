


package khurana;


import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Harkirat Khurana
 *
 */
public class SecurityQ {



/**
 * 
 * @return returns if the user got the addition wrong or right
 */
	public static int add() {
		

		Random rng1 = new Random();
		Random rng2 = new Random();
		Random rng3 = new Random();


	

		int int1 = rng1.nextInt(20)+1;
		int int2 = rng2.nextInt(20)+1;
		int int3 = rng3.nextInt(4)+1;
		int int4 = 0;


		Scanner myInput = new Scanner(System.in);

		int3 = int1 + int2;
		System.out.println(int1 + " + " + int2 + "= ");
		int4 = Integer.parseInt(myInput.nextLine());
		if(int3 == int4)
		{
			System.out.println("Correct!");
			return 1;

		}
		else if (int3 != int4)
		{
			System.out.println("Incorrect!");
			return -1;

		}
		return -1;
	}

/**
 * 
 * @return returns if the user got the subtraction wrong or right
 */
	public static int subtract()
	{
		Random rng1 = new Random();
		Random rng2 = new Random();
		Random rng3 = new Random();


		

		int int1 = rng1.nextInt(20)+1;
		int int2 = rng2.nextInt(20)+1;
		int int3 = rng3.nextInt(4)+1;
		int int4 = 0;


		Scanner myInput = new Scanner(System.in);

		int3 = int1 + int2;
		System.out.println(int1 + " + " + int2 + "= ");
		int4 = Integer.parseInt(myInput.nextLine());
		if(int3 == int4)
		{
			System.out.println("Correct!");
			return 1;

		}
		else if (int3 != int4)
		{
			System.out.println("Incorrect!");
			return -1;

		}
		return -1;
	}

/**
 * 
 * @return returns if the user got the multiplication wrong or right
 */
	public static int multiply()
	{Random rng1 = new Random();
	Random rng2 = new Random();
	Random rng3 = new Random();


	

	int int1 = rng1.nextInt(20)+1;
	int int2 = rng2.nextInt(20)+1;
	int int3 = rng3.nextInt(4)+1;
	int int4 = 0;


	Scanner myInput = new Scanner(System.in);

	int3 = int1 + int2;
	System.out.println(int1 + " + " + int2 + "= ");
	int4 = Integer.parseInt(myInput.nextLine());
	if(int3 == int4)
	{
		System.out.println("Correct!");
		return 1;

	}
	else if (int3 != int4)
	{
		System.out.println("Incorrect!");
		return -1;

	}
	return -1;
	}

/**
 * 
 * @return returns if the user got the division wrong or right
 */
	public static int divide()
	{
		int  array1[] = {1,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int  array2[] = {0,2,4,6,8,10,12,14,16,18,20,2,4,6,8,10,12,14,16,18,20};
		int  array3[] = {0,3,6,9,12,15,18,21,24,27,30,3,6,9,12,15,18,21,24,27,30};
		int  array4[] = {0,4,8,12,16,20,24,28,32,36,40,4,8,12,16,20,24,28,32,36,40};
		int  array5[] = {0,5,10,15,20,25,30,35,40,45,50,5,10,15,20,25,30,35,40,45,50};
		int  array6[] = {0,6,12,18,24,30,36,42,48,54,60,6,12,18,24,30,36,42,48,54,60};
		int  array7[] = {0,7,14,21,28,35,42,49,56,63,70,7,14,21,28,35,42,49,56,63,70};
		int  array8[] = {0,8,16,24,32,40,48,56,64,72,80,8,16,24,32,40,48,56,64,72,80};
		int  array9[] = {0,9,18,27,36,45,54,63,72,81,90,9,18,27,36,45,54,63,72,81,90};
		int array10[] = {0,10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,100};
		int array11[] = {0,11,22,33,44,55,66,77,88,99,110,11,22,33,44,55,66,77,88,99,110};
		int array12[] = {0,12,24,36,48,60,72,84,96,108,120,12,24,36,48,60,72,84,96,108,120};
		int array13[] = {0,13,26,39,52,65,78,91,104,117,130,13,26,39,52,65,78,91,104,117,130};
		int array14[] = {0,14,28,42,56,70,84,98,112,126,140,0,14,28,42,56,70,84,98,112,126,140};
		int array15[] = {0,15,30,45,60,75,90,105,120,135,150,15,30,45,60,75,90,105,120,135,150};
		int array16[] = {0,16,32,48,64,80,96,112,128,144,160,16,32,48,64,80,96,112,128,144,160};
		int array17[] = {0,17,34,51,68,85,102,119,136,153,170,17,34,51,68,85,102,119,136,153,170};
		int array18[] = {0,18,36,54,72,90,108,126,144,162,180,18,36,54,72,90,108,126,144,162,180};
		int array19[] = {0,19,38,57,76,95,114,133,152,171,190,19,38,57,76,95,114,133,152,171,190};
		int array20[] = {0,20,40,60,80,100,120,140,160,180,200,20,40,60,80,100,120,140,160,180,200};

		Random rng1 = new Random();
		Random rng2 = new Random();
		Random rng3 = new Random();
		Random rng4 = new Random();
		Random rng5 = new Random();

		int int1 = rng1.nextInt(20)+1;
		int int2 = rng2.nextInt(20)+1;
		int int3 = rng3.nextInt(4)+1;
		int int4 = rng4.nextInt(20)+1;
	
		int int6 = 0;

		Scanner myInput  = new Scanner(System.in);

		



		if(int4 ==1)
		{

			int2 = 1;
			int1 = array1[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());

			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}	
		}
		else if(int4 ==2)
		{
			int2 = 2;
			int1 = array2[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());

			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}			
		}

		else if(int4 ==3)
		{
			int2 = 3;
			int1 = array3[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());

			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}	
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==4)
		{
			int2 = 4;
			int1 = array4[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());

			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==5)
		{
			int2 = 5;
			int1 = array5[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());

			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==6)
		{
			int2 = 6;
			int1 = array6[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());

			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==7)
		{
			int2 = 7;
			int1 = array7[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==8)
		{
			int2 = 8;
			int1 = array8[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==9)
		{
			int2 = 9;
			int1 = array9[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}
		else if(int4 ==10)
		{
			int2 = 10;
			int1 = array10[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==11)
		{
			int2 = 11;
			int1 = array11[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}
		else if(int4 ==12)
		{
			int2 = 12;
			int1 = array12[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==13)
		{
			int2 = 13;
			int1 = array13[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}
		else if(int4 ==14)
		{
			int2 = 14;
			int1 = array14[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==15)
		{
			int2 = 15;
			int1 = array15[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==16)
		{
			int2 = 16;
			int1 = array16[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==17)
		{
			int2 = 17;
			int1 = array17[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==18)
		{
			int2 = 18;
			int1 = array18[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}	
		else if(int4 ==19)
		{
			int2 = 19;
			int1 = array19[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		else if(int4 ==20)
		{
			int2 = 20;
			int1 = array20[rng5.nextInt(20) + 1];
			int3 = int1 / int2;
			System.out.println(int1 + " / " + int2 + "= ");
			int6 = Integer.parseInt(myInput.nextLine());
			if(int3 == int6)
			{
				System.out.println("Correct!");
				return 1;
			}
			else if (int3 != int6)
			{
				System.out.println("Incorrect!");
				return -1;
			}
		}

		return -1;

	}







}
















































