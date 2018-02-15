package Lab05Exercises;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This app launches a basic JavaFX app which displays some Shapes.
 * 
 * @author mb
 *
 */
public class Exercise05 extends Application {
	private int SCENE_WIDTH = 800;
	private int SCENE_HEIGHT = 600;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("title");
		Group root = new Group();
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();

		/*
		 * Task 01: Declare a List of Shape objects. Instantiate an ArrayList.
		 */

		/*
		 * Task 02: Set up a for loop in order to add 10 circles and 10
		 * rectangles to the list. You can use the factory methods in Utility.
		 */

		/*
		 * Task 03: You now want to add all of the Shapes in the List to the
		 * hierarchy of window components. Do not add them one by one. Instead,
		 * locate a method that can add all of the elements of the list to the
		 * hierarchy of window components all at once.
		 */

		/*
		 * Task 04: Now iterate over the list of Shapes. For all of the circles,
		 * assign them a random location along the horizontal center line of the
		 * window. For all of the rectangles, assign them a random location
		 * along the vertical center line of the window.
		 */

		/*
		 * Task 05: Add a tweak above to ensure that all Shapes appear
		 * completely within the window.
		 */

	}

}