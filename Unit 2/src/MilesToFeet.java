import javax.swing.JOptionPane;

public class MilesToFeet 
{

	public static void main(String[] args) 
	{
		
		
		String unitstr = JOptionPane.showInputDialog("Welcome to the feet to mile converter! \nWhat unit of length are you using (feet (1) or miles (2))?");
		String diststr = JOptionPane.showInputDialog("How long is this distance?");
		double dist = Float.parseFloat(diststr);
		int unit = Integer.parseInt(unitstr);
		
		if (unit == 2)
		{
			double mToFt = dist * 5280.0;
			JOptionPane.showInternalMessageDialog(null, dist + " miles\n" + mToFt + "feet");
		}
		else
		{
			double ftToM = dist / 5280.0;
			JOptionPane.showInternalMessageDialog(null, dist + " feet\n" + ftToM + "miles");
		}
		
		
		

	}

}
