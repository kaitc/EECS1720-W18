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
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CM17_RadioButton extends Application {
	private int WIDTH = 400;
	private int HEIGHT = 400;

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

		// A radio button with an empty string for its label
		RadioButton rb1 = new RadioButton();
		// Setting a text label
		rb1.setText("Option 1");

		// A radio button with the specified label
		RadioButton rb2 = new RadioButton("Option 2");

		// A radio button with the specified label and an icon
		RadioButton rb3 = new RadioButton("Option 3");
		Image image = new Image(getClass().getResourceAsStream("icon.jpg"));
		ImageView imgNode = new ImageView(image);
		imgNode.setPreserveRatio(true);
		imgNode.setFitWidth(50);
		rb3.setGraphic(imgNode);

		rb1.setSelected(true);
		rb2.setSelected(true);
		rb3.setSelected(true);

		ToggleGroup group = new ToggleGroup();

		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);

		gridPane.add(rb1, 0, 0);
		gridPane.add(rb2, 0, 1);
		gridPane.add(rb3, 0, 2);

	}

}
