// 2.Use the Scanner class to input two floating-point numbers and calculate their difference using the - operator.

import java.util.Scanner;
class Substration 
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the 1st values:");
	float a = sc.nextFloat();

	System.out.println("Enter the 2nd values:");
	float b = sc.nextFloat();
	
	float sub = a - b;
	System.out.println("the two values substration is "+sub);
	}
}