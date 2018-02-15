package Lab06Exercises;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.io.PrintStream;

/**
 * This app prints some strings to the console.
 * 
 * @author mb
 *
 */
public class Exercise03 {

	public static void main(String[] args) {

		PrintStream output = System.out;

		/*
		 * Task 01: Set up a for loop to repeatedly choose a random Shape. For
		 * each random choice, print out the object's String representation to
		 * the console. Try 10 iterations and then 100 iterations.
		 */
		int MAX_IT = 100;
		for (int i = 0; i < MAX_IT; i++) {
			Shape s = Utility.getRandomShape();
			// output.println(s.toString());
			boolean isCircle = s instanceof Circle;
			boolean isRectangle = s instanceof Rectangle;
			if (isRectangle) {
				output.println(s.toString());
			}
		}

		/*
		 * Task 02: Within the body of the loop, create a boolean expression to
		 * determine whether the Shape object is a Circle object. Create another
		 * boolean expression to determine whether the Shape object is a
		 * Rectangle object. (yes, it is true that you can infer that it is the
		 * negation of the first, but use 'instanceof')
		 * 
		 * Use the boolean value to print out the Shape information only
		 * conditionally. For instance, print out only the Circle objects but
		 * not the Rectangles. Then switch the condition to print out only the
		 * Rectangle objects but not the Circle objects.
		 */

	}
}
