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

public class CM17_StackPane extends Application {
	private int WIDTH = 450;
	private int HEIGHT = 250;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// primaryStage.setTitle("Hello World!");

		StackPane root = new StackPane();
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();

		// here we create two widgets and add them to the pane

		Text words1 = new Text("The quick brown fox jumps over the lazy dog.");
		words1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		root.getChildren().add(words1);

		Label words2 = new Label("The quick brown fox jumps over the lazy dog.");
		words2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		words2.setTextFill(Color.RED);
		//words2.setWrapText(true);
		root.getChildren().add(words2);
	}

}
