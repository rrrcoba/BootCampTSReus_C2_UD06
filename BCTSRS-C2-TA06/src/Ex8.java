
/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;

/**
 * This class is the eighth exercise of TA06
 * 
 */
public class Ex8 {
	/**
	 * This main method summons a method that creates an array with values asked
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// We create the array
		String nums[] = new String[10];
		// And we start summoning the method that asks and inserts values to the array
		arrayInsertion(nums);
	}

	/**
	 * This method asks numbers and inserts them to the array
	 * 
	 * @param nums the array of 10 positions
	 */
	public static void arrayInsertion(String nums[]) {
		// We iterate asking numbers and inserting to the array (10 times)
		for (int i = 0; i < 10; i++) {
			String value = JOptionPane.showInputDialog("Write a number you want to insert to the array created.");
			nums[i] = value;
		}

		/*When finished, we summon the next method that shows the numbers and its
		position into the array created*/
		arrayShow(nums);
	}

	/**
	 * This method shows the values of the array and its positions
	 * 
	 * @param nums the array of 10 strings inserted
	 */
	private static void arrayShow(String nums[]) {
		// First we create a variable that will be iterating its value with all the
		// numbers in the array
		String v;

		// We iterate showing numbers and its position in the array
		for (int i = 0; i < 10; i++) {
			v = nums[i];
			System.out.println("Position:" + i + "  Value:" + v);
		}
	}
}
