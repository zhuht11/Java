package hello;
import java.util.*;
public class PrintNumber 
{

	public static void main(String[] args)
	{
		int[] data = new int[10];
		int[] judge = new int[11];
		Scanner in = new Scanner(System.in);
		for(int i = 0;i < 10;i++)
		{
			data[i] = in.nextInt();
		}
		for(int i = 0;i < 11;i++)
		{
			judge[i] = 0; 
		}
		for(int i = 0;i < 10;i++)
		{
			judge[data[i]] = 1;
		}
		int sum = 0;
		for(int i = 1;i < 11;i++)
		{
			if(judge[i] == 1)
			{
				sum++;
			}
		}
		System.out.printf("The number of distinct number is %d\n", sum);
		System.out.printf("The distinct numbers are: ");
		for(int i = 1;i < 11;i++)
		{
			if(judge[i] == 1)
			{
				System.out.printf("%d ",i);
			}
		}
	}

}
