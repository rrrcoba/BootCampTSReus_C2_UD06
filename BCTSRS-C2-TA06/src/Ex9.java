
/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;

/**
 * This class is the nineth exercise of TA06
 * 
 */
public class Ex9 {
	/**
	 * This main method summons a method that creates an array with values asked It
	 * creates min and max values (0 and 9) and summons the insertion of values into
	 * the array
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// We create the array with the length asked
		String len = JOptionPane.showInputDialog("Write the length of the array");
		int l = Integer.parseInt(len);
		int nums[] = new int[l];

		/* And we summon the method that creates and inserts the random numbers between
		0 and 9 */
		int min = 0;
		int max = 9;
		arrayInsertion(nums, min, max, l);
	}

	/**
	 * This method inserts random numbers to the array
	 * 
	 * @param nums the array
	 * @param min  the minimum range of the random generation
	 * @param max  the maximum range of the random generation
	 * @param l    the length of the array
	 */
	public static void arrayInsertion(int nums[], int min, int max, int l) {
		// We initialize the integer random number that we will insert
		int rn;

		// We iterate N times the generation of a random number in the range we asked
		// and insert it into the array
		for (int i = 0; i < l; i++) {
			rn = (int) (Math.random() * ((max - min) + 1)) + min;
			nums[i] = rn;
		}

		/* When finished, we summon the next method that shows the numbers and its
		position and the result of all numbers added */
		arrayShow(nums);
	}

	/**
	 * This method shows the values of the array, its positions and the summation
	 * 
	 * @param nums the integer array
	 */
	private static void arrayShow(int nums[]) {
		/* First we create a variable that will be iterating and showing its value with
		 all the numbers in the array */
		int v = 0;
		int sum = 0;

		// We iterate showing numbers and its position in the array and calculating the summation
		for (int i = 0; i < 10; i++) {
			// We assign v to the first value
			v = nums[i];

			// We show the position and the value
			System.out.println("Position:" + i + "  Value:" + v);

			// We do the summation
			sum = sum + v;
		}
		// Finally, we show the summation
		System.out.println("The result of adding all the values in the array is: " + sum);
	}
}
