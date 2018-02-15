package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example01 {

	public static void main(String[] args) {
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in);
		// You have constructed a scanner object. A scanner is a thing that can
		// parse primitive types and strings using regular expressions. You are
		// using this parser to handle the input that is coming via the console.

		final String PROMPT = "Here is a prompt: ";
		output.println(PROMPT);
		String userInput = input.nextLine(); // scanner is waiting to receive an
												// end-of-line character in
												// order to return a line of
												// text

		output.println("Here I will print the string object");
		output.println(userInput);

		input.close();
	}
}
