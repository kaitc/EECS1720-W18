package CM16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CM16_App02 extends Application {
	private int WIDTH = 400;
	private int HEIGHT = 250;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Scene scene = new Scene(grid, WIDTH, HEIGHT);

		primaryStage.setScene(scene);
		primaryStage.show();

		
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);


		Label familyName = new Label("Family Name(s):");
		grid.add(familyName, 0, 2);

		TextField familyNameField = new TextField();
		grid.add(familyNameField, 1, 2);

		Label firstName = new Label("First Name(s):");
		grid.add(firstName, 0, 1);

		TextField firstNameField = new TextField();
		grid.add(firstNameField, 1, 1);



	}

}
