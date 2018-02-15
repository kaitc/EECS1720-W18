package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example11 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		// your task: once you catch the exception, shut down the app in an
		// orderly way
		try {
			Integer.parseInt("hello");
		} catch (NumberFormatException e) {
			output.println("An exception has been caught.");
		}
		output.println("Here is another line being printed to the console.");

	}
}
