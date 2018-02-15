package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example10_soln {

	public static void main(String[] args) {
		PrintStream output = System.out;

		// here is a statement that will definitely raise an exception
		// your task: catch the exception and print a message to the console

		try {
			Integer.parseInt("hello");
		} catch (NumberFormatException e) {
			output.println("An exception has been caught.");
		}
		output.println("Here is another line being printed to the console.");

	}
}
