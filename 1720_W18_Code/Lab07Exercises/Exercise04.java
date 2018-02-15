package Lab07Exercises;
import java.io.File;
import java.io.PrintStream;

/**
 * This app launches a basic app which prints some text to the console.
 * 
 * @author mb
 *
 */
public class Exercise04 {
	static PrintStream output = System.out;

	public static void main(String[] args) {

		/*
		 * Task 01: Modify the helper method so that it returns the array of
		 * File objects, provided the passes string is a subdirectory
		 * 
		 * Invoke the method to obtain the array of File objects, then iterate
		 * over them and for each one, print the name and size of each file.
		 */

		String subDirPath = "";
		File[] theFiles = getImageFiles(subDirPath);
		for (File f : theFiles) {
			output.println(f.getPath() + "\tsize: " + f.length());
		}

	}

	public static File[] getImageFiles(String thePath) {
		File[] theFiles = null;

		// put your code in here
		
		return theFiles;

	}

}