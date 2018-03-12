package CM17;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CM17_MultipleImages extends Application {
	private int WIDTH = 200;
	private int HEIGHT = 200;

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

		InputStream fileInputStream = getClass().getResourceAsStream("icon.jpg");
		Image image = new Image(fileInputStream);
		ImageView imgNode1 = new ImageView(image);
		imgNode1.setPreserveRatio(true);
		imgNode1.setFitWidth(50);

		ImageView imgNode2 = new ImageView(new Image(getClass().getResourceAsStream("icon2.jpg")));
		ImageView imgNode3 = new ImageView(new Image(getClass().getResourceAsStream("icon3.jpg")));
		ImageView imgNode4 = new ImageView(new Image(getClass().getResourceAsStream("icon4.jpg")));

		//grid.add(imgNode1, 0, 0);
		Label theLabel = new Label("The quick brown fox jumps over the lazy dog.");
		theLabel.setWrapText(true);
		grid.add(theLabel, 0, 0);

		grid.add(imgNode2, 0, 1);
		grid.add(imgNode3, 1, 0);
		grid.add(imgNode4, 1, 1);
	}

}
