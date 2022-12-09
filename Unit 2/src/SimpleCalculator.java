import javax.swing.JOptionPane;

public class SimpleCalculator 
{

	public static void main(String[] args) 
	{
		
		/*
		 String num = JOptionPane.showInputDialog("Enter a number");
		 
		double numa = Float.parseFloat(num);
		num = JOptionPane.showInputDialog("Enter a number");
		double numb = Float.parseFloat(num);
		
		JOptionPane.showInternalMessageDialog(null, numa + "+" + numb + "=" + (numa + numb));
		JOptionPane.showInternalMessageDialog(null, numa + "-" + numb + "=" + (numa - numb));
		JOptionPane.showInternalMessageDialog(null, numb + "-" + numa + "=" + (numb - numa));
		JOptionPane.showInternalMessageDialog(null, numa + "*" + numb + "=" + (numa * numb));
		JOptionPane.showInternalMessageDialog(null, numa + "/" + numb + "=" + (numa / numb));
		JOptionPane.showInternalMessageDialog(null, numb + "/" + numa + "=" + (numb / numa));
		*/
		double x = Math.pow(10, 20) + 1;
		System.out.println(x);
		double y = 999.0/1000.0;
		System.out.println(y);
		double z = x-y;
		System.out.println(z);
	}

}
