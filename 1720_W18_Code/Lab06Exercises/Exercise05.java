package Lab06Exercises;
import java.io.PrintStream;

import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
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
		PrintStream output = System.out;

		/*
		 * Here are the statements required to configure the Window and its
		 * contents.
		 */
		primaryStage.setTitle(this.getClass().toString());
		Group root = new Group();
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();

		/*
		 * Task 01: Open the API for the Utility class. Read the API for the
		 * method getRandomShape(). Declare a shape variable and cause the shape
		 * to display in the Window.
		 */

		/*
		 * Task 02: Translate the (x,y) position of the shape so that it is
		 * centered on the coordinate (0,0)
		 */

		/*
		 * Task 02: Translate the (x,y) position of the shape so that it is
		 * centered in the window. Use setTranslateX and setTranslateY
		 */ 

	}

}