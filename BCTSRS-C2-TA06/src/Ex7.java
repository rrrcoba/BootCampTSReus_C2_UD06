/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the seventh exercise of TA06
 * 
 */
public class Ex7 {

	/**
	 * This main method summons the menu after asking the currency change and the value in euros
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Ask the currency change
		String change = JOptionPane.showInputDialog("Write the name of the currency you want to convert to "
		+ "(only pound, dollar and yen, in english language and without caps). Write 0 if you want to exit.");
		
		//Ask the value to change
		String value = JOptionPane.showInputDialog("Write the value (in euros) you want to convert. Write 0 if you want to exit.");
		
		//We parse the value to double
		double v = Double.parseDouble(value);
		
		//We summon the menu that switch to the currency change method
		menu(change, v);
	}
	
	/**
	 * This method is the menu of the application and summons the method we need
	 */
	public static void menu(String change, double v) {
		//Switch to the currency change
		switch (change) {
			case "0":
				break;
			case "pound":
				pound(v);	
				break;
			case "dollar":
				dollar(v);		
				break;
			case "yen":
				yen(v);		
				break;
			default:
				JOptionPane.showMessageDialog(null, "Incorrect values", "Value Error", 0);
				break;
		}
		//End of the program
		System.out.println("End of the program.");
	}
	
	
	/**
	 * This method calculates the value of the parameter to pounds.
	 * 
	 * @param v the value in euros that will change.
	 */
	public static void pound(double v) {
		//We create a result variable equal to the calculation of the change
		double r = v*0.86;
		
		//We show the result
		JOptionPane.showMessageDialog(null, v+"€ are "+r+" pounds.");
	}
	
	/**
	 * This method calculates the value of the parameter to dollars.
	 * 
	 * @param v the value in euros that will change.
	 */
	public static void dollar(double v) {
		double r = v*1.28611;
		JOptionPane.showMessageDialog(null, v+"€ are "+r+"$.");
	}
	
	/**
	 * This method calculates the value of the parameter in japanese yens
	 * 
	 * @param v the value in euros that will change
	 */
	public static void yen(double v) {
		double r = v*129.852;
		JOptionPane.showMessageDialog(null, v+"€ are "+r+" japanese yens.");
	}
}