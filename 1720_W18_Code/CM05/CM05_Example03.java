package CM05;

import java.io.PrintStream;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class CM05_Example03 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		PrintStream output = System.out;

		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		double dpi = Screen.getPrimary().getDpi();
		output.println(primaryScreenBounds.toString());
		output.println("Dots per inch: " + dpi);

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void stop() {
		Platform.exit();
	}

}
