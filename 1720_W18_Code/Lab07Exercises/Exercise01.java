package Lab07Exercises;

import java.io.File;
import java.io.PrintStream;

/**
 * This app launches a basic app which prints some text to the console.
 * 
 * @author mb
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		/*
		 * Task 01: The working directory is the parent of the directory that
		 * contains the package's classes. Construct a string is the pathname to
		 * the subdirectory of the working directory that contains the image
		 * files
		 */
		String subDirPath = "imageFiles";

		/*
		 * Task 02: construct a File object for this pathname. Query the file
		 * object to determine whether the path exists. Query the file object to
		 * determine whether the path corresponds to a directory.
		 */
		File myFile;
		myFile = new File(subDirPath);
		boolean doesExist = myFile.exists();
		output.println(doesExist);
		boolean isDirectory = myFile.isDirectory();
		output.println(isDirectory);
		/*
		 * Task 03: now use the method listFiles() to obtain an array of the
		 * files within this directory. Iterate over the array and, for each
		 * file, print out its path and its size.
		 * 
		 * Add a condition to do these steps only if the pathname is a
		 * subdirectory that exists on the file system.
		 */

		if (doesExist && isDirectory) {
			File[] theFiles = myFile.listFiles();
			for (File file : theFiles) {
				output.println(file.getPath() + "\t" + file.length());
			}
		}
	}
}