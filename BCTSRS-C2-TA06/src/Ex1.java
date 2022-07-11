/**
 * @author Roger Rubio Rufaste
 *
 */

import javax.swing.JOptionPane;


/**
 * This class is the first exercise of TA06
 * 
 */
public class Ex1 {

	/**
	 * This main method summons the main menu
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		menu();
	}
	
	/**
	 * This method is the main menu of the application where asks what figure wants the user to calculate the area
	 * then summons the method needed
	 */
	public static void menu() {
		//Ask the figure
		String figure = JOptionPane.showInputDialog("Write the name of the figure you want to know the area "
			+ "(only circle, triangle and square, in english language and without caps). Write 0 if you want to exit.");
		
		//Switch to the figure
		switch (figure) {
			case "0":
				//End of the program
				System.out.println("End of the program.");
				break;
			case "circle":
				circle();	
				break;
			case "triangle":
				triangle();		
				break;
			case "square":
				square();		
				break;
			default:
				JOptionPane.showMessageDialog(null, "Incorrect values", "Value Error", 0);
				break;
		}

	}
	
	/**
	 * This method calculates the area of a circle with the values asked
	 */
	public static void circle() {
		//Ask the circle
		String radius = JOptionPane.showInputDialog("Write the radius of the circle:");
		
		//We cast to change from String to double
		double r = Double.parseDouble(radius);
		
		//Calculates the area
		double a = Math.PI * (Math.pow(r, 2));
		
		//Shows the result
		JOptionPane.showMessageDialog(null, "The area of the circle with the radius given is: "+a);

		//Returns to menu
		menu();
	}
	
	/**
	 * This method calculates the area of a triangle with the values asked
	 */
	public static void triangle() {
		//Ask the triangle values needed
		String number1 = JOptionPane.showInputDialog("Write the base of the triangle:");
		String number2 = JOptionPane.showInputDialog("Write the height of the triangle:");
				
		double b = Double.parseDouble(number1);
		double h = Double.parseDouble(number2);
				
		//Calculates the area
		double a = (b*h)/2;
		
		//Shows the result
		JOptionPane.showMessageDialog(null, "The area of the triangle with the values given is: "+a);
		
		//Returns to menu
		menu();
	}
	
	/**
	 * This method calculates the area of a square with the values asked
	 */
	public static void square() {
		String number1 = JOptionPane.showInputDialog("Write the base of the square:");
		String number2 = JOptionPane.showInputDialog("Write the height of the square:");
						
		double b = Double.parseDouble(number1);
		double h = Double.parseDouble(number2);
						
		double a = (b*h);
				
		JOptionPane.showMessageDialog(null, "The area of the square with the values given is: "+a);
				
		menu();
	}
}
