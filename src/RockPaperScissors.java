import java.util.Scanner;
public class RockPaperScissors {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int rounds = 0;
		do
		{
			try
			{
				rounds = input.nextInt();
			}
			catch(Exception e)
			{
				input.next();
			}
		} while(rounds < 1 || rounds > 10);
	}
}
