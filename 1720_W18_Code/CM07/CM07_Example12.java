package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example12 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		// your task: raise an exception

		// first you need to create the exception object
		RuntimeException e = new RuntimeException();

		// next you need to throw it
		throw e;

		// uncomment this to see what the compiler does
		// output.println("Did the app reach this statement?");
	}
}
