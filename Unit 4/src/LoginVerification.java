import java.util.*;
import java.lang.Thread;
public class LoginVerification 
{

	public static void main(String[] args) 
	{
		String storedUser = "";
		String storedPass = "";
		int minPass = 8; // set minimum char. amount for password 
		
		boolean loginValidity = true;
		
		Scanner scan = new Scanner(System.in); // Create Scanner object
		
		System.out.println("Please register an account by making a Username and Password\nPassword rules:\n"
				+ "1) minimum " + minPass + " char.\n"
				+ "2) at least one special character of ()!@#$%^&*+=.,></?':; \n"
				+ "3) at lease one capital letter \n"
				+ "4) at least one number");
		
		System.out.println("New Username: "); storedUser = scan.nextLine(); // required username
		
		while (loginValidity)
		{
		
		System.out.println("New Password: "); storedPass = scan.nextLine(); // required password
		
		if (storedPass.length()>=minPass 
				&& (storedPass.contains("(") || storedPass.contains(")") || storedPass.contains("!") || storedPass.contains("@") || storedPass.contains("#") || storedPass.contains("$") || storedPass.contains("%") || storedPass.contains("^") || storedPass.contains("&") || storedPass.contains("*") || storedPass.contains("+") || storedPass.contains("=") || storedPass.contains(".") || storedPass.contains(",") || storedPass.contains("<") || storedPass.contains(">") || storedPass.contains("/") || storedPass.contains("?") || storedPass.contains("'") || storedPass.contains(";") || storedPass.contains(":")) 
				&& (storedPass.contains("A") || storedPass.contains("B") || storedPass.contains("C") || storedPass.contains("D") || storedPass.contains("E") || storedPass.contains("F") || storedPass.contains("G") || storedPass.contains("H") || storedPass.contains("I") || storedPass.contains("J") || storedPass.contains("K") || storedPass.contains("L") || storedPass.contains("M") || storedPass.contains("N") || storedPass.contains("O") || storedPass.contains("P") || storedPass.contains("Q") || storedPass.contains("R") || storedPass.contains("S") || storedPass.contains("T") || storedPass.contains("U") || storedPass.contains("V") || storedPass.contains("W") || storedPass.contains("X") || storedPass.contains("Y") || storedPass.contains("Z") )
				&& (storedPass.contains("1") || storedPass.contains("2") || storedPass.contains("3") || storedPass.contains("4") || storedPass.contains("5") || storedPass.contains("6") || storedPass.contains("7") || storedPass.contains("8") || storedPass.contains("9") || storedPass.contains("10")))		
		{	
			loginValidity = false; // if statement checks for all of the password rules
		}
		else
			System.out.println("Pasword does not meet the password safety rules above /n please try again");
		}
		
		boolean verification = false; // declare boolean control
		int tries = 0; // declare a try counter
		int locks = 0; // declare a locked out counter
		long lockSeconds; // lock seconds
		
		System.out.println("Please login in with your Username and Password:"); // Prompt user for input (only for first time so outside loop) 
		
		while (!verification)
		{
			
			System.out.println("Username: "); String user = scan.nextLine(); // Get username
			System.out.println("Password: "); String pass = scan.nextLine(); // Get password
			
			if (user.equals(storedUser) && pass.equals(pass))
				verification = true; // Passes if correct user and pass
			else
			{
				tries++;
				if ((user.equals(storedUser) && !pass.equals(storedPass)) || (!user.equals(storedUser) && pass.equals(storedPass)))
					System.out.println("Username and Password do not match");
				else
					System.out.println("Username and Password are incorrect");
				
				/*Checks and notifies user for different cases:
				 * 
				 * 1) One is right other is not
				 * 
				 * 2) Both are wrong
				 */
					
			}
				
			
			if (tries >= 3 && !(user.equals(storedUser) && pass.equals(pass)))
			{
				locks++;
				System.out.println("You have been locked out of your account for " + locks*2 + " seconds"); // informs user of lock out
			
				lockSeconds = 1000*(locks*10);
				try 
				{
					Thread.sleep(lockSeconds);
				} 											// Try catch thing that works with the Thread.sleep that I looked up online
				catch (InterruptedException e) 				// Waits time based on amount of times locked out
				{
					e.printStackTrace();
				}
				
				System.out.println("Please try again");
			}
			else if (tries>0)
				System.out.println("Please try again");
		}
		
		System.out.println("You have successfully logged in!");
	}

}
