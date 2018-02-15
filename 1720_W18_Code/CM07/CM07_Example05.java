package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example05 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		/*
		 * Here is a string assignment that represents what a user might have
		 * typed.
		 */
		String userInput = "12";
		int myValue = Integer.parseInt(userInput);

		output.println("The string is: " + userInput);
		output.println("here is the square of the int value: " + myValue * myValue);

		// If you use parseInt and pass it a String that cannot be parsed as an
		// int, then a NumberFormatException is raised

		// uncomment to demonstrate this
		// Integer.parseInt("hello");
	}
}
