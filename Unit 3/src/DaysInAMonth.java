import java.util.*;

public class DaysInAMonth 
{

	public static void main(String[] args) 
	{
		Scanner month = new Scanner(System.in);
		
		System.out.println("Enter number as a month");
		int monthnum = Integer.parseInt(month.nextLine());
		
		if (monthnum<1 || monthnum>12)
		{
			System.out.println("ERROR: Bad Input");
		}
		else
		{
			if (monthnum==2) System.out.println(28);
			else if (monthnum == 1 || monthnum == 3 || monthnum == 5 || monthnum == 7 || monthnum == 8 || monthnum == 10 || monthnum == 12) System.out.println("31");
			else System.out.println("30");
		}
		
		

	}

}
