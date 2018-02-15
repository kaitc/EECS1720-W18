package CM03;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class CM03_Example03 {

	public static void main(String[] args) {
		// the constructor PrintStream(String) throws FileNotFoundException - If
		// the given file object does not denote an existing, writable regular
		// file and a new regular file of that name cannot be created, or if
		// some other error occurs while opening or creating the file
		
		// the compile will issue an error just by invoking this service 
		// why is this?
		// uncomment next line to demonstrate

		//PrintStream myOutputFile = new PrintStream("output.txt");
		
		
		//myOutputFile.close();
	}
}
