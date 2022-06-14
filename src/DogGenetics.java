import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class DogGenetics {

	public static Random rand = new Random(System.currentTimeMillis());
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		final String[] breeds = {"Pitbull", "Poodle", "Doberman", "German Shephard", "Pug", "Alaskan Malamute", "Husky", "Bearded Collie", "Bichon Frise"};
		double[] breedAmounts = new double[5];
		double breedTotal = 0;
		
		//Generate percentages
		for(int i = 1; i < breedAmounts.length; i++)
		{
			double amount = rand.nextDouble(0, 100 - breedTotal);
			breedAmounts[i] = amount;
			breedTotal += amount;
		}
		breedAmounts[0] = 100 - breedTotal;
		Arrays.sort(breedAmounts);
		
		//Output breeds
		int addedBreed = 0; //Tracks breeds to avoid duplication
		for(int i = breedAmounts.length - 1; i >= 0 ; i--)
		{
			addedBreed = rand.nextInt(addedBreed + 1, breeds.length - i);
			System.out.println(breeds[addedBreed] + String.format(": %1.2f", breedAmounts[i]) + "%");
		}
	}

}