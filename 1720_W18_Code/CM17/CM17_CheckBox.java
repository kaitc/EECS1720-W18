package CM17;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Separator;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CM17_CheckBox extends Application {
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

		CheckBox cb1 = new CheckBox();
		cb1.setText("First");
		cb1.setSelected(true);
		
		CheckBox cb2 = new CheckBox("Second");


		gridPane.add(cb1, 0, 0);
		gridPane.add(cb2, 0, 1);

	}

}
