import java.util.Scanner;

public class GradeProgram 
{

	public static void main(String[] args) 
	{
		Scanner sus = new Scanner(System.in);
		
		System.out.println("Enter Grade Percentage:");
		double gradePercent = Math.round(Double.parseDouble(sus.nextLine()));
		if (gradePercent >= 97.5) 
		{
			System.out.println("You have an A+");
		}
		else if (gradePercent >= 92.5) 
		{
			System.out.println("You have an A");
		}
		else if (gradePercent >= 90) 
		{
			System.out.println("You have an A-");
		}
		else if (gradePercent >= 87.5) 
		{
			System.out.println("You have an B+");
		}
		else if (gradePercent >= 82.5) 
		{
			System.out.println("You have an B");
		}
		else if (gradePercent >= 80) 
		{
			System.out.println("You have an B-");
		}
		else if (gradePercent >= 77.5) 
		{
			System.out.println("You have an C+");
		}
		else if (gradePercent >= 72.5) 
		{
			System.out.println("You have an C");
		}
		else if (gradePercent >= 70) 
		{
			System.out.println("You have an C-");
		}
		else if (gradePercent >= 67.5) 
		{
			System.out.println("You have an D+");
		}
		else if (gradePercent >= 62.5) 
		{
			System.out.println("You have an D");
		}
		else if (gradePercent >= 60) 
		{
			System.out.println("You have an D-");
		}
		else if (gradePercent >= 52.5) 
		{
			System.out.println("You have an F");
		}
		else 
		{
			System.out.println("You have an F-");
		}
		
		
	}

}
