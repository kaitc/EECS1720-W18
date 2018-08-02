package Lab10Exercises;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This app presents the user with a GUI. The GUI presents a choice box with all
 * of the installed font names. Below the choice box, the GUI provides an
 * example text. When the user selects a font name, the font of the example text
 * will be updated to be the selected font.
 * 
 * @author <to be completed>
 *
 */
public class Lab10Exercise05 extends Application {
	private int WIDTH = 400;
	private int HEIGHT = 250;

	Text theText;
	double theFontSize = Font.getDefault().getSize();
	String theFontName = Font.getDefault().getName();

	ChoiceBox<String> choiceBox1;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		Scene scene = new Scene(gridPane, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();

		List<String> allFamilies = Font.getFontNames();

		ObservableList<String> choiceList1 = FXCollections.observableArrayList();
		choiceList1.addAll(allFamilies);
		choiceBox1 = new ChoiceBox<String>(choiceList1);

		EventHandler<ActionEvent> myHandler = new Exercise05EventHandler();
		choiceBox1.setOnAction(myHandler);

		theText = new Text("The quick brown fox jumps over the lazy dog.");
		// an English sentence that contains all of the letters of the alphabet.
		theText.setFont(Font.font(theFontName, theFontSize));

		gridPane.add(choiceBox1, 0, 0);
		GridPane.setHalignment(choiceBox1, HPos.CENTER);

	}

	class Exercise05EventHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			if (event.getSource().equals(choiceBox1)) {
				@SuppressWarnings("unchecked") // put this here to deal with
												// parameterized type
				ChoiceBox<String> choiceBox1 = (ChoiceBox<String>) event.getSource();
				String theSelectedFontName = choiceBox1.getValue();
				System.out.println(theSelectedFontName);
				theText.setFont(Font.font(theFontName, theFontSize));
			}
		}
	}

}
