
public class Even_or_odd {

	public static void main(String[] args) 
	{
		int min = 0;
		int max = 200;
		
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);
		
		if(b%2 == 0) 
		{
			System.out.println("even");
		}
		
		if(b%2 == 1) 
		{
			System.out.println("odd");
		}
	}

}
