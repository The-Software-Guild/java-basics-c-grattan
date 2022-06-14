import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random(System.currentTimeMillis());
	
	private static int getInt(int min, int max, String msg)
	{
		System.out.println(msg);
		return getInt(min, max);
	}
	
	private static int getInt(int min, int max)
	{
		int in = min;
		do
		{
			try
			{
				in = input.nextInt();
			}
			catch(Exception e)
			{
				input.next();
			}
		} while(in < min || in > max);
		return in;
	}
	
	public static String getChoice(int choice)
	{
		switch(choice)
		{
		case 0:
			return "rock";
		case 1:
			return "paper";
		case 2:
			return "scissors";
		default:
			return "invalid choice";
		}
	}
	
	public static int getResult(int win, int lose, int actual)
	{
		if(actual == win)
		{
			System.out.println("You Win!");
			return 0;
		}
		else if(actual == lose)
		{
			System.out.println("You Lose!");
			return 1;
		}
		else
		{
			System.out.println("It's a Tie!");
			return 2;
		}
	}
	
	public static void main(String[] args)
	{
		boolean replayB;
		do
		{
			//Get number of rounds
			int rounds = getInt(0, 10, "Number of rounds (0-10):");
			
			//				Wins, 	losses,	ties
			int[] scores =	{0,		0,		0};
			
			//Main game loop
			for(int i = 0; i < rounds; i++)
			{
				int choice = getInt(-1, 3, "Choose your weapon (0: rock, 1: paper, 2: scissors):");
				System.out.println("You have chosen " + getChoice(choice));
				
				int compChoice = rand.nextInt(3);
				System.out.println("The computer chose " + getChoice(compChoice));
				switch(compChoice)
				{
				case 0:
					scores[getResult(2, 1, choice)]++;
					break;
				case 1:
					scores[getResult(0, 2, choice)]++;
					break;
				case 2:
					scores[getResult(1, 0, choice)]++;
					break;
				}
			}
			
			//Display results
			System.out.println("You won " + scores[0] + " rounds, lost " + scores[1] + " rounds, and " + scores[2] + "rounds were a tie.");
			if(scores[0] > scores[1])
			{
				System.out.println("You Won!");
			}
			else if(scores[1] > scores[0])
			{
				System.out.println("You Lost.");
			}
			else
			{
				System.out.println("It's a Tie!");
			}
			
			//Replay handling
			String replay = "";
			
			System.out.println("Do you want to play again? (Yes/No)");
			do
			{
				replay = input.next().toLowerCase();
			} while(!(replay.equals("yes") || replay.equals("no")));
			
			replayB = replay.equals("yes");

		} while(replayB);
		
		System.out.println("Thanks for playing!");
	}
}
