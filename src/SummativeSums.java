
public class SummativeSums {

	public static int sum(int[] xs)
	{
		return xs[0] + sum(xs, 1);
	}
	
	public static int sum(int[] xs, int index)
	{
		if(index == xs.length - 1)
		{
			return xs[index];
		}
		return xs[index] + sum(xs, index + 1);
	}
	
	public static void main(String[] args) {
		int[][] testArrays = {
					{ 1, 90, -33, -55, 67, -16, 28, -55, 15 },
					{ 999, -60, -77, 14, 160, 301 },
					{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }
				};
		
		for(int i = 0; i < testArrays.length; i++)
		{
			System.out.println("#" + i + " Array Sum: " + sum(testArrays[i]));
		}
	}

}
