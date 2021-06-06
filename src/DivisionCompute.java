import java.util.Scanner;

public class DivisionCompute 
{
	public static void main(String args[])
{
//	Scanner in = new Scanner(System.in);
	int dividend = 25 ;
	int divisor = 5;
	
	int Quotient = dividend/ divisor;
	int remender = dividend % divisor;	
	
	System.out.println("Enter Divident No :" + Quotient);
	System.out.println("Enter Divisor No :" + remender);
	}
}