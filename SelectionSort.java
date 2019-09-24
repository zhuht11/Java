package hello;
import java.util.*;
public class helloworld
{
	public static void main(String[] args)
	{
		double[] pp = new double[10];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++)
		{
			pp[i] = input.nextInt();
		}
		selectionSort(pp);
		for(double e:pp)
		{
			System.out.print(e + " ");
		}
	}
	public static void selectionSort(double[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++)
			{
				if (currentMin > list[j])
				{
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMin;

			}
		}
	}
}
