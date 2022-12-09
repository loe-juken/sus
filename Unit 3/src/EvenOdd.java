import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		int intevod = Integer.parseInt(scanObj.nextLine());
		
		if (intevod%2 != 0 && intevod != 0)
		{
			System.out.println("This integer is ODD");
		}
		else if (intevod%2 == 0 && intevod != 0) 
		{
			System.out.println("This integer is EVEN");
		}
		else 
		{
			System.out.println("This integer is 0");
		}
		

	}

}
