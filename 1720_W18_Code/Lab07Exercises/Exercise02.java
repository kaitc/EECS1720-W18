package Lab07Exercises;

import java.io.File;
import java.io.PrintStream;

/**
 * This app launches a basic app which prints some text to the console.
 * 
 * @author mb
 *
 */
public class Exercise02 {
	static PrintStream output = System.out;

	public static void main(String[] args) {

		/*
		 * Task 01: now take all of the functionality from the previous Exercise
		 * and create a helper method called getImageFiles() that visits the
		 * same subdirectory and prints the path and size of each of the files
		 * in the subdirectory. The empty stub is provided below.
		 * 
		 * Invoke the method.
		 */

		getImageFiles();

	}

	public static void getImageFiles() {
		String subDirPath = "imageFiles";
		File myFile;
		myFile = new File(subDirPath);
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