/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the third exercise of TA06
 * 
 */
public class Ex3 {

	/**
	 * This main method asks for a number to check if its prime or not. Then summons "primeCheck" and returns the result.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Ask for the number
		String number = JOptionPane.showInputDialog("Write the number you want to know if its a prime number or not.");
		
		int n = Integer.parseInt(number);
		
		//We use the check method to check if the number is prime and show the result with a message
		if (primeCheck(n)) {
			JOptionPane.showMessageDialog(null, n+" is a prime number.");
		} else {
			JOptionPane.showMessageDialog(null, n+" is NOT a prime number.");
		}
		
	}
	
	/**
	 * This method checks if the number in the argument is prime or not and returns the boolean result.
	 * 
	 * @param n the number we want to check if its prime or not
	 */
	public static boolean primeCheck(int n) {
		//We initialize a boolean variable
		boolean isPrime = true;
		
		//Check if the number is 1 or less
		if(n <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			//If not, we start an iteration that checks the divisions of the number
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					//If we found a division with 0 residue we end the search
					isPrime = false;
					break;
				}
			}
		//We return the result
		return isPrime;
		}
	}

}
