import java.util.Scanner;
public class Temperatures 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		boolean correctInput = true;
		
		double highTemp = 0;
		double lowTemp = 0;
		
		while (correctInput)
		{
		System.out.print("What is today's high temperature? ");
		highTemp = input.nextDouble();
		System.out.print("What is today's low temperature? ");
		lowTemp = input.nextDouble();
		if (highTemp < lowTemp || lowTemp > highTemp) 
				System.out.println("ERROR: False input");
		else correctInput = false;
		}
		
		if (highTemp >= 90) 
			System.out.println("HEAT WARNING!");
		if (lowTemp < 32) 
			System.out.println("FREEZE WARNING!");
		if (highTemp - lowTemp > 40) 
			System.out.println("Large temperature swing");

	}

}
