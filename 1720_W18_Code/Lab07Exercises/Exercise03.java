package Lab07Exercises;

import java.io.File;
import java.io.PrintStream;

/**
 * This app launches a basic app which prints some text to the console.
 * 
 * @author mb
 *
 */
public class Exercise03 {
	static PrintStream output = System.out;

	public static void main(String[] args) {

		/*
		 * Task 01: Modify the helper method so that it accepts as a parameter
		 * the string that is the subdirectory containing the image files.
		 * 
		 * Invoke the method.
		 */

		String subDirPath = "imageFiles";
		getImageFiles(subDirPath);

	}

	public static void getImageFiles(String thePath) {
		File myFile;
		myFile = new File(thePath);
		boolean doesExist = myFile.exists();
		// output.println(doesExist);
		boolean isDirectory = myFile.isDirectory();
		// output.println(isDirectory);

		if (doesExist && isDirectory) {
			File[] theFiles = myFile.listFiles();
			for (File file : theFiles) {
				output.println(file.getPath() + "\t" + file.length());
			}
		}
	}

}