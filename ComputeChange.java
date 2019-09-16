package hello;
import java.util.*;
public class helloworld 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		int numberOfPennies = remainingAmount;
		System.out.println(amount + " " + numberOfOneDollars + " " + numberOfQuarters + " " + numberOfDimes + " " + numberOfNickels + " " + numberOfPennies);
	}
}
