package CM05;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class CM05_Example02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int WINDOW_WIDTH = 800;
		final int WINDOW_HEIGHT = 600;

		Circle myCircle = new Circle();
		double myRadius = 150;
		myCircle.setRadius(myRadius);
		Color fillColour = new Color(1, 0, 0, 1);
		myCircle.setFill(fillColour);
		Color strokeColour = new Color(0, 1, 0, 1);
		myCircle.setStroke(strokeColour);
		double strokeWidth = 4;
		myCircle.setStrokeWidth(strokeWidth);
		StrokeType strokeType = StrokeType.OUTSIDE;
		myCircle.setStrokeType(strokeType);

		double startXCoordinate = WINDOW_WIDTH / 2;
		double startYCoordinate = WINDOW_HEIGHT / 2;
		System.out.println("Start coordinate: " + startXCoordinate + "\t" + startYCoordinate);
		myCircle.setCenterX(startXCoordinate);
		myCircle.setCenterY(startYCoordinate);

		stop();
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void stop() {
		Platform.exit();
	}

}
