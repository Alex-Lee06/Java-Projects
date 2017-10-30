import java.util.*;
public class calculator {
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int total = 0;
		
		System.out.print("Enter your first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter your second number: ");
		num2 = input.nextInt();
		
		total = num1 * num2;
		System.out.print("Your total is: " + total);
	}
}
