package Lab05Exercises;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * This app launches a basic JavaFX app which displays some Shapes.
 * 
 * @author mb
 *
 */
public class Exercise03 extends Application {
	private int SCENE_WIDTH = 600;
	private int SCENE_HEIGHT = 400;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		/*
		 * Task 01: Review the statements below. Reassure yourself that this is
		 * the same set-up as used in Exercise01.
		 */
		primaryStage.setTitle(this.getClass().toString());
		Group root = new Group();
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();

		/*
		 * Task 02: Display a circle and a rectangle in the window.
		 */
		Rectangle r = Utility.getRectangle();
		root.getChildren().add(r);
		Circle c = Utility.getCircle();
		root.getChildren().add(c);

		/*
		 * Task 03: Mutate the position of the circle so that it is shown in the
		 * middle of the window.
		 */

		int xCoord = SCENE_WIDTH / 2;
		int yCoord = SCENE_HEIGHT / 2;
		c.setCenterX(xCoord);
		c.setCenterY(yCoord);

		/*
		 * Task 04: Mutate the position of the rectangle so that it is shown in
		 * the middle of the window.
		 */
		double horizOffset = r.getWidth() / 2;
		double vertOffset = r.getHeight() / 2;
		r.setX(xCoord - horizOffset);
		r.setY(yCoord - vertOffset);

	}

}