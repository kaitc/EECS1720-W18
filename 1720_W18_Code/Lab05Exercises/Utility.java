package Lab05Exercises;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

/**
 * Provides factory methods for javafx.scene.shape.Circle and
 * javafx.scene.shape.Rectangle objects.
 * 
 * @author mb
 *
 */
public class Utility {

	private Utility() {
	}

	/**
	 * Factory method for javafx.scene.shape.Circle
	 * 
	 * @return a javafx.scene.shape.Circle object with center coordinates at
	 *         default position (0,0), radius 75px, filled in white and outlined
	 *         in red
	 */
	public static Circle getCircle() {
		Circle circle = new Circle();
		circle.setRadius(75); // 150 px
		circle.setFill(Color.WHITE);
		circle.setStrokeType(StrokeType.INSIDE);
		circle.setStroke(Color.RED);
		circle.setStrokeWidth(4);
		return circle;
	}

	/**
	 * Factory method for javafx.scene.shape.Rectangle
	 * 
	 * @return a javafx.scene.shape.Rectangle object with upper left corner in
	 *         default position (0,0), width and height 150px, filled in white
	 *         and outlined in red. The corners are rounded.
	 */
	public static Rectangle getRectangle() {
		Rectangle rect = new Rectangle();
		rect.setWidth(150); // 150 px
		rect.setHeight(150); // 150 px
		rect.setFill(Color.WHITE);
		rect.setStrokeType(StrokeType.INSIDE);
		rect.setStroke(Color.RED);
		rect.setStrokeWidth(4);
		rect.setArcWidth(40);
		rect.setArcHeight(40);
		return rect;
	}

}