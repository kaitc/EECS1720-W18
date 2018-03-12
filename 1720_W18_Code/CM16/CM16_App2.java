package CM16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CM16_App2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");

		// Group root = new Group();
		StackPane root = new StackPane();
		Scene myScene = new Scene(root, 300, 250);

		primaryStage.setScene(myScene);
		primaryStage.show();

		Button button1 = new Button();
		root.getChildren().add(button1);
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
