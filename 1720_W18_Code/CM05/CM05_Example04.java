package CM05;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class CM05_Example04 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		/**
		 * The start() method is the main entry point for all JavaFX
		 * applications.
		 * 
		 * A JavaFX application defines the user interface container by means of
		 * a stage and a scene.
		 * 
		 * The JavaFX Stage class is the top-level JavaFX container (it
		 * corresponds to the window that appears when this app is run).
		 * 
		 * The Stage holds the Scene. The JavaFX Scene class is another
		 * container. The Scene holds the contents of the GUI in a hierarchy of
		 * nodes.
		 * 
		 * Here we have the stage object by virtue of the parameter passed to
		 * this method.
		 * 
		 * We will take the stage object and perform a few operations upon it
		 */
		primaryStage.setTitle(this.getClass().getName());
		assignCloseOperation(primaryStage);
		primaryStage.setOnCloseRequest(e -> Platform.exit());

		/**
		 * The JavaFX Scene class is the container for all content. It will
		 * holds the contents of the GUI in a hierarchy of nodes.
		 * 
		 * We build this hierarchy content by starting with the root. So far the
		 * hierarchy of content is empty.
		 */
		Group root = new Group();
		/**
		 * Now we have the hierarchy of content. We can construct our scene
		 * object now. It doesn't matter that the hierarchy of content is empty,
		 * because we can add to it later. We also pass the the scene
		 * constructor the desired width and height of the scene and the scene's
		 * background colour.
		 */
		final int WINDOW_WIDTH = 800;
		final int WINDOW_HEIGHT = 600;
		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.BLACK);

		/**
		 * Here we create and configure a graphical element.
		 */
		Circle myCircle = new Circle();

		/**
		 * Here we add the graphical element to the root of the hierarchy of
		 * content
		 */
		root.getChildren().add(myCircle);

		/**
		 * Here we specify that the scene should be shown on the window. The
		 * size of the stage will readjust to fit the specified size of the
		 * scene.
		 */
		primaryStage.setScene(scene);

		/**
		 * Here is the command that attempts to show the window. The window
		 * manager ultimately has control over which of its windows are shown.
		 */
		primaryStage.show();

		/**
		 * Here we show that we can mutate the state of the Shape, even after it
		 * is displayed
		 */
		double myRadius = 150;
		myCircle.setRadius(myRadius);
		Color fillColour = new Color(1, 0, 0, 1);
		myCircle.setFill(fillColour);
		Color strokeColour = new Color(0, 1, 0, 1);
		myCircle.setStroke(strokeColour);
		double strokeWidth = 100000;
		myCircle.setStrokeWidth(strokeWidth);
		StrokeType strokeType = StrokeType.OUTSIDE;
		myCircle.setStrokeType(strokeType);

		double startXCoordinate = WINDOW_WIDTH / 2;
		double startYCoordinate = WINDOW_HEIGHT / 2;
		System.out.println("Start coordinate: " + startXCoordinate + "\t" + startYCoordinate);
		myCircle.setCenterX(startXCoordinate);
		myCircle.setCenterY(startYCoordinate);

	}

	/**
	 * Sets up the behaviour such that if this app's graphical window is closed,
	 * then this app terminates. This is the desired behaviour. Without this
	 * specification, the app's behavious otherwise is undesireable (namely. if
	 * this app's graphical window is closed, then this app's thread continues.
	 * 
	 * @param primaryStage
	 */
	private void assignCloseOperation(Stage primaryStage) {
		// note to students: you do not need to understand how this code segment
		// works; you can just assume that it is needed.
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			public void handle(final WindowEvent e) {
				Platform.setImplicitExit(true);
				Platform.exit();
			}
		});
	}

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void stop() {
		System.out.println("Stop");
		Platform.exit();

	}

}
