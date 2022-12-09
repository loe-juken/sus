
public class CountBy5 
{

	public static void main(String[] args) 
	{
		for (int i = 5; i <= 200; i += 5 )
		{
			System.out.printf("%-,10d", i);
			if ((i)%50 == 0)
			{
				System.out.println();
			}
		}

	}

}
