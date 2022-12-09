
import javax.swing.JOptionPane;
public class DriversLicense 
{

	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("What is your name (First and Last)?");
		String ageinput = JOptionPane.showInputDialog("How old are you? ");
		int age = Integer.parseInt(ageinput);
		
		if ( age - 16 >= 0) 
		{
			JOptionPane.showInternalMessageDialog(null, name + "\n You already can get your driver's license.");
		}
		
		else if ( age - 16 < 0) 
		{
			JOptionPane.showInternalMessageDialog(null, name + "\n You have " + (java.lang.Math.abs(age-16)) + " years until you can get your license");
		}
	}

}
