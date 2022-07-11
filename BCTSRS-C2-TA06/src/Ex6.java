/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the sixth exercise of TA06
 * 
 */
public class Ex6 {

	/**
	 * This main method asks for a number to calculate his length. Then summons a method that does the calculations.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Ask for the number
		String number = JOptionPane.showInputDialog("Write the number you want to know its length:");
		
		//We parse the String to integer
		int n = Integer.parseInt(number);
		
		//First we check if its positive
		if(n>0) {
			//If its true then we use the factorial function
			int r = length(n);
			
			//And we show the result
			JOptionPane.showMessageDialog(null, "The length of "+n+" is: "+r);
		} else {
			//If its not positive we return an error message
			JOptionPane.showMessageDialog(null, "Incorrect value. It must be positive.", "Value Error", 0);
		}
	}
	
	
	/**
	 * This method calculates the length of the number of the argument
	 * 
	 * @param n the number we want to calculate the length
	 * @return r the length of n
	 */
	public static int length(int n) {
		//We initialize the result variable and we convert the argument to String at the same time we count the digits.
		int r = String.valueOf(n).length();	
		
		//Then we return the result
		return r;
	}
	
}