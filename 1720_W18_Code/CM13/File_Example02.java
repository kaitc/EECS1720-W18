package CM13;

import java.io.File;
import java.io.PrintStream;
import java.util.Date;

public class File_Example02 {
	public static void main(String[] args) {
		PrintStream output = System.out;

		/*
		 * the pathname of the file on my file system is:
		 * 
		 * "/Users/mb/images/treefrog.jpg"
		 */

		String prefix = File.separator + "Users" + File.separator + "mb" + File.separator + "images" + File.separator;

		String myPathName = prefix + "treefrog.jpg";

		// note the use of string concatenation to construct the path name

		// we could have done the following:
		// String myPathName = "/Users/mb/000_images_1710/treefrog.jpg";
		// but this is not a good practise!! the pathname is not OS independent

		File myFile = new File(myPathName);
		File parentDirectory = new File(prefix);

		/*
		 * now we can find out various pieces of information by querying the
		 * file object
		 */

		/*
		 * just because we created a File object doesn't mean that the file with
		 * the corresponding pathname actually exists on the file system
		 */
		output.println(myFile.exists());
		/*
		 * try a different pathname to a file that doesn't exist!
		 */

		/*
		 * Now let's query whether this pathname corresponds to a file or a
		 * directory
		 */
		output.println("Is Directory? " + myFile.isDirectory());
		output.println("Is Directory? " + parentDirectory.isDirectory());

		/*
		 * Now let's query this object to determine the size
		 */
		output.println("Size in bytes: " + myFile.length());
		output.println("Size in bytes: " + parentDirectory.length());

		/*
		 * Now let's query when this file was last modified
		 */
		output.println(myFile.lastModified());

		/*
		 * Let's format the date nicely, using the services of the Date class
		 */
		Date lastModifiedDate = new Date(myFile.lastModified());
		output.println(lastModifiedDate);

		output.println(myFile.canWrite());
		output.println(parentDirectory.listFiles());
		File newDir = new File(prefix + "newDir");
		boolean newDirSuccessful = newDir.mkdir();
		output.println(newDirSuccessful);
	}
}
