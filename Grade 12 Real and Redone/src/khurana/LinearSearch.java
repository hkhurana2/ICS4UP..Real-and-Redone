package khurana;

public class LinearSearch {

	public LinearSearch() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		int[] int1 = {1,6,8,9,25,65,77,85,99,111,127,155,187,190};
		int[] y = null;
		linearSearch(int1);
		

	}
public static int linearSearch(int[] int1)
{
	for(int i =0; i <= int1.length; i++)
	{
		if(int1[i] == 187)
		{
			int result = i;
			System.out.println("187 found at " + i + " index of the array.");
			return result;
		}
	}
	return -1;
 }

}
