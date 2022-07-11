/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the second exercise of TA06
 * 
 */
public class Ex2 {

	/**
	 * This main method asks the number of random numbers the user wants and then summons rng method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Ask how many random numbers the user wants
		String numbers = JOptionPane.showInputDialog("How many random numbers you want?");
		
		int n = Integer.parseInt(numbers);
		
		rng(n);
		
	}
	
	/**
	 * This method generates asks a maximum and minimum range for the N random numbers the user wants.
	 * 
	 * @param n the number of random numbers its going to generate the method
	 */
	public static void rng(int n) {
		//Ask max and min for the random numbers
		String minimum = JOptionPane.showInputDialog("Write the minimum range of the random numbers.");
		String maximum = JOptionPane.showInputDialog("Write the maximum range of the random numbers.");
		
		//We convert the strings to integers
		int min = Integer.parseInt(minimum);
		int max = Integer.parseInt(maximum);
		
		//We initialize the integer random number we will return
		int rn = 0;
		
		System.out.println("These are the "+n+" random numbers between "+min+" and "+max+":");
		
		//We iterate N times the generation of a random number in the range we asked
		for(int i=0;i<n;i++) {
			rn = (int)(Math.random() * ((max - min) + 1)) + min;
			System.out.println(rn);
		}
		
		//End of the program
		System.out.println("End of the program");
	}

}
