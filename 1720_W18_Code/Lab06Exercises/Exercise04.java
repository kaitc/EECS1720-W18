package Lab06Exercises;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This app prints some strings to the console.
 * 
 * @author mb
 *
 */
public class Exercise04 {

	public static void main(String[] args) {

		PrintStream output = System.out;

		/*
		 * Task 01: Set up a for loop to repeatedly choose 1000 random Shapes.
		 * Store all of the Shapes in a List collection.
		 * 
		 */
		List<Shape> myList = new ArrayList<Shape>();

		int MAX_IT = 1000;
		for (int i = 0; i < MAX_IT; i++) {
			Shape s = Utility.getRandomShape();
			// output.println(s.toString());
			myList.add(s);

		}

		/*
		 * Task 02: Now iterate over the collection using an enhanced for loop.
		 * For each element, print it to the console (with a line break).
		 */

		for (Shape s : myList) {
			output.println(s.toString());
		}

		/*
		 * Task 03: Now iterate over the collection using an enhanced for loop.
		 * 
		 * Keep tally of the number of Circles and the number of Rectangles.
		 * Print out the tally upon completion. Validate that the sum of the
		 * Circle and Rectangle tallys is 1000.
		 */

	}
}
