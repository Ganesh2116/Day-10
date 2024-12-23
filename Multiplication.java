//3 Take an integer input using the Scanner class and calculate its product with a constant value (e.g., 5) using the * operator.


import java.util.Scanner;
class Multiplication
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the 1st values:");
	int a = sc.nextInt();

	System.out.println("Enter the 2nd values:");
	int b = sc.nextInt();
	
	int mul = a * b;
	System.out.println("the two values Multiplication  is "+mul);
	}
}