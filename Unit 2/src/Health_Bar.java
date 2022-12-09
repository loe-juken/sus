

public class Health_Bar 
{

	public static void main(String[] args) 
	{
		String bars = "";
		int health = 20;
		
		if (health<=0) 
		{
			bars = "          ";
		}
		
		else if (health<=10) 
		{
			bars = "0         ";
		}
		
		else if (health<=20) 
		{
			bars = "00        ";
		}
		
		else if (health<=30) 
		{
			bars = "000       ";
		}
		
		else if (health<=40) 
		{
			bars = "0000      ";
		}
		
		else if (health<=50) 
		{
			bars = "00000     ";
		}
		
		else if (health<=60) 
		{
			bars = "000000    ";
		}
		
		else if (health<=70) 
		{
			bars = "0000000   ";
		}
		
		else if (health<=80) 
		{
			bars = "00000000  ";
		}
		
		else if (health<=90) 
		{
			bars = "000000000 ";
		}
		
		else if (health<=100) 
		{
			bars = "0000000000";
		}
		
		System.out.println("+----------+");
		System.out.println("|" + bars + "|");
		System.out.println("+----------+");
		

	}

}
