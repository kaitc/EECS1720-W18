package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example04 {

	public static void main(String[] args) {

		PrintStream output = System.out;

		/*
		 * Here is a string assignment that represents what a user might have
		 * typed.
		 */
		String userInput = "12:39";

		// TECHNIQUE 3
		/*
		 * Here we will use a Scanner
		 */
		Scanner myScanner = new Scanner(userInput);
		// you have constructed a scanner object. A scanner is a thing that can
		// parse primitive types and strings using regular expressions. This is
		// a different scanner than the one used in CM07_Example01. You can
		// construct as many different scanners as you like.

		myScanner.useDelimiter(":");
		// tell the scanner you want a colon to be the delimiter

		while (myScanner.hasNext()) {
			String token = myScanner.next();
			output.println("token from Scanner object: " + token);
		}

		// If you invoke .next() when the Scanner does not have any more tokens,
		// then a NoSuchElementException is raised

		// uncomment to demonstrate this
		// myScanner.next();
	}
}
