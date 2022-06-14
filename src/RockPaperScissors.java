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
	
	public static void main(String[] args)
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
		}
	}
}
