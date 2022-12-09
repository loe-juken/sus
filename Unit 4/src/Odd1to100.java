import java.util.Scanner;
public class Odd1to100 
{

	public static void main(String[] args) 
	{
		Scanner sus = new Scanner(System.in);	System.out.println("Welcome to FIZZ BUZZ!"
				+ "\nFYI: min and max are included as possible numbers\n"
				+ "Enter min number:"); // Create scan object && prompt user for input
		int min = sus.nextInt();
				System.out.println("Enter max number:");
		int max = sus.nextInt();
		int x = 0;
		
		for (int i = min; i <= max; i++ )
		{
			if ((i+1)%3 != 0 || (i+1)%5 != 0)
				System.out.printf("%-,10d", i);
			if ((i+1)%3 == 0 && (i+1)%5 == 0)
				System.out.printf("%-10s", "FIZZBUZZ");
			else if ((i+1)%3 == 0)
				System.out.printf("%-10s", "FIZZ");
			else if ((i+1)%5 == 0)
				System.out.printf("%-10s", "buzz");
			if (x%((Math.round((max-min)/10.0) * 10)/10) == 0)
				System.out.println();
			x++;
				
		}
		

	}

	

}
