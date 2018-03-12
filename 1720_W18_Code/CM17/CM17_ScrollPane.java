package CM17;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CM17_ScrollPane extends Application {
	private int WIDTH = 300;
	private int HEIGHT = 300;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		StackPane pane = new StackPane();
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();

		ScrollPane sp = new ScrollPane();
		pane.getChildren().add(sp);

		// here we create another Pane
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		InputStream fileInputStream = getClass().getResourceAsStream("icon.jpg");
		Image image = new Image(fileInputStream);
		ImageView imgNode1 = new ImageView(image);

		ImageView imgNode2 = new ImageView(new Image(getClass().getResourceAsStream("icon2.jpg")));
		ImageView imgNode3 = new ImageView(new Image(getClass().getResourceAsStream("icon2.jpg")));
		ImageView imgNode4 = new ImageView(new Image(getClass().getResourceAsStream("icon2.jpg")));

		grid.add(imgNode1, 0, 0);
		grid.add(imgNode2, 0, 1);
		grid.add(imgNode3, 1, 0);
		grid.add(imgNode4, 1, 1);

		sp.setContent(grid);
		//sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		// sp.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
		 sp.setHbarPolicy(ScrollBarPolicy.ALWAYS);

	}

}
