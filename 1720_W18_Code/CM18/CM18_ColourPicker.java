package CM18;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CM18_ColourPicker extends Application {
	private int WIDTH = 400;
	private int HEIGHT = 250;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		Scene scene = new Scene(gridPane, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();

		Label datePickerLabel = new Label("Pick a colour:");
		gridPane.add(datePickerLabel, 0, 0);

		ColorPicker colourPicker1 = new ColorPicker();
		gridPane.add(colourPicker1, 0, 1);

		EventHandler<ActionEvent> myHandler = new ColourEventHandler();
		colourPicker1.setOnAction(myHandler);

	}

}
