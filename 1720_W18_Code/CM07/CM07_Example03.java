package CM07;
import java.io.PrintStream;

public class CM07_Example03 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		/*
		 * Here is a string assignment that represents what a user might have
		 * typed.
		 */
		String userInput = "12:39";

		// TECHNIQUE 2
		/*
		 * Here we will use the indexOf method
		 */
		int idx = userInput.indexOf(":");
		// the return is the index position of the colon : or -1 if there is no
		// colon. TRY OUT DIFFERENT STRINGS

		output.println("index of colon is : " + idx);

		// You can use the index to extract substrings
		String substring1 = userInput.substring(0, idx);

		// If the second parameter value is smaller than the first parameter
		// value, then an
		// StringIndexOutOfBoundsException is raised

	}
}
