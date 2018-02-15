package CM10;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.shape.Shape;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Example03 {

	public static void main(String[] args) {

		Shape s = Utility.getRandomShape();
		try {
			Rectangle s2 = (Rectangle) s;

		} catch (ClassCastException e) {
			System.out.println("could not cast!");
		}

		// boolean cond = s instanceof Rectangle;
		// if (cond) {
		// Rectangle s2 = (Rectangle) s;
		// System.out.println("something happened!");
		// }
		System.out.println(s);
	}
}
