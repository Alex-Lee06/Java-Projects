package assign3;
/**
 * A Magic Square is a matrix in which all rows, columns,
and diagonals, when summing its integer elements, are equal.
Enter start to begin the search!
start
 */

import java.io.FileNotFoundException;
import java.util.*;
public class driver {
	public static void main(String args[]) throws FileNotFoundException
	{
		//create scanner
				Scanner input = new Scanner (System.in); 
				MSquare magic = new MSquare();
				//create array
				int [][] matrix = new int [3][3]; 

				//prompt user to input
				System.out.println(" A Magic Square is a matrix in which all rows, columns, \nand diagonals, when summing its integer elements, are equal. \nEnter start to begin the search!");
//				String choice = input.nextLine(); 

						magic.fillMatrix(matrix);
						magic.displayMagicSquare(matrix);
						System.out.print("Sum of the rows: ");
						magic.sumRows(matrix);
						System.out.println("");
						System.out.print("Sum of the columns: ");
						magic.sumColumns(matrix);
						System.out.println("");
						System.out.println("Sum of the diagonal: ");
						magic.sumDiagonals(matrix);
						magic.saveArray(matrix);
						//display sum of ?
//						System.out.println(magic.sumRows(matrix));	
//						System.out.println("Sum of Column: "  +);
//						System.out.println("Sum of Diagonals: "  +SumOfDiagonal(matrix));
//						System.out.println("Matrix is not a Magic Square. Try Again!");


				
	}//end of main
}//end of class
