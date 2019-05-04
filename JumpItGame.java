// import java.util.*;

// public class JumpItGame
// {
// 	public static void main(String[] args)
// 	{
// 		int n ;
// 		// ArrayList<NumberBoard> = {0, 5, 43, 24, 14, 50};
// 		// ArrayList<int> NumberBoard=new ArrayList<int>();
// 		// NumberBoard.add(0);
// 		// NumberBoard.add(3);
// 		// NumberBoard.add(80);
// 		// NumberBoard.add(6);
// 		// NumberBoard.add(57);
// 		// NumberBoard.add(10);

// 		int numberBoard[] = {0,3,80,6,57,10};
// 		int move1 = 0;
// 		int move2 = 1000;


// 		int cost[] = new int[args.length];
// 		int index = 0;

// 		for(/*String arg:args*/)
// 		{
// 			cost[index] = numberBoard.parseInt(arg); //FIX THIS LINE
// 			index++ ;
// 		}
// 	System.out.println("Best cost is: "+minimumCost(0, cost));
// 	}

// 	private static int minimumCost(int position, int cost[])
// 	{
// 		if (position>=cost.length)
// 		{
// 			return 0;
// 		}

// 		int jump = cost[position]+minimumCost(position+2, cost);
// 		int move = cost[position]+minimumCost(position+1, cost);
// 		if(move<jump)
// 		{
// 			position+=1;
// 			System.out.println("Move to position: "+position);
// 			return move;
// 		}
// 		else
// 		{
// 			position+=2;
// 			System.out.println("Jump to position: "+position);
// 			return jump;
// 		}
// 	}
// }

import java.util.*;

public class JumpItGame
{
	public static int cheapestCost(int[] numberBoard, int n)
	{
		if((numberBoard.length-1)==n)
		{
			return numberBoard[n];
		}
		else if((numberBoard.length-2)==n)
		{
			return numberBoard[0]+numberBoard[numberBoard.length-1];
		}
		else if(cheapestCost(numberBoard,n+1)<cheapestCost(numberBoard,n+2))
		{
			return numberBoard[n]+cheapestCost(numberBoard,n+1);
		}
		else
		{
			return numberBoard[n]+cheapestCost(numberBoard,n+2);
		}
	}
	public static void main(String[] args)
	{
		int numberBoard[] = {0,3,80,6,57,10};
		System.out.println("Here is your array: {0,3,80,6,57,10}");
		System.out.println("The cheapest cost of this Jump It Game: ");
		System.out.println("$"+cheapestCost(numberBoard,0));
	}
}