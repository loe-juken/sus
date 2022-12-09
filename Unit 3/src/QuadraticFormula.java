import java.util.*;
public class QuadraticFormula 
{

	public static void main(String[] args) 
	{
		Scanner sus = new Scanner(System.in);
		
		System.out.println("Enter your coefficients in order");
		double a = sus.nextDouble();
		double b = sus.nextDouble();
		double c = sus.nextDouble();
		
		double root1; double root2;
		
		double determinant = b*b - 4*a*c;
		if (determinant > 0)
		{
			root1 = (-b + Math.sqrt(determinant)) / 2*a;
			root2 = (-b - Math.sqrt(determinant)) / 2*a;
			
			System.out.println("The equation is: " + a + "x^2 + " + b + "x + " + c);
			System.out.println("The roots are " + root1 + " & " + root2);
		}
		else if (determinant == 0)
		{
			root1 = -b / 2*a;
			
			System.out.println("The equation is: " + a + "x^2 + " + b + "x + " + c);
			System.out.println("The root is " + root1);
		}
		else
		{
			System.out.println("These roots are undefined");
		}
		
	}
		

		
}
