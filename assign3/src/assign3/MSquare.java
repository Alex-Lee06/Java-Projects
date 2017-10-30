package assign3;

import java.util.*;
import java.io.*;
/**
 * 
 * @author Yentzameng Yang
 * @Version: 6/26/17
 * 
 * Description:
 * 
 * Psuedocode: 
 * 
 *
 */
public class MSquare {
	 
	
	
	public void sumRows(int [][]array)
	{
		int sum = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				sum += array[row][col];

			}
			System.out.print(sum + " ");
			sum = 0;
		}

		
		
	}
	
	public void sumColumns(int [][]array)
	{
		int sum = 0;

		// Checks columns
		for (int col = 0; col < array.length; col++) {
			for (int row = 0; row < array.length; row++) {
				sum += array[row][col];
			}
			System.out.print(sum + " ");
			sum = 0;
		}
		
	}
	
	public void sumDiagonals(int [][]array)
	{
		int sum = 0;
		// Check diagonals
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i][i];
//		}
//
//		System.out.print(sum + " ");
//		sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i][i];
			

		}
		System.out.print("Diagonal 1 is: " + sum);

	}
	
//	public boolean isUnique (int [][] array, int number){
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
	
	public void displayMagicSquare(int[][] array){
		
		//create for loop
		
		for (int row =0; row <array.length; row++){
			for (int column =0; column < array.length; column ++){
				System.out.print(array[row][column] + " ");
			}//end second loop
			System.out.println("");
		}//end of first loop
	}//end of display magic square
	
	public int [][] fillMatrix(int [][] array){
		
		
		for(int i = 0; i<array.length; i++)
		{
			for(int k = 0; k<array.length; k++)
			{
				int number = (int)(Math.random()*9)+1;
				array [i][k] = number;
			}
			
		}
		return array;
	}//end of fillMatrix method
	
//	public boolean isMagicSquare(int [][]array)
//	{
//		boolean magicSquare = true;
//		
//		return magicSquare;
//	}
//	
	public void saveArray(int [][] array) throws FileNotFoundException
	{
		PrintWriter pr = new PrintWriter("output");

		for (int i=0; i<array.length ; i++){

		for (int j=0; j<array.length ; j++){

		pr.print (array[i][j]);

		}

		pr.println();

		}

		pr.close();
	}
	
	
	
	
}