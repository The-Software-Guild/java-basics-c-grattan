import java.util.Scanner;

public class HealthyHearts {
	public static void main(String[] args)
	{
		//Get age
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = 0;
		do
		{
			try
			{
				age = input.nextInt();
			}
			catch (Exception e)
			{
				input.next();
			}
		} while(age < 1); //The calculations only need an age above 0, no point sanitising for people over 200
		
		input.close();
	}
}
