
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Driver
{
    // instance variables - replace the example below with your own
    

    	public static void main(String args[ ])
    	{
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        Bowler b = new Bowler();
        
        String name;
        int score;
        int score2;
        int score3;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter the first score: ");
        score = input.nextInt();
        
        System.out.print("Enter the second score: ");
        score2 = input.nextInt();
        
        System.out.print("Enter the third score: ");
        score3 = input.nextInt();
        
        System.out.print("Your score average is: ");
        
        b.calcAverage(average);
        
    	}

}