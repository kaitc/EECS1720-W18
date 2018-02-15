package Lab05Exercises;
import java.io.PrintStream;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * This app prints some strings to the console.
 * 
 * @author mb
 *
 */
public class Exercise02 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		/*
		 * Task 01: there is a Utility class provided for your convenience. Use
		 * the factory methods to obtain a Rectangle and a Circle. Invoke the
		 * toString() method on each of them. Examine the APIs of each class to
		 * identify whether the toString() method from each class is inherited
		 * or overridden.
		 */
		Rectangle r = Utility.getRectangle();
		Circle c = Utility.getCircle();

		output.println(r.toString());
		output.println(c.toString());

	}
}
