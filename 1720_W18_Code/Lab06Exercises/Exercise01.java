package Lab06Exercises;

import javafx.geometry.Bounds;
import javafx.scene.shape.Shape;

import java.io.PrintStream;

/**
 * This app prints some strings to the console.
 * 
 * @author mb
 *
 */
public class Exercise01 {

	public static void main(String[] args) {

		PrintStream output = System.out;

		/*
		 * Task 01: Open the API for the Utility class. Read the API for the
		 * method getRandomShape(). Declare a shape variable and invoke the
		 * method and assign the return to your variable. Print the object's
		 * String representation to the console.
		 */
		Shape s = Utility.getRandomShape();
		output.println(s.toString());

		/*
		 * Task 02: Invoke the app several times. Convince yourself that the
		 * method is indeed returning a randomly-chosen Circle or Rectangle.
		 */

		/*
		 * Task 03: Recall that the anchor point of a Circle is its centre and
		 * that the anchor point of a Rectangle is its upper left corner.
		 * 
		 * Invoke the method getLayoutBounds() on the Shape. It returns an
		 * object of type javafx.geometry.Bounds.
		 * 
		 * Store the return and print the object's String representation to the
		 * console.
		 * 
		 * Notice that minX is different for Circle than for Rectangle. Use the
		 * appropriate accessor of a Bounds object to print out only the minX
		 * value of the Shape's layout bounds.
		 */

		Bounds b = s.getLayoutBounds();
		output.println(b.toString());
		
	}
}
