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
public class Exercise06 extends Application {
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
		 * Task 01: Obtain a circle and a rectangle using the Utility class. Do
		 * not add them to the containment hierarchy (root)
		 */

		/*
		 * Task 02: Center each shape in the window
		 */

		/*
		 * Task 02: Translate the (x,y) position of the shape so that it is
		 * centered in the window. Use
		 */
	}

}