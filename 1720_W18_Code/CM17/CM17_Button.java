package CM17;

import java.io.InputStream;

import CM16.MyEventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CM17_Button extends Application {
	private int WIDTH = 400;
	private int HEIGHT = 250;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// primaryStage.setTitle("Hello World!");

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(grid, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();

		Button theButton = new Button("");
		theButton.setText("The quick brown fox jumps over the lazy dog.");
		grid.add(theButton, 0, 0);

		theButton.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		theButton.setTextFill(Color.PURPLE);
		theButton.setWrapText(true);
		theButton.setRotate(90);

		InputStream fileInputStream = getClass().getResourceAsStream("icon.jpg");
		Image image = new Image(fileInputStream);
		ImageView imgNode = new ImageView(image);
		imgNode.setPreserveRatio(true);
		imgNode.setFitWidth(50);
		theButton.setGraphic(imgNode);
		
		EventHandler<ActionEvent> myHandler = new MyEventHandler();
		theButton.setOnAction(myHandler);
	}

}
