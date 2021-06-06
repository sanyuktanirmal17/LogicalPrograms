
import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter the number between 0 to 31");
	int userInput = scanner.nextInt();
	if(userInput >= 0 && userInput <= 31)
	{
		System.out.println("Please enter valid number");
	} else {
		PrintTable(userInput);
		
	}
}

	private static void PrintTable(int userInput) {
		for(int i =0; i < userInput; i++)
		{
			System.out.println(Math.pow(2, i));
		}
		
	}

}
