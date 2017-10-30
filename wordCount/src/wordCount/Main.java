package wordCount;
import java.util.*;
public class Main {
	public static void main(String [] args)
	{
		String text = null;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		text = input.nextLine();
		
		while(text.length() < 0)
		{
			count++;
		}
		System.out.println(count);
	}
}
