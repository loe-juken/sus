import java.util.*;
public class RandomGuessingGame 
{

	public static void main(String[] args) 
	{
		boolean program = true;
		boolean game = true;
		boolean numguesss = true;
		System.out.println("Created by Joe luken\nWelcome to the random guessing game");
		Scanner scan = new Scanner(System.in);
		int numGuess;
		int max = 10;
		int min = 1;
		
		while (program)
		{
			while (game)
			{
			numguesss = true;
				int guess = (int)(Math.random()*(max-min+1)+min); // Generates number 1-10
			
				while (numguesss)
				{
					System.out.println("Guess a number from 1-10"); numGuess = scan.nextInt(); // gets a guess from user
					if (numGuess > guess)
						System.out.println("lower");
					else if (numGuess < guess)
						System.out.println("higher");
					else
					{
						numguesss = false;
						game=false;
					}
				
				}
			}
			System.out.println("GAME OVER \nYou Win!");
			System.out.println("Do you want to play again (yes or no)?");
			String yesorno = scan.nextLine();
			if (yesorno.equalsIgnoreCase("yes")) game = true;
			
			
		}

	}

}
