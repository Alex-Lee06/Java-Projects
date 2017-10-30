//package assign3;
//
//import java.util.*;
///**
// * 
// * @author Yentzameng Yang
// * @Version: 6/26/17
// * 
// * Description:
// * 
// * Psuedocode: 
// * 
// *
// */
//public class yengs {
//	public static void main (String [] args){
//
//		//create scanner
//		Scanner input = new Scanner (System.in); 
//
//		//create array
//		int [][] matrix = new int [3][3]; 
//
//		//prompt user to input
//		System.out.println("Would you like to play Magic Square?");
//		System.out.println("Please enter (Yes) to start: ");
//		String choice = input.nextLine(); 
//		do {
//			switch (choice){
//
//			case "Yes":
//				//create if statement
//				if (choice.equalsIgnoreCase("Yes"))
//					fillMatrix(matrix);
//
//
//					//display sum of ?
//					System.out.println("Sum of Row: "  +SumOfRow(matrix));	
//					System.out.println("Sum of Column: "  +SumOfColumn(matrix));
//					System.out.println("Sum of Diagonals: "  +SumOfDiagonal(matrix));
//					System.out.println("Matrix is not a Magic Square. Try Again!");
//
//					fillMatrix(matrix);
//
//					//find if the square is magic
//					displayMagicSquare(matrix); 
//					System.out.println("Sum of Row: "  +SumOfRow(matrix));	
//					System.out.println("Sum of Column: "  +SumOfColumn(matrix));
//					System.out.println("Sum of Diagonals: "  +SumOfDiagonal(matrix));
//					System.out.println("Matrix is not a Magic Square. Try Again!");
//			
//				
//				break; 
//			case "yes":
//				//create if statement
//				if (choice.equalsIgnoreCase("Yes"))
//					fillMatrix(matrix);
//
//
//					//display sum of ?
//					System.out.println("Sum of Row: "  +SumOfRow(matrix));	
//					System.out.println("Sum of Column: "  +SumOfColumn(matrix));
//					System.out.println("Sum of Diagonals: "  +SumOfDiagonal(matrix));
//					System.out.println("Matrix is not a Magic Square. Try Again!");
//
//					fillMatrix(matrix);
//
//					//find if the square is magic
//					displayMagicSquare(matrix); 
//					System.out.println("Sum of Row: "  +SumOfRow(matrix));	
//					System.out.println("Sum of Column: "  +SumOfColumn(matrix));
//					System.out.println("Sum of Diagonals: "  +SumOfDiagonal(matrix));
//					System.out.println("Matrix is not a Magic Square. Try Again!");
//			
//				
//				break; 
//			case "No": 
//				System.out.println("Thank You! GoodBye!");
//				break; 
//			case "no": 
//				System.out.println("Thank You! GoodBye!");
//				break; 
//			default: 
//				System.out.println("Invalid Choice. Try Again!");
//				
//			}//end of switch
//			
//			
//		} while (isMagicSquare(matrix)!=true);  
//		
//		
//	}//end of main class
//	
//	//////////////////////////////////////////////////***fillMatrix****\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//	public static void fillMatrix(int [][] array){
//		//create for loop
//		for (int row =  0; row <array.length; row ++) {
//			for (int COLUMN = 0; COLUMN < array[row].length; COLUMN ++){
//				array[row][COLUMN] =0; 
//			}//end of second loop
//		}//end of first loop
//
//		//create second for loop
//		for (int row = 0; row <array.length; row++){
//			for (int column =0; column<array[row].length; column ++){
//				int number = (int)(Math.random()*9)+1;
//				while (!isUnique(array, number) )
//					number = (int)(Math.random()*9)+1;
//				array[row][column] = number; 
//			}//end of second loop
//		}//end of first loop	
//	}//end of fillMatrix method
//	///////////////////////////////////////////////////////**SumOfRow**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//	public static int SumOfRow(int [][] array) {
//		//create array by declared and initialized
//		int [] sum = new int [3];
//		for (int row = 0; row < array.length; row ++ ){
//			for (int column = 0; column < array[row].length; column ++){
//				sum[row] += array[row][column]; 
//			}//end of second loop
//		}//end of first loop
//
//		//create if return statement
//		if(sum[0] == sum[1] && sum[1] == sum[2]){
//			return sum[0];
//		}//end of if
//		else {
//			return -1; 
//		}//end of else
//	}//end of sum of row
//	///////////////////////////////////////////////////////////**SumOfColumn**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//	public static int SumOfColumn(int [][] array){
//		//create array by declare and initial
//		int [] sum = new int[3];
//
//		//create loop
//		for (int row =0; row < array.length; row++ ){
//			for (int column = 0; column < array[row].length; column++){
//				sum[column] = array[row][column]; 
//			}//end of second loop
//		}//end of first loop
//		if(sum[0] == sum[1] && sum[1] == sum[2]){
//			return sum[0];
//		}//end of if
//		else {
//			return -1; 
//		}//end of else	
//	}//end of sum of column
//	///////////////////////////////////////////////////////////**SumOfDiagonal**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//	public static int SumOfDiagonal(int [][] array){
//		//create array by declare and initial	
//		int [] sum = new int[2] ; 
//
//		//display calculation 
//		sum[0] = array[0][0] + array[1][1] + array[2][2];  
//		sum[1] = array[1][0] + array[2][1] + array[0][2];  
//
//		if (sum[0] == sum[1]){
//			return sum[0];
//		}//end of if
//		else {
//			return -1; 
//		}//end of else
//	}//end of sum of diagonal
//	///////////////////////////////////////////////////////////**SumOfDiagonal**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//	public static void displayMagicSquare(int [][] array){
//		//create for loop
//		for (int row =0; row <array.length; row++){
//			for (int column =0; column < array[row].length; column ++){
//				System.out.println(array[row][column] + " ");
//			}//end second loop
//			System.out.print("");
//		}//end of first loop
//	}//end of display magic square
//	///////////////////////////////////////////////////////////**check**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//	public static boolean isUnique (int [][] array, int number){
//		//create for loop to check 
//		for(int row = 0; row < array.length; row++) {
//			for(int column = 0; column < array[row].length; column++){
//				if (array[row][column] == number){
//					return false; 
//				}//end of if
//			}//end of second 
//		}//end of first 
//		return true; 
//	}//end of boolean check 
//	///////////////////////////////////////////////////////////**check**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//	public static boolean isMagicSquare (int [][] array){
//		if ( SumOfRow(array) == -1 || SumOfColumn(array) == -1 || SumOfDiagonal(array) == -1  ){
//			return false;	
//		}//end of if
//		else if ( SumOfRow(array) == SumOfColumn(array) && SumOfColumn(array) == SumOfDiagonal(array) ){
//			return true;
//		}
//		return false; 
//	}//end of boolean magic square
//}//end of class
//
