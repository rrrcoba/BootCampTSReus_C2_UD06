
/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;

/**
 * This class is the eleventh exercise of TA06
 * 
 */
public class Ex11 {
	/**
	 * This main method does: 
	 * - Creates a first array with the length asked 
	 * - Creates a second array with the same length 
	 * - Inserts random values to the first array 
	 * - Points the second array to the first one 
	 * - Inserts random values to the second array 
	 * - Creates a third array with the values of multiplying each position of the first 2 arrays 
	 * - Shows the content of the 3 arrays
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// We start creating the first array of integers using methods for it
		int l = askLength();
		int nums1[] = arrayCreation(l);

		// We create the second one with same length as the first one
		int nums2[] = arrayCreation(l);

		// The first one will have random numbers inserted
		nums1 = arrayInsertion(nums1, l);

		// The second array will be pointing the first one
		nums2 = nums1;

		// We insert random numbers on the second array
		nums2 = arrayInsertion(nums2, l);

		// We multiply the first and the second array and get the results into a third array
		int nums3[] = arrayMultiplier(nums1, nums2, l);

		// Finally, we show the content of the 3 arrays
		System.out.println("The content of the first array is:");
		arrayShow(nums1, l);

		System.out.println("The content of the second array is:");
		arrayShow(nums2, l);

		System.out.println("The content of the third array is:");
		arrayShow(nums3, l);
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
	 * This method inserts random numbers to the array
	 * 
	 * @param nums the array
	 * @param l    the length of the array
	 * @return nums the array with the values inserted
	 */
	public static int[] arrayInsertion(int nums[], int l) {
		// Ask maximum and minimum for the random numbers
		String minimum = JOptionPane.showInputDialog("Write the minimum range of the random numbers.");
		String maximum = JOptionPane.showInputDialog("Write the maximum range of the random numbers.");

		// We convert the strings to integers
		int min = Integer.parseInt(minimum);
		int max = Integer.parseInt(maximum);

		// We initialize the integer random number we will use
		int rn = 0;

		/* We iterate N times the generation of a random number in the range we asked
		and insert it into the array */
		for (int i = 0; i < l; i++) {
			rn = (int) (Math.random() * ((max - min) + 1)) + min;
			nums[i] = rn;
		}

		return nums;
	}

	/**
	 * This method multiplies each position of 2 arrays with equal length and
	 * returns an array with the results
	 * 
	 * @param nums1 the first array
	 * @param nums2 the second array
	 * @param l     the length of the arrays
	 * @return nums3 the third array with the results
	 */
	private static int[] arrayMultiplier(int nums1[], int nums2[], int l) {
		// We create a third array that will have the results
		int nums3[] = arrayCreation(l);

		/* We iterate for each positions of the 2 arrays and we multiply the values and
		save them to a third array */
		for (int i = 0; i < l; i++) {
			nums3[i] = nums1[i] * nums2[i];
		}
		return nums3;
	}

	/**
	 * This method shows the content of an array
	 * 
	 * @param nums the array
	 * @param l    the length of the array
	 */
	public static void arrayShow(int nums[], int l) {
		// We iterate the array showing all the content
		for (int i = 0; i < l; i++) {
			System.out.println(nums[i]);
		}
	}
}