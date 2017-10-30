import java.util.*;
import java.io.*;
/**
 * The user will enter the search pattern from the keyboard.
 *Report to the user how many times the pattern was located and which line numbers and positions
 *within those line numbers the pattern was found.
 */



public class Driver {
	public static void main(String [] args) throws IOException
	{
		
        int position = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Horspool horspool = new Horspool();
		String pattern ;
		String source;		
		char loopAgain = 'n';
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your source to use to find the pattern in.");
		source = br.readLine();
	
		System.out.println("Enter the string pattern to be found.");
		pattern = br.readLine();
        horspool.shifttable(pattern);
        position = horspool.horspool(source,pattern);
        
        if(position == -1)
            System.out.println("Pattern was not found");
        else
            System.out.println("Pattern was found at position: " + position);
        
		System.out.println("Would you like to search again? (Y or N)");
		loopAgain = input.next().charAt(0);
        
    	while(loopAgain == 'y' || loopAgain == 'Y')
    	{
    		System.out.println("Enter your source to use to find the pattern in.");
    		source = br.readLine();
    	
    		System.out.println("Enter the string pattern to be found.");
    		pattern = br.readLine();
            horspool.shifttable(pattern);
            position = horspool.horspool(source,pattern);
            
            if(position == -1)
            {
                System.out.println("Pattern was not found");
            }
            else
            {
                System.out.println("Pattern was found at position: " + position);
            }
    		System.out.println("Would you like to search again? (Y or N)");
    		loopAgain = input.next().charAt(0);

    	}
    	if(loopAgain == 'n' || loopAgain == 'N')
    	{
    		System.out.println("Good Bye.");
    	}
     }
}
