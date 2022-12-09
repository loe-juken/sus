import javax.swing.JOptionPane;

public class SammysRentalProgram 
{

	public static void main(String[] args) 
	{
		JOptionPane.showInternalMessageDialog(null, "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\nSs Sammy’s makes it fun in the sun Ss\nSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		
		String[] coins = {"Kayak", "Canoe", "Beach Chair", "Umbrella", "Cancel"};
		String rentalChoice = (String) JOptionPane.showInputDialog(null, "Choose your rented item or cancel","Welcome to Sammy's!", JOptionPane.QUESTION_MESSAGE, null, coins,coins[1]);
		
		
		
		
		if (rentalChoice.equalsIgnoreCase("Kayak")) 
		{
			String strmin = JOptionPane.showInputDialog("How many minutes did you rent for (as an integer)?");
			int min = Integer.parseInt(strmin);
				int hrsRate = (40*(min/60));
				int minRate = (min%60);
				JOptionPane.showInternalMessageDialog(null, "You owe $" + (minRate + hrsRate));
		}
		else if (rentalChoice.equalsIgnoreCase("Canoe")) 
		{
			String strmin = JOptionPane.showInputDialog("How many minutes did you rent for (as an integer)?");
			int min = Integer.parseInt(strmin);
			int hrsRate = (40*(min/60));
			int minRate = (min%60);
			JOptionPane.showInternalMessageDialog(null, "You owe $" + (minRate + hrsRate));
		}
		else if (rentalChoice.equalsIgnoreCase("Beach Chair")) 
		{
			String strmin = JOptionPane.showInputDialog("How many minutes did you rent for (as an integer)?");
			int min = Integer.parseInt(strmin);
			int hrsRate = (40*(min/60));
			int minRate = (min%60);
			JOptionPane.showInternalMessageDialog(null, "You owe $" + (minRate + hrsRate));
		}
		else if (rentalChoice.equalsIgnoreCase("Umbrella")) 
		{
			String strmin = JOptionPane.showInputDialog("How many minutes did you rent for (as an integer)?");
			int min = Integer.parseInt(strmin);
			int hrsRate = (40*(min/60));
			int minRate = (min%60);
			JOptionPane.showInternalMessageDialog(null, "You owe $" + (minRate + hrsRate));
		}
		else if (rentalChoice.equalsIgnoreCase("Cancel")) 
		{
			
		}
		
	}

}
