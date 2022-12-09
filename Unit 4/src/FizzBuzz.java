import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) 
	{
		Scanner sus = new Scanner(System.in);	System.out.println("Welcome to the odd number printer!"
				+ "\nFYI: min and max are included as possible odd numbers\n"
				+ "Enter min number:"); // Create scan object && prompt user for input
		int min = sus.nextInt();
				System.out.println("Enter max number:");
		int max = sus.nextInt();
		
		for (int i = min; i <= max; i++ )
		{
			if (i%2 != 0)
			{
				System.out.printf("%-,10d", i);
			}
			if (i%10 == 0)
			{
				System.out.println();
			}
		}
	}

}
