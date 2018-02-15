package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example13 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		output.println("The app is starting.");
		// your task: raise an exception

		// here we create and throw the exception object in one statement
		throw new RuntimeException();

		// uncomment this to see what the compiler does
		// output.println("Did the app reach this statement?");
	}
}
