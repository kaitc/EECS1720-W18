package CM16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloWorld3 extends Application {
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

		Scene scene = new Scene(grid, 300, 275);

		primaryStage.setScene(scene);
		primaryStage.show();

		Button button1 = new Button();
		grid.getChildren().add(button1);
		button1.setText("Say 'Hello World'");

		EventHandler<ActionEvent> myHandler = new MyEventHandler();
		button1.setOnAction(myHandler);

	}

//	class MyEventHandler implements EventHandler<ActionEvent> {
//
//		@Override
//		public void handle(ActionEvent event) {
//			System.out.println("Hello World!");
//		}
//
//	}

}
