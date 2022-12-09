import java.util.*;

public class RockPaperCissors 
{

	public static void main(String[] args) 
	{
		boolean game = true;
		String choice = " ";
		Scanner funGame = new Scanner(System.in);
		
		System.out.println("Welcome to Rock Paper Scissors!\nEnter your move\n1 - Rock\n2 - Paper\n3 - Scissors");
		while (game)
		{
			int botPlayer = (int)(Math.random()*3) + 1;
			int humanPlayer = funGame.nextInt();
			
			if (botPlayer == 1)
			{
				choice = "Rock";
			}
			if (botPlayer == 2)
			{
				choice = "Paper";
			}
			if (botPlayer == 3)
			{
				choice = "Scissors";
			}
			
			{
			if (botPlayer == 1 && humanPlayer == 3 || botPlayer == 2 && humanPlayer == 1 || botPlayer == 3 && botPlayer == 2)
			{
				System.out.println("Your opponent chose " + choice + "\nYou Lose :(");
				game = false;
				
			}
			else if (humanPlayer == botPlayer)
			{
				System.out.println("Your opponent chose " + choice + "\nYou tied :| \nTry again");
			}
			else
			{
				System.out.println("Your opponent chose " + choice + "\nYou win! :)");
				game = false;
			}
		}

	}

}
}
