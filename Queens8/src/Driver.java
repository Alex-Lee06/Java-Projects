
public class Driver {
	public static void main(String args [])
	{
		int totalQueens = 8;
		Board board = new Board(new int[totalQueens][totalQueens], new int[8]);
		int currentH = 0;
		int neighborsOfH = 0;
		boolean hillClimb = true;
		
		board.addQueens();
		currentH = board.currentH();
		System.out.println("Current h: " + currentH);
		System.out.println("Current State");
		
		board.printBoard();
		
		System.out.println("Neighbors found with lower h: " + neighborsOfH);
		
		

	}
}
