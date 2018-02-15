package Lab05Exercises;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * This app launches a basic JavaFX app which displays some Shapes.
 * 
 * @author mb
 *
 */
public class Exercise04 extends Application {
	private int SCENE_WIDTH = 600;
	private int SCENE_HEIGHT = 400;

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
		 * Task 01: Display three circles in the window.
		 */
		Circle c = Utility.getCircle();
		root.getChildren().add(c);
		Circle c2 = Utility.getCircle();
		root.getChildren().add(c2);
		Circle c3 = Utility.getCircle();
		root.getChildren().add(c3);

		/*
		 * Task 02: Mutate the position of each circle so its center position is
		 * randomly chosen from among the visible coordinates. Hint: look up the
		 * API of Math.random()
		 */
		double randX = Math.random() * SCENE_WIDTH;
		double randY = Math.random() * SCENE_HEIGHT;

		c.setCenterX(Math.random() * SCENE_WIDTH);
		c.setCenterY(Math.random() * SCENE_HEIGHT);
		c2.setCenterX(Math.random() * SCENE_WIDTH);
		c2.setCenterY(Math.random() * SCENE_HEIGHT);
		c3.setCenterX(Math.random() * SCENE_WIDTH);
		c3.setCenterY(Math.random() * SCENE_HEIGHT);

	}

}