
public class Board {
	private static int board[][];
	private int numQueens;
	
	public Board()
	{
		numQueens = 0;
		board = new int[8][8];
		for(int i = 0; i < 8; i++)
		{
			for(int k = 0; k < 8; k++)
			{
				
			}
		}
	}
	
	public int getNumQueens()
	{
		return numQueens;
	}
	
	public void begin()
	{
		solve(0);
	}
	
	public boolean solve(int numQueens)
	{
		
		if(numQueens == 8)
		{
			System.out.println("Finish");
			this.printBoard();
			return true;
		}
		else
		{
			for(int i = 0; i<8; i++)
				for(int k = 0; k<8; k++)
				{
					if (validMove(i,k)==0)
					{
						this.placeQueen(i, k, 0);
						numQueens++;
						
						//if this is false remove queen from this location
						if(solve(numQueens))
						{
							return true;
						}
						else
						{
							this.placeQueen(i, k, 1);
							numQueens--;
						}
					}
				}
		}
		return false;
	}
	
	public static int validMove(int x, int y)
	{
		for(int i = 0; i < 8; i++)
		{
			if (get(x,i)==1)
			{
				return -1;
			}
			if (get(i, y)==1)
			{
				return -1;
			}
		}
		
		// for diagonals
		for (int i = 0; i < 8; i++)
		{
			if(get(x-i, y-i)==1)
				{
					return -1;
				}
			if(get(x-i, y+i )== 1)
				{
					return -1;
				}
			if(get(x+i, y-i)==1)
				{
					return -1;
				}
			if(get(x+i, y+i)== 1)
				{
					return -1;
				}
			
		}
		return 0;
	}
	
	public int placeQueen(int x, int y, int type)
	{
		if(type == 0)
		{
			board[x][y] = 1;
			numQueens++;
			return 0;
		}
		else if (type == 1)
		{
			board[x][y] = 0; 
			return 0;
		}
		System.out.println("Not correct");
		return -3;
	}
	
	public static int get(int x, int y)
	{
		if(x<0 || y < 0 || x > 7 || y > 7)
		{
			//System.out.println("Invalid");
			return -1;
		}
		return board[x][y];
	}
	
	public void printBoard()
	{
		for(int i = 0; i < 8; i++)
		{
			for(int k = 0; k < 8; k++)
			{
				System.out.print(this.get(i,k) + " ");
			}
			System.out.println("");
		}
	}
	

}
