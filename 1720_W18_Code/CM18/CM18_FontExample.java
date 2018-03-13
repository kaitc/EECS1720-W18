package CM18;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CM18_FontExample extends Application {
	private int WIDTH = 700;
	private int HEIGHT = 300;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		// here we create the 'master' pane
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER_LEFT);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(gridPane, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();

		Text words = new Text();
		words.setText("Here is a very long text description that has been written so that it can be shown here");
		// when specifying the font family, you can use any string that is
		// contained in the list that Font.getFamilies() returns
		words.setFont(Font.font("Zapfino", FontWeight.NORMAL, 16));

		words.setWrappingWidth(WIDTH / 3);

		gridPane.add(words, 0, 0);

	}

}
