package CM18;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CM18_DatePicker01 extends Application {
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

		Label datePickerLabel = new Label("Pick a date:");
		gridPane.add(datePickerLabel, 0, 0);

		DatePicker datePicker = new DatePicker();
		gridPane.add(datePicker, 0, 1);

		//datePicker.setValue(null);
		//LocalDate myDate = LocalDate.now();
		LocalDate myDate = LocalDate.of(2099, 12, 05);
		datePicker.setValue(myDate);

	}

}
