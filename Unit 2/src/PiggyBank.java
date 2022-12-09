import javax.swing.JOptionPane;

public class PiggyBank 
{

	public static void main(String[] args) 
	{
		/*
		 Joe Luken
		 Used to 
		*/
		
		
		
		String bala = JOptionPane.showInputDialog("What is your original balance? ");
		double bal = Float.parseFloat(bala);
		String[] coins = {"Penny", "Nickel", "Dime", "Quarter", "Half Dollar", "Cancel"}; 
		
		final double PENNY = 0.01;
		final double NICKEL = 0.05;
		final double DIME = 0.10;
		final double QUARTER = 0.25;
		final double HALF_DOLLAR = 0.50;
		
		int pennycnt = 0;
		int nickelcnt = 0;
		int dimecnt = 0;
		int quartercnt = 0;
		int halfdollarcnt = 0;
		
		int coinAmnt = 0;
		
		
		boolean exit = true;
		while (exit) 
		{
			
			String[] options = {"Deposit", "Withdraw", "Exit"};
			
			int x = JOptionPane.showOptionDialog(null, "Welcome to Joe's piggy bank! \nBalance: $" + bal + "\n\nOverall Coin Amount:" + coinAmnt + "\n\nPenny Amount:" + pennycnt + "\nNickel Amount:" + nickelcnt +"\nDime Amount:" + dimecnt +"\nQuarter Amount:" + quartercnt +"\nHalf Dollar Amount:" + halfdollarcnt +"\n\nWhat would you like to do?","Joe's piggy bank",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if (x == 0) 
			{
				String cointype = (String) JOptionPane.showInputDialog(null, "Choose your coin type or cancel","Insert coins", JOptionPane.QUESTION_MESSAGE, null, coins,coins[1]);
					if (cointype.equalsIgnoreCase("Penny")) 
					{
						String pennyAmntStr = JOptionPane.showInputDialog("How many pennies are you inserting?\nPenny count: " + pennycnt);
						int pennyAmnt = Integer.parseInt(pennyAmntStr);
						bal = bal + (pennyAmnt*PENNY);
						coinAmnt = coinAmnt + pennyAmnt;
						pennycnt = pennycnt + pennyAmnt;
					}
					else if (cointype == "Nickel") 
					{
						String nickelAmntStr = JOptionPane.showInputDialog("How many nickels are you inserting?\nNickel count: " + nickelcnt);
						int nickelAmnt = Integer.parseInt(nickelAmntStr);
						bal = bal + (nickelAmnt*NICKEL);
						coinAmnt = coinAmnt + nickelAmnt;
						nickelcnt = nickelcnt + nickelAmnt;
					}
					else if (cointype == "Dime") 
					{
						String dimeAmntStr = JOptionPane.showInputDialog("How many dimes are you inserting?\nDime count: " + dimecnt);
						int dimeAmnt = Integer.parseInt(dimeAmntStr);
						bal = bal + (dimeAmnt*DIME);
						coinAmnt = coinAmnt + dimeAmnt;
						dimecnt = dimecnt + dimeAmnt;
					}
					else if (cointype == "Quarter") 
					{
						String quarterAmntStr = JOptionPane.showInputDialog("How many quarters are you inserting?\nQuarter count: " + quartercnt);
						int quarterAmnt = Integer.parseInt(quarterAmntStr);
						bal = bal + (quarterAmnt*QUARTER);
						coinAmnt = coinAmnt + quarterAmnt;
						quartercnt = quartercnt + quarterAmnt;
					}
					else if (cointype == "Half Dollar") 
					{
						String halfAmntStr = JOptionPane.showInputDialog("How many quarters are you inserting?\nHalf Dollar count: " + halfdollarcnt);
						int halfAmnt = Integer.parseInt(halfAmntStr);
						bal = bal + (halfAmnt*HALF_DOLLAR);
						coinAmnt = coinAmnt + halfAmnt;
						halfdollarcnt = halfdollarcnt + halfAmnt;
					}
					else if (cointype == "Exit") 
					{
					}
			}
			else if (x == 1) 
			{
				String cointype = (String) JOptionPane.showInputDialog(null, "Choose your coin type or cancel","Take out coins coins", JOptionPane.QUESTION_MESSAGE, null, coins,coins[1]);
					if (cointype == "Penny") 
					{
						String pennyAmntStr = JOptionPane.showInputDialog("How many pennies are you withdrawing?\nPenny count: " + pennycnt);
						int pennyAmnt = Integer.parseInt(pennyAmntStr);
						bal = bal - (pennyAmnt*PENNY);
						coinAmnt = coinAmnt - pennyAmnt;
						pennycnt = pennycnt - pennyAmnt;
					}
					else if (cointype == "Nickel") 
					{
						String nickelAmntStr = JOptionPane.showInputDialog("How many nickels are you withdrawing?\nNickel count: " + nickelcnt);
						int nickelAmnt = Integer.parseInt(nickelAmntStr);
						bal = bal - (nickelAmnt*NICKEL);
						coinAmnt = coinAmnt - nickelAmnt;
						nickelcnt = nickelcnt - nickelAmnt;
					}
					else if (cointype == "Dime") 
					{
						String dimeAmntStr = JOptionPane.showInputDialog("How many dimes are you withdrawing?\nDime count: " + dimecnt);
						int dimeAmnt = Integer.parseInt(dimeAmntStr);
						bal = bal + (dimeAmnt*DIME);
						coinAmnt = coinAmnt - dimeAmnt;
						dimecnt = dimecnt - dimeAmnt;
					}
					else if (cointype == "Quarter") 
					{
						String quarterAmntStr = JOptionPane.showInputDialog("How many quarters are you withdrawing?\nQuarter count: " + quartercnt);
						int quarterAmnt = Integer.parseInt(quarterAmntStr);
						bal = bal - (quarterAmnt*QUARTER);
						coinAmnt = coinAmnt - quarterAmnt;
						quartercnt = quartercnt - quarterAmnt;
					}
					else if (cointype == "Half Dollar") 
					{
						String halfAmntStr = JOptionPane.showInputDialog("How many quarters are you withdrawing?\nHalf Dollar count: " + halfdollarcnt);
						int halfAmnt = Integer.parseInt(halfAmntStr);
						bal = bal - (halfAmnt*HALF_DOLLAR);
						coinAmnt = coinAmnt - halfAmnt;
						halfdollarcnt = halfdollarcnt - halfAmnt;
					}
					else if (cointype == "Exit") 
					{
					}
			}
			else if (x == 2) 
			{
				exit = false;
			}
		}
		

	}

}
