
public class CountingExercise 
{

	public static void main(String[] args) 
	{
		for (int i = 212; i <= 376; i++ )
		{
			System.out.printf("%-,10d", i);
			
			if ((i-211)%15 == 0)
			{
				System.out.println();
			}
		}

	}
}


