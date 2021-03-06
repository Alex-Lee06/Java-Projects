import java.util.*;
/*
 * This class created the grid for the traversal and calculates F, G, and H.
 */

public class grid {
	public static Node[][] grid = new Node[15][15];
	public static Random rand = new Random();
	public static Node startNode;
	public static Node goalNode;
	
	
	public int calcH(Node n) {

		return Math.abs(n.getCol() - goalNode.getCol()) + Math.abs(n.getRow() - goalNode.getRow());
	}

	public int calcG(Node n) {

		return Math.abs(n.getCol() - startNode.getCol()) + Math.abs(n.getRow() - startNode.getRow());
	}

	public void generateGrid() {

		// sets non traversable nodes (10%)

		for (int x = 0; x < (int) ((grid.length * grid.length) * 0.1); x++) {
			int r = rand.nextInt(14);
			int c = rand.nextInt(14);

			while (grid[r][c] != null) {
				r = rand.nextInt(14);
				c = rand.nextInt(14);
			}
			grid[r][c] = new Node(r, c, 1);
		}

		// sets remaining spaces to traversable
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == null)
					grid[i][j] = new Node(i, j, 0);
			}
		}
	}

	public void printGrid() {

		int r = 0;

		// ---------------Column numbers formatting----------------//
		System.out.print("   ");
		for (int x = 0; x < 15; x++) {
			if (x < 10)
				System.out.print(x + "  ");
			else
				System.out.print(x + " ");

		}
		System.out.print("\n   ");
		for (int x = 0; x < 15; x++)
			System.out.print("-- ");
		System.out.print("\n");

		// ---------------Board printing----------------//
		for (int i = 0; i < grid.length; i++) {
			if (r < 10)
				System.out.print(" ");

			System.out.print(r + "|");

			for (int j = 0; j < grid[i].length; j++) {

				System.out.print(grid[i][j].getType() + "  ");
			}
			r++;
			System.out.print("\n");
		}

	}

}
