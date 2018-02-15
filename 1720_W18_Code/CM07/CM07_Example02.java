package CM07;
import java.io.PrintStream;

public class CM07_Example02 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		/*
		 * Here is a string assignment that represents what a user might have
		 * typed.
		 */
		String userInput = "12:39";

		// TECHNIQUE 1
		/*
		 * Here we will use the split method
		 */
		String[] tokens = userInput.split(":");
		// the array contains one element for each token that is delimited by a
		// colon :

		// this enhanced for loop will iterate over all of the elements of the
		// array. TRY OUT DIFFERENT STRINGS!
		for (String s : tokens) {
			output.println("array element: " + s);
		}

		// You can access the elements of the array directly.

		// If you attempt to access an element beyond the end of an array, an
		// ArrayIndexOutOfBoundsException is raised

		// uncomment to try it! here is a crazy large index
		// output.println(tokens[7123497]);

	}
}
