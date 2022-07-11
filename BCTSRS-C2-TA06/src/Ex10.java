
/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;

/**
 * This class is the tenth exercise of TA06
 * 
 */
public class Ex10 {
	/**
	 * This main method summons a method that creates an array with values asked
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// We start creating the array using the method for it
		askLength();
	}

	/**
	 * This method creates an array asking its length and summons the insertion of
	 * values
	 * 
	 * @return nums the array created with the length asked
	 */
	public static void askLength() {
		// We create the array with the length asked
		String len = JOptionPane.showInputDialog("Write the length of the array");

		// We parse the string to integer
		int l = Integer.parseInt(len);

		// We create the array with the length we asked
		int nums[] = new int[l];

		// Now we summon a method to insert values to the array
		arrayInsertion(nums, l);
	}

	/**
	 * This method inserts random numbers to the array asking the range (maximum and
	 * minimum)
	 * 
	 * @param nums the array
	 * @param l    the length of the array
	 */
	public static void arrayInsertion(int nums[], int l) {
		// Ask maximum and minimum for the random numbers
		String minimum = JOptionPane.showInputDialog("Write the minimum range of the random numbers.");
		String maximum = JOptionPane.showInputDialog("Write the maximum range of the random numbers.");

		// We convert the strings to integers
		int min = Integer.parseInt(minimum);
		int max = Integer.parseInt(maximum);

		// We initialize the integer random number we will use
		int rn = 0;

		// We will print all the numbers of the array
		System.out.println("These are the " + l + " random primal numbers between " + min + " and " + max + ":");

		// We iterate "l" times the generation of a prime random number in the range we asked
		int i = 0;

		while (i < l) {
			rn = (int) (Math.random() * ((max - min) + 1)) + min;
			if (primeCheck(rn)) {
				nums[i] = rn;
				System.out.println(rn);
				i++;
			}
		}

		/* When finished, we summon the next method that shows the greatest number
		inside the array */
		arrayGreatestNum(nums, l);
	}

	/**
	 * This method checks if the number in the argument is prime or not and returns
	 * the boolean result.
	 * 
	 * @param n the integer we want to check if its prime
	 * @return isPrime boolean result if the number is prime or not
	 */
	public static boolean primeCheck(int n) {
		// We initialize a boolean variable
		boolean isPrime = true;

		// Check if the number is 1 or less
		if (n <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			// If not, we start an iteration that checks the divisions of the number
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					// If we found a division with 0 residue we end the search
					isPrime = false;
					break;
				}
			}
			// We return the result
			return isPrime;
		}
	}

	/**
	 * This method shows the greatest value in the array
	 * 
	 * @param nums the array
	 * @param l    the length of the array
	 */
	private static void arrayGreatestNum(int nums[], int l) {
		// First we create a variable that will be the greatest number
		int greatest = 0;

		// We iterate checking the value at each position and keeping the greatest
		greatest = nums[0];
		for (int i = 1; i < l; i++) {
			if (nums[i] > greatest) {
				greatest = nums[i];
			}
		}
		// Finally, we show the greatest number
		System.out.println("The greatest number inside the array is: " + greatest);
	}
}