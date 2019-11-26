package seventh;
import java.util.*;
public class CalculateTime
{

	public static void main(String[] args)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int p = 0;
		Scanner in = new Scanner(System.in);
		do
		{
			a[p++] = in.nextInt();
		}while(a[p - 1] != 0);
		for(int i = 0; i < 100; i++)
		{
			b[i] = 0;
		}
		for(int i = 0; i < p; i++)
		{
			b[a[i]]++; 
		}
		for(int i = 1; i <= 100; i++)
		{
			if(b[i] > 0)
			{
				if(b[i] == 1)
				{
					System.out.printf("%d occurs %d time\n", i, b[i]);
				}
				else
				{
					System.out.printf("%d occurs %d times\n", i, b[i]);
				}
			}
		}
	}

}
