package CM17;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Separator;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CM17_ChoiceBox extends Application {
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

		ObservableList<Object> choiceList = FXCollections.observableArrayList("First", new Separator(), "Second",
				"Third");
		ChoiceBox<Object> cb = new ChoiceBox<Object>(choiceList);
		cb.setTooltip(new Tooltip("Choose your preference"));

		gridPane.add(cb, 0, 0);

	}

}
