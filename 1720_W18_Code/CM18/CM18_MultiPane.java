package CM18;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CM18_MultiPane extends Application {
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

		// now we will create three additional panes

		GridPane gridPaneSub1 = new GridPane();

		// on the first sub pane, let's add 3 images
		ImageView imgNode1 = new ImageView(new Image(getClass().getResourceAsStream("iso_icon/3d_file.png")));
		ImageView imgNode2 = new ImageView(new Image(getClass().getResourceAsStream("iso_icon/3d_folder_open.png")));
		ImageView imgNode3 = new ImageView(new Image(getClass().getResourceAsStream("iso_icon/3d_group.png")));
		gridPaneSub1.add(imgNode1, 0, 0);
		gridPaneSub1.add(imgNode2, 1, 0);
		gridPaneSub1.add(imgNode3, 2, 0);

		gridPaneSub1.setPrefWidth(WIDTH / 3);

		GridPane gridPaneSub2 = new GridPane();
		Button button1 = new Button("Button1");
		Button button2 = new Button("Button2");
		Button button3 = new Button("Button3");
		gridPaneSub2.add(button1, 0, 0);
		gridPaneSub2.add(button2, 0, 1);
		gridPaneSub2.add(button3, 0, 2);
		gridPaneSub2.setPrefWidth(WIDTH / 3);

		StackPane gridPaneSub3 = new StackPane();
		Text words = new Text();
		words.setText("Here is a very long text description that has been written so that it can be shown here");
		words.setWrappingWidth(WIDTH / 3);
		gridPaneSub3.getChildren().add(words);

		gridPane.add(gridPaneSub1, 0, 0);
		gridPane.add(gridPaneSub2, 1, 0);
		gridPane.add(gridPaneSub3, 2, 0);

	}

}
