import javax.swing.JOptionPane;

public class MadLibs 
{

	public static void main(String[] args) 
	{
		String noun = JOptionPane.showInputDialog("Enter a common noun");
		String place = JOptionPane.showInputDialog("Enter a place");
		String verb = JOptionPane.showInputDialog("Enter a past tense verb");
		String adverb = JOptionPane.showInputDialog("Enter an adverb");
		String adj = JOptionPane.showInputDialog("Enter an adjective");
		
		JOptionPane.showInternalMessageDialog(null, "The sussy " + noun + " lurked throughout " + place + ". \n It " + verb + " " + adverb + ", \n Until the " + adj + " sheriff locked it up");

	}

}
