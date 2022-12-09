import java.util.*;
public class InBetween 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert 2 numbers (with enter in between)");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int cnt = 0;
		
		if ((num1 > num2) && (Math.abs(num1 - num2) != 1))
			for (int i = num2; i < num1; i++)
			{
				if (i!=num2)
				System.out.print(i + " ");
				cnt++;
				if (cnt%10 == 0)
					System.out.println();
			}
		else if ((num1 < num2) && (Math.abs(num1 - num2) != 1))
			for (int i = num1; i < num2; i++)
			{
				if (i!=num1)
				System.out.print(i + " ");
				cnt++;
				if (cnt%10 == 0)
					System.out.println();
			}
		else
		{
			System.out.println("There are no numbers in between");
		}
	}

}
