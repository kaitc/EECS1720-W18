package Lab07Exercises;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Bounds;
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
public class Exercise05 extends Application {
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

		/*
		 * Task 02: Construct an javafx.scene.image.Image object using the
		 * constructor that accepts a String URL. For the URL, supply the string
		 * pathname of the first File element of the array.
		 */
		String pathname = theFiles[0].getPath();
		Image myImage = new Image(pathname);

		/*
		 * Task 02: Construct an javafx.scene.image.ImageView using the
		 * constructor that accepts an Image object. Supply the Image object you
		 * just instantiated.
		 */
		ImageView myImageView = new ImageView(myImage);

		/*
		 * Task 03: Add the ImageView object to the root's children.
		 */
		root.getChildren().add(myImageView);

		/*
		 * Task 04: You will see that the Image does not scale properly to the
		 * image size. Determine the width and height of the image encapsulated
		 * by the ImageView object. Use the width and height mutators of the
		 * Stage object to resize this app's window to match the width and
		 * height of the image exactly.
		 */
		Bounds b = myImageView.getLayoutBounds();
		double dogeWidth = b.getWidth();
		double dogeHeight = b.getHeight();
		System.out.println(dogeWidth);
		System.out.println(dogeHeight);
		primaryStage.setWidth(dogeWidth);
		primaryStage.setHeight(dogeHeight);

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