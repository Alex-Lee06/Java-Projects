import java.util.*;

/**
 * In this assignment, you will create a program that allows the user to choose between the following menu choices (menu-driven program):
 
1.                  Linear Search 
2.                  Binary Search 
3.                  Bubble Sort 
4.                  Selection Sort 
5.                  Quit 
Keep running the program until the user chooses to Quit. 
Your program will be split up into two main parts, where each part will run differently. 
For Options 1 and 2, you are working with searching methods by creating the bookstore described below. 
For Options 3 and 4, you are working with sorting methods by generating 1000 random numbers and then sorting it

 * @author Yentzameng Yang
 *
 */
public class driver {
	public static void main(String args[])
	{
		//create a scanner
		Scanner input = new Scanner (System.in);	
		ASSIGNMMENT assignment = new ASSIGNMMENT();

		String[] bookTitle = {"Starting out with Java", "Java Programming",
				"Software Structures", "Design and Analysis of Algorithms", 
				"Computer Graphics", "Artificial Intelligence: A Modern Approach", 
				"Probability and Statistics", "Cognitive Science", "Modern Information Retrieval", 
		"Speech and Language Processing"};

		int[] bookID = {1642, 1211, 1333, 1800, 1567, 1101, 1699, 1755, 1456, 1999};
		double[] bookPrice = {112.32, 73.25, 54.00, 67.32, 135.00, 173.22, 120.00, 42.25, 32.11, 123.75};
		int [] random = new int [10];
		int choice = 0;
		int bookIndex = 0; 


		do{
			//call display book method
			assignment.displayBook(bookTitle, bookPrice, bookID);

			//call menu methods
			assignment.MenuMethod();
			System.out.println("Select a Option: \n");
			choice = input.nextInt(); 

			if(choice == 1){
	            System.out.println("Please make another selection.");
	            System.out.println("\n");
			}
			else if (choice ==2){
	            System.out.println("Please make another selection.");
	            System.out.println("\n");
			}
			else if (choice ==3){
				assignment.bubbleSort(bookID);// if you look here this is out you call the methods
	            System.out.println("Please make another selection.");
	            System.out.println("\n");
			}
			else if (choice ==4){
				/**
				 * if you want to assign the methods to a variable this is how you do it.
				 */
		        int[] arr2 = assignment.selectionSort(bookID);
		        System.out.println("This is your selection sort: ");
		        for(int i:arr2){
		            System.out.print(i);
		            System.out.print(", ");
		            System.out.println("Please make another selection.");
		            System.out.println("\n");
		        }
			}
			else if (choice == 5 ){
				System.out.println("Thank You! GoodBye!");
			}
			else {
				System.out.println("Invalid Input. Try Again!");
			}
		}while(choice !=5 );//end of do while

	}//end of driver
}//end of class

/**
 * Hey so i just wanted to show you how to put in the methods. You should be able to just look up the algorithms for the searches and sorts. 
 * If you need help just text me  and I'll try to do what I can. Good luck!! Hope you have a great weekend!!!
 */
