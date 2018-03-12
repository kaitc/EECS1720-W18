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

public class CM17_Label extends Application {
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

		Label theLabel = new Label("The quick brown fox jumps over the lazy dog.");
		grid.add(theLabel, 0, 0);

		theLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
		theLabel.setTextFill(Color.PURPLE);
		theLabel.setWrapText(false);
		theLabel.setRotate(0);

		InputStream fileInputStream = this.getClass().getResourceAsStream("icon.jpg");
		Image image = new Image(fileInputStream);
		ImageView imgNode = new ImageView(image);
		final int ICON_WIDTH = 50;
		imgNode.setPreserveRatio(true);
		imgNode.setFitWidth(ICON_WIDTH);
		theLabel.setGraphic(imgNode);


	}

}
