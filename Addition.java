//1.Using the Scanner class, take two integer inputs and find their sum using the + operator.

import java.util.Scanner;
class Addition
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Enter the first values");
	int a = sc.nextInt();
	
	System.out.println("Enter the 2nd values");
	int b = sc.nextInt();
	
	
	int sum = a+b;
	System.out.println("Sum is two values"+sum);
	
	
	}
}