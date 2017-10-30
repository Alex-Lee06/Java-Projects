import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class creates the board that shows where each queen is
 * @author Alex Lee
 *
 */
public class Board {
	private int[][] board;
	private int [] queensPositions;
	public static int totalQueens = 8;
	public Queens [][] queens;
	private int H;
	private boolean occupied;
	private int numQueens;
	
	public Board(int [][] board, int [] positions)
	{
		this.board = board;
		this.queensPositions = positions;
		this.H = H;
		this.occupied = occupied;
		
		numQueens = 0;
		board = new int[8][8];
		for(int i = 0; i < 8; i++)
		{
			for(int k = 0; k < 8; k++)
			{
				
			}
		}
	
	}

	public int[] createQueens(){
		List<Integer> randomPos = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < totalQueens; i++) {
			randomPos.add(r.nextInt(8));
		}

		int[] randomPositions = new int[totalQueens];

		for (int i = 0; i < randomPos.size(); i++) {
			randomPositions[i] = randomPos.get(i);
		}

		return randomPositions;
	}
	
	public void addQueens() {

		queensPositions = createQueens();

		for (int i = 0; i < board.length; i++) {
			board[queensPositions[i]][i] = 1;
		}

	}
	
	public void printBoard() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public int currentH() {

		int totalPairs = 0;
	
		for (int i = 0; i < board.length; i++) {
			ArrayList<Boolean> pairs = new ArrayList<Boolean>();
			for (int j = 0; j < board[i].length; j++) {

				if (board[i][j] == 1) {
					pairs.add(true);
					
				}
				

			}
			
			
			if (pairs.size() != 0)
				totalPairs = totalPairs + (pairs.size() - 1);
		}
		
		
		int pairs = checkHorizontal();
		

		return totalPairs + pairs;
	}
	
	
	private int checkHorizontal() {

		int totalPairs = 0;
		int board[] = new int[8];

		ArrayList<Boolean> pairs = new ArrayList<Boolean>();
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 1)
				pairs.add(true);

		}

		if (pairs.size() != 0)
			totalPairs = (pairs.size() - 1);

		return totalPairs;
	}
	
	

		
}
