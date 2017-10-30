import java.util.*;

/**
 * This Class controls the movement of the queens, stores the collisions, and resets the number of collisions with all the queens.
 * 
 * @author Alex Lee
 *
 */

public class Queens {
	
	private int currentH;
	private boolean hasQueen;
	public Board board;

	public Queens() {
		currentH = 0;
		hasQueen = false;
	}

	public void incrementQueenCollisions() {
		currentH++;
	}


	public boolean containsQueen() {
		return hasQueen;
	}


	public void placeQueen() {
		hasQueen = true;
	}


	public void removeQueen() {
		hasQueen = false;
	}


	public int getCollisions() {
		return currentH;
	}


	public void resetCollisions() {
		currentH= 0;
	}

}
