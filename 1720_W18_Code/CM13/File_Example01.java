package CM13;
import java.io.File;
import java.io.PrintStream;

public class File_Example01 {
	public static void main(String[] args) {

		// this app demonstrates the static attributes of the class File. File
		// is not a utility class, but it does provide these useful static
		// methods
		PrintStream output = System.out;

		String fileNameSeparator = File.separator;
		output.println(fileNameSeparator);

		String pathSeparator = File.pathSeparator;
		output.println(pathSeparator);
	}

}
