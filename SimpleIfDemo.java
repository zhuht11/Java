package hellojavac;

import java.util.*;

public class hahaha {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an interger: ");
		int number = input.nextInt();
		if(number % 5 == 0)
		{
			System.out.println("HiFive");
		}
		if(number % 2 == 0)
		{
			System.out.println("HiEive");
		}
		
	}
}

