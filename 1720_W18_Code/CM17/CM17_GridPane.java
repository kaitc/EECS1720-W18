package CM17;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CM17_GridPane extends Application {
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

		// here we create two widgets and add them to the pane

		Text words1 = new Text("The quick brown fox jumps over the lazy dog.");
		words1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(words1, 0, 0);

		Label words2 = new Label("The quick brown fox jumps over the lazy dog.");
		words2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		words2.setTextFill(Color.RED);
		words2.setWrapText(true);
		grid.add(words2, 0, 1);
	}

}
