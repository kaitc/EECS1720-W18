package CM13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class File_Example03 {
	public static void main(String[] args) throws IOException {
		PrintStream output = System.out;

		/*
		 * the pathname of the file I want to create a write to is:
		 * 
		 * "test.txt" and I want to put it in the working directory
		 * 
		 * If the file exists, then clobber it
		 */

		String myPathName = "test.txt";
		File myFile = new File(myPathName);
		FileWriter fw = new FileWriter(myFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		bufferedWriter.write("Here is a string");
		bufferedWriter.flush();
		bufferedWriter.close();

		output.close();

	}
}
