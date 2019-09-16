package hello;
import java.util.*;
public class helloworld 
{
	public static void main(String[] args)
	{
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number radius: ");
		double radius = input.nextDouble();
		double area;
		area = radius * radius * PI;
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}
