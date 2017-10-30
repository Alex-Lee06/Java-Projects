import java.util.*;

/*
 * This class holds the main and prompts and shows the grid and calculations
 */
public class main {
	public static void main(String[] args) {

		Node[][] grid = new Node[15][15];
		Astar astar = new Astar();
		grid main_grid = new grid();
		Node node = new Node(0, 0, 0);
		Node startNode;
		Node goalNode;
		Scanner input = new Scanner(System.in);
		
		
		String cont = "y";
		main_grid.generateGrid();
		
		while (cont.equals("y")) {
			String start, goal;
			main_grid.printGrid();
			System.out.println("Enter the starting node with x,y: ");
			start = input.nextLine();
			
			System.out.println("Enter the goal node with x,y: ");
			goal = input.nextLine();

			String[] temp = start.split(",");
			String[] temp2 = goal.split(",");

			startNode = grid[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])];
			goalNode = grid[Integer.parseInt(temp2[0])][Integer.parseInt(temp2[1])];
			
			

			
			astar.implementAStar();
			System.out.println("\n\nEnter y to run again, enter n to exit.");
			cont = input.nextLine();
			
			
		}

	}
}
