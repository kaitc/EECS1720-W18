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
public class Exercise02 {

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
		 * Task 02: Develop a boolean test to determine whether the shape is
		 * centered on the coordinate position (0,0) or not. For instance,
		 * Circle is centered on (0,0) but Rectangle is not.
		 * 
		 * Your test should only make use of information in the Bounds object.
		 * Do not query the Shape object to determine whether it is a Circle or
		 * a Rectangle
		 */

		boolean isCenteredX;
		boolean isCenteredY;
		Bounds b = s.getLayoutBounds();
		output.println(b.toString());
		isCenteredX = b.getMinX() == -b.getWidth() / 2;
		isCenteredY = b.getMinY() == -b.getHeight() / 2;
		boolean isCentered = isCenteredX && isCenteredY;
		output.println(isCentered);

		/*
		 * Task 03: For shapes that are not centered, determine the corrective x
		 * translation that is needed to center it on the coordinate (0,0)
		 * 
		 * Your derivation should only make use of information in the Bounds
		 * object. Do not query the Shape object to determine whether it is a
		 * Circle or a Rectangle
		 */

		double correctXPosition = -b.getWidth() / 2;
		double correctYPosition = -b.getHeight() / 2;

		/*
		 * Task 04: Apply the corrective translation to the shape using
		 * setTranslateX() and setTranslateY()
		 * 
		 * Your derivation should only make use of information in the Bounds
		 * object. Do not query the Shape object to determine whether it is a
		 * Circle or a Rectangle
		 */
		
		s.setTranslateX(correctXPosition);
		s.setTranslateX(correctYPosition);
		output.println(b.toString());


	}
}
