import javax.swing.JOptionPane;

public class MovieQuote 
{

	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("What is your name (First and Last)");
		String quote = JOptionPane.showInputDialog("What is yout favorite movie quote");
		
		JOptionPane.showMessageDialog(null, name + "\n" + quote);
	}

}
