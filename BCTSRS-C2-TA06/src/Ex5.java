/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the fifth exercise of TA06
 * 
 */
public class Ex5 {

	/**
	 * This main method asks for a decimal number to calculate the binary of it. Then summons a method that does the calculations.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Ask for the number
		String number = JOptionPane.showInputDialog("Write the number you want to know its binary:");
		
		//We parse the string to integer
		int n = Integer.parseInt(number);
		
		//We use the factorial function
		String r = binary(n);
		
		//We show the result
		JOptionPane.showMessageDialog(null, "The binary of "+n+" is: "+r);
		
	}
	
	
	/**
	 * This method calculates the binary of the number of the argument
	 * 
	 * @param n the number we want to calculate the binary
	 * @return r the binary of n
	 */
	public static String binary(int n) {
		//We initialize a result variable and equal it to the result of the function that calculates the binary and returns string
		String r = Integer.toBinaryString(n);;	
		
		//Then we return the result
		return r;
	}
}