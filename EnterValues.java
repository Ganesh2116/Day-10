
import java.util.Scanner;

class EnterValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of short: ");
        short sh = sc.nextShort();

        System.out.print("Enter the value of int: ");
        int in = sc.nextInt();

        System.out.print("Enter the value of char: ");
        char ch = sc.next().charAt(0); 

        System.out.print("Enter the value of String: ");
        sc.nextLine(); 
        String st = sc.nextLine();

        System.out.print("Enter the value of line String: ");
        String b = sc.nextLine();

        System.out.print("Enter the value of boolean (true/false): ");
        boolean bo = sc.nextBoolean();

        System.out.print("Enter the value of double: ");
        double doValue = sc.nextDouble();

        System.out.print("Enter the value of float: ");
        float fl = sc.nextFloat();

        System.out.print("Enter the value of long: ");
        long lo = sc.nextLong();

        // Display the values
        System.out.println("\nValues entered:");
        System.out.println("short value is: " + sh);
        System.out.println("int value is: " + in);
        System.out.println("char value is: " + ch);
        System.out.println("String value is: " + st);
        System.out.println("Line String value is: " + b);
        System.out.println("boolean value is: " + bo);
        System.out.println("double value is: " + doValue);
        System.out.println("float value is: " + fl);
        System.out.println("long value is: " + lo);
    }
}
