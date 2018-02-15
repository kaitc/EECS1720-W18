package Lab05Exercises;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * This app launches a basic JavaFX app, which is a blank window that displays a
 * string.
 * 
 * @author mb
 *
 */
public class Exercise01 extends Application {
	private int SCENE_WIDTH = 800;
	private int SCENE_HEIGHT = 600;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		/*
		 * Task 01: Review each of the comments below to familiarize yourself
		 * with the basic setup of a JavaFX app. Refer to the class notes if
		 * desired. Read each of the blocks before moving onto the next tasks.
		 * 
		 */

		/*
		 * This method, the start() method, is the main entry point for all
		 * JavaFX applications.
		 */

		/*
		 * The app has a Window. Stage is a subclass of Window (Stage IS-A
		 * Window, albeit a specialized kind of window). The Stage object is
		 * passed to this method via its parameter.
		 */
		/*
		 * Task 02: mutate the Stage object by changing its title. Use the class
		 * name of this app as the title string.
		 */
		// String theName = this.getClass().toString();
		String theName = this.getClass() + "";
		primaryStage.setTitle(theName);

		/*
		 * In order to display anything, the primary Stage needs a Scene object.
		 * However, all of the constructors for a scene object (there are 6
		 * available) requires that we provide the root of the hierarchy of
		 * components to be drawn. So we construct the hierarchy of components
		 * to be drawn first. We instantiate an default Group, which starts out
		 * empty.
		 */
		Group root = new Group();

		/*
		 * Now that we have the root of the hierarchy of components to be drawn,
		 * we can go ahead an construct an empty scene. Here a decision was made
		 * to use the constructor that accepts parameters for the width and
		 * height of the scene and its background color.
		 */
		/*
		 * Task 03: take a moment to examine the contract for the constructor (a
		 * shortcut is to select the constructor and press F2). Temporarily
		 * provide a null value for root and demonstrate that the constructor
		 * service obeys its own contract. Once you have seen this, revert the
		 * parameter back to its original value.
		 */
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);

		/*
		 * Now we have the Scene, so we specify that it is to be used in the
		 * Stage.
		 */
		primaryStage.setScene(scene);

		/*
		 * Now we signal that this window should be drawn. It is up to the
		 * computer's Window Manager to actually allow the window to be drawn.
		 * This is why the API for the method says
		 * "Attempts to show this Window"
		 */
		primaryStage.show();

		/*
		 * If all goes well, the window should be visible. You, the client of
		 * the window, can mutate the hierarchy of components to be drawn
		 * (either before or after the window has been drawn).
		 */
		/*
		 * Task 04: there is a Utility class provided for your convenience. Use
		 * the factory method to obtain a Rectangle. Add the Rectangle object to
		 * the hierarchy of components to be drawn. Get the list of children of
		 * the root using the getChildren() method. Add the Rectangle object to
		 * the list.
		 */
		Rectangle r = Utility.getRectangle();
		root.getChildren().add(r);
	}

}