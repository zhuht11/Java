package hello;
import java.util.*;
public class helloworld 
{
	public static void main(String[] args)
	{
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an interger for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
