/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the twelfth exercise of TA06
 * 
 */
public class Ex12 {
	/**
	 * This main method does:
	 * - Creates an array with the length asked
	 * - Inserts random numbers in the array
	 * - Asks for a number of the last digit of the numbers
	 * - Returns the values of an array that only have values ended with the digit asked
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// We start creating the array of integers using methods for it
		int l = askLength();
		int nums[] = arrayCreation(l);

		// The array will have random numbers inserted
		nums = arrayInsertion(nums, l);

		// We ask the last digit of the numbers we want
		String number = JOptionPane.showInputDialog("Write the last digit of the values:");
		int n = Integer.parseInt(number);

		// We get the new array with the numbers we want and we show it
		arrayNumCheckAndShow(nums, l, n);
	}

	/**
	 * This method asks the length for an array
	 * 
	 * @return l the length
	 */
	public static int askLength() {
		// We create the array with the length asked
		String len = JOptionPane.showInputDialog("Write the length of the array");

		// We parse the string to integer
		int l = Integer.parseInt(len);

		// We return the length asked
		return l;
	}

	/**
	 * This method creates an array of integers with the given length
	 * 
	 * @param l the length
	 * @return nums the array created
	 */
	public static int[] arrayCreation(int l) {
		// We create the array with the length we asked
		int nums[] = new int[l];
		return nums;
	}

	/**
	 * This method inserts random numbers to the array in the range between 1 and
	 * 300
	 * 
	 * @param nums the array
	 * @param l the length of the array
	 * @return nums the array with the values inserted
	 */
	public static int[] arrayInsertion(int nums[], int l) {
		// We convert the strings to integers
		int min = 1;
		int max = 300;

		// We initialize the integer random number we will use
		int rn = 0;

		/* We iterate N times the generation of a random number in the range we asked
		and insert it into the array */
		for (int i = 0; i < l; i++) {
			rn = (int) (Math.random() * ((max - min) + 1)) + min;
			nums[i] = rn;
		}

		// We return the array with the values inserted
		return nums;
	}

	/**
	 * This method creates a new array with the values ended by a digit we indicate
	 * of the array of the argument and then it shows the content
	 * 
	 * @param nums1 the first array
	 * @param l     the length of the arrays
	 * @param n     the last digit
	 */
	private static void arrayNumCheckAndShow(int nums[], int l, int n) {
		// We create a counter variable
		int count = 0;

		// We count the number of values ended with the digit n
		for (int i = 0; i < l; i++) {
			if (lastDigit(nums[i]) == n) {
				count++;
			}
		}

		// We create an array with the length of the counter
		int nums2[] = arrayCreation(count);

		// We iterate adding the numbers into the new array (we need another iteration variable k)
		int k = 0;
		for (int i = 0; k < count; i++) {
			if (lastDigit(nums[i]) == n) {
				nums2[k] = nums[i];
				k++;
			}
		}

		// Finally we print the content
		System.out.println("The values ended with the digit asked are:");
		for (int i = 0; i < count; i++) {
			System.out.println(nums2[i]);
		}

	}

	/**
	 * This method returns the last digit of an integer
	 * 
	 * @param n the integer
	 * @return the last digit
	 */
	public static int lastDigit(int n) {
		return Math.abs(n) % 10;
	}
}