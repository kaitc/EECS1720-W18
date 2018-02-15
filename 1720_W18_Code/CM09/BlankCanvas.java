package CM09;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class BlankCanvas extends Application {
	private Group sceneRoot;
	private int sceneWidth = 800;
	private int sceneHeight = 600;

	public static void main(String... args) {
		launch(args);
	}

	public void add(Shape s) {
		sceneRoot.getChildren().add(s);
	}

	public int getWidth() {
		return sceneWidth;
	}

	public int getHeight() {
		return sceneHeight;
	}

	@Override
	public void start(Stage primaryStage) {
		/*
		 * The start() method is the main entry point for all JavaFX
		 * applications.
		 */

		/*
		 * The user interface container will be defined by means of a stage and
		 * a scene. The stage is passed to this method via the parameter.
		 */

		/*
		 * Here we set up an empty scene
		 */
		sceneRoot = new Group(); // here is the root of the hierarchy of
		// components to be drawn, currently
		// empty

		Scene scene = new Scene(sceneRoot, sceneWidth, sceneHeight, Color.BLACK);

		/*
		 * Here we set the scene
		 */
		primaryStage.setScene(scene);

		primaryStage.show();
	}

}