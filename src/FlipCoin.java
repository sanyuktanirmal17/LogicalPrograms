import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("How many times you need to flip coin");
	int flipCount = scanner.nextInt();
	int headCount = 0;
	int tailCount = 0;
	for (int i =0; i<flipCount; i++)
	{
		double random = Math.random();
		if(random>0.5)
		{
			headCount++;
		} else 
		{
			tailCount++;
		}
	}
	System.out.println("HeadCount is : "+ headCount + " % =" + calculatePercentage(flipCount, headCount));
	System.out.println("TailCount is : " + tailCount + " % =" + calculatePercentage(flipCount, headCount));
	}
	
	private static int calculatePercentage(int flipCount, int count) {
		return count/flipCount * 100;
	}
}
