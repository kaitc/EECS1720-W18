package Lab07Exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This app launches a basic JavaFX app which displays some graphics.
 * 
 * @author mb
 *
 */
public class Exercise06 extends Application {
	private int SCENE_WIDTH = 800;
	private int SCENE_HEIGHT = 600;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		/*
		 * Here are the statements required to configure the Window and its
		 * contents.
		 */
		primaryStage.setTitle(this.getClass().toString());
		Group root = new Group();
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();

		/*
		 * Task 01: Cut and paste the helper method from Exercise04 here. Invoke
		 * the method to obtain an array of File objects.
		 */
		String subDirPath = "imageFiles";
		File[] theFiles = getImageFiles(subDirPath);
		String pathname = theFiles[0].getPath();

		/*
		 * Task 02: Construct an javafx.scene.image.ImageView for each file in
		 * the image directory. Use a List to contain all of the images.
		 */
		List<ImageView> myList = new ArrayList<ImageView>();
		for (File f : theFiles) {
			Image img = new Image(f.getPath());
			ImageView myImage = new ImageView(img);
			myList.add(myImage);
		}

		/*
		 * Task 03: Add the List of ImageView objects to the root's children.
		 * Use the method addAll(Collection<E>)
		 */
		root.getChildren().addAll(myList);

		/*
		 * Task 04: Determine the number of images. Resize the width of each
		 * image to get an equal portion of the screen width. Use
		 * setPreserveRatio() to ensure the width_height ratio is preserved.The
		 * heights will vary. Position the images so that they appear in a
		 * single row.
		 */
		int numFile = theFiles.length;
		double horizAllocation = SCENE_WIDTH / numFile;

	}

	public static File[] getImageFiles(String thePath) {
		File[] theFiles = null;

		File myFile;
		myFile = new File(thePath);
		boolean doesExist = myFile.exists();
		// output.println(doesExist);
		boolean isDirectory = myFile.isDirectory();
		// output.println(isDirectory);

		if (doesExist && isDirectory) {
			theFiles = myFile.listFiles();
		}

		return theFiles;
	}
}