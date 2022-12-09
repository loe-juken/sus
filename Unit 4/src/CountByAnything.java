import java.util.Scanner;

public class CountByAnything {

	public static void main(String[] args) 
	{
		Scanner sus = new Scanner(System.in);	System.out.println("Welcome to the odd number printer!"
				+ "\nFYI: min and max are included as possible odd numbers\n"
				+ "Enter min number:"); // Create scan object && prompt user for input
		int min = sus.nextInt();
				System.out.println("Enter max number:");
		int max = sus.nextInt();
				System.out.println("Enter count by value:");
		int countBy = sus.nextInt();
		final int RANGE = max-min;
		final double NEWLINE = 0.10*(RANGE/countBy);
		// Tried to make accurate 10 percent new line value but it didn't work :/
		
		for (int i = min; i <= max; i += countBy )
		{
			System.out.printf("%-,10d", i);
			
			if ((i-min)%NEWLINE == 0)
			{
				System.out.println();
			}
		}
	}

}
