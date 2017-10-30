import java.util.*;
/**
 * 
 * @author Yentzameng Yang
 * @Version: 6/22/17
 * 
 * Description:	
 * 				
 * 				
 * 				
 * 				
 * 				
 * Psuedocode:		
 * 				
 * 				
 * 				
 * 				
 * 				
 * 				
 * 				
 * 				
 * 							
 *				
 */
public class ASSIGNMMENT {
	public int [] selectionSort(int [] array)
	{
		for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;
      
            int smallerNumber = array[index]; 
            array[index] = array[i];
            array[i] = smallerNumber;
        }
		return array;
	}
	public void bubbleSort(int [] array)
	{
		int temp;
		
		System.out.println("Array After Bubble Sort");
		
		for(int i = 0; i < array.length - i; i++)
		{
			for(int j = 0; j < array.length - i; j++)
			{
				if(array[i] > array[j+i])
				{
					temp = array[i];
					array[j] = array [j+i];
					array [j+i]=temp;
				}
			}
		}
		for(int k = 0; k<array.length; k++)
		{
			System.out.print(array[k] + " ");
		}
		System.out.println("\n");
	}
	///////////////////////////////////////////////////////***MenuMethods***\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void MenuMethod(){

		//display menu option
		System.out.println("Choose one of the following: \n");
		System.out.println("1. Linear Search ");
		System.out.println("2. BinarySearch ");
		System.out.println("3. Bubble Sort ");
		System.out.println("4. Selection Sort ");
		System.out.println("5. Exit");

	}//end of menu methods
//	/////////////////////////////////////////////***BookTitle & Price*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static void displayBook(String [] bookTitle, double[] bookPrice, int[] bookID){
		int total= 0;
		int sum = 0;
		//display book's info
		System.out.format("BOOKID:\t\t" + "BOOK TITLE:\t\t" + "\t\t\tBOOK PRICE:\t");
		System.out.println("");

		for (int i =0; i< bookTitle.length; i++) {
			System.out.println( bookID[i] + "\t\t" + bookTitle[i] + "\t\t\t" + bookPrice[i] );
			sum += bookPrice[i]; 
			total = sum; 
//			System.out.println("Your Total is: " +total);
		}//end of for loop
		System.out.println("");
	}//end of book method

}//end of class
