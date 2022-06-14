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
		} while(age < 1 && age < 180); //Max heart rate range of 219 to 40
		
		//Calculate and display values
		int maxHR = 220 - age;
		double[] targetRange = {maxHR * 0.5, maxHR * 0.85};
		
		System.out.println(String.format("Your maximum heart rate should be " + maxHR + " beats per minute\nYour target heart rate is between %1.0f and %2.0f BPM", targetRange[0], targetRange[1]));
		
		input.close();
	}
}