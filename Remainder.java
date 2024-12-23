// 5 Using the Scanner class, input two integers and find the remainder of their division using the % operator.

import java.util.Scanner;
class Remainder
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Enter the first values");
	int a = sc.nextInt();
	
	System.out.println("Enter the 2nd values");
	int b = sc.nextInt();
	
	
	int rem = a%b;
	System.out.println("Remainder  is two values"+rem);
	
	
	}
}
