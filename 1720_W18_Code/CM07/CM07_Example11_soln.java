package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example11_soln {

	public static void main(String[] args) {
		PrintStream output = System.out;

		// your task: once you catch the exception, shut down the app in an
		// orderly way
		try {
			Integer.parseInt("hello");
		} catch (NumberFormatException e) {
			output.println("An exception has been caught.");
			System.exit(0);
		}
		output.println("Here is another line being printed to the console.");

	}
}
