// 9. Input two integers with the Scanner class and subtract the second integer from the first using the - operator.



import java.util.Scanner;
class Subtract
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Enter the first values");
	int a = sc.nextInt();
	
	System.out.println("Enter the 2nd values");
	int b = sc.nextInt();
	
	
	int sub = b-a;
	System.out.println("Subtract is two values"+sub);
	
	
	}
}
