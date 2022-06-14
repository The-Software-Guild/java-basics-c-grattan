
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
	}

}
