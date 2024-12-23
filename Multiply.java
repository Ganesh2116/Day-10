// 8. Using the Scanner class, take a double input and multiply it by 2 using the * operator.



import java.util.Scanner;
class Multiply
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Enter the first values");
	double a = sc.nextDouble();
	
	System.out.println("Enter the 2nd values");
	double b = sc.nextDouble();
	
	
	Double muti = a*b;
	System.out.println("multiply of two values"+muti);
	
	
	}
}

