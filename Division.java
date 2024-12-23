 // 4 Take two integers as input using the Scanner class and divide the first by the second using the / operator.



import java.util.Scanner;
class Division
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Enter the first values");
	int a = sc.nextInt();
	
	System.out.println("Enter the 2nd values");
	int b = sc.nextInt();
	
	
	int div = a/b;
	System.out.println("Division  is two values"+div);
	
	
	}
}