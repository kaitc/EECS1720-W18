package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example14 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		output.println("The app is starting.");
		// your task: raise and catch an exception

		try {
			// here we create and throw the exception object in one statement
			throw new RuntimeException();
		} catch (RuntimeException e) {
			output.println("An exception is caught.");
		}

		// uncomment this to see what the compiler does
		// SOMETHING INTERESTING HERE- CAN YOU EXPLAIN IT?
		// output.println("Did the app reach this statement?");
	}
}
