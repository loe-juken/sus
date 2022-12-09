import java.util.Scanner;

public class LoginVerification_ 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String storedUser = "Username";
		String storedPass = "Password";
		String pass = "";
		String user = "";
		
		boolean verification = false; // declare boolean control
		int tries = 0; // declare a try counter
		
		System.out.println("Please login in with your Username and Password:"); // Prompt user for input (only for first time so outside loop) 
		
		while (!verification)
		{
			
			System.out.println("Username: "); user = scan.nextLine(); // Get username
			System.out.println("Password: "); pass = scan.nextLine(); // Get password
			
			if (user.equals(storedUser) && pass.equals(pass))
				verification = true; // Passes if correct user and pass
			else
			{
				tries++;
				if ((user.equals(storedUser) && !pass.equals(storedPass)) || (!user.equals(storedUser) && pass.equals(storedPass)))
					System.out.println("Username and Password do not match");
				else
					System.out.println("Username and Password are incorrect");
			}
				
			
			if (tries >= 3 && !(user.equals(storedUser) && pass.equals(pass)))
			{
				System.out.println("You are out of tries :(");
				verification=false;
			}
		}
		if (user.equals(storedUser) && pass.equals(pass))
		        System.out.println("You have successfully logged in!");
	}

}
