/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the fourth exercise of TA06
 * 
 */
public class Ex4 {

	/**
	 * This main method asks for a number to calculate the factorial of it. Then summons a method that does the calculations.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Ask for the number
		String number = JOptionPane.showInputDialog("Write the number you want to know its factorial:");
		
		int n = Integer.parseInt(number);
		
		//We use the factorial function
		int r = factorial(n);
		
		//We show the result
		JOptionPane.showMessageDialog(null, "The factorial of "+n+" is: "+r);
		
	}
	
	
	/**
	 * This method calculates the factorial of the number of the argument
	 * 
	 * @param n the number we want to calculate the factorial
	 * @return r the factorial of n
	 */
	public static int factorial(int n) {
		//We initialize a result variable
		int r=1;
		
		//We iterate n-1 times reducing the value of n and doing the product and saving it into r
		while(n>1) {
			r=r*n;
			n--;
		}
		
		//Then we return the result
		return r;
	}
}
