package hello;
import java.util.*;
public class PrintNumber 
{

	public static void main(String[] args)
	{
		int sum;
		System.out.println("The number of students is: ");
		Scanner in = new Scanner(System.in);
		sum = in.nextInt();
		String[] name = new String[100];
		int[] grade = new int[100];
		System.out.println("Please enter the name and the grade: ");
		for(int i = 0;i < sum;i++)
		{
			grade[i] = in.nextInt();
			name[i] = in.nextLine();
		}
		for(int i = 0;i < sum;i++)
		{
			int tempGrade;
			String tempName;
			for(int j = i + 1;j < sum;j++)
			{
				if(grade[i] < grade[j])
				{
					tempGrade = grade[i];
					grade[i] = grade[j];
					grade[j] = tempGrade;
					tempName = name[i];
					name[i] = name[j];
					name[j] = tempName;
				}
			}
		}
		for(int i = 0;i < sum;i++)
		{
			System.out.printf("The %d student is %s and his grade is %d\n",i+1,name[i],grade[i]);
		}
	}

}
