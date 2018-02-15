package CM03;
import java.io.PrintStream;
import java.util.Scanner;

public class CM03_Example08 {

	public static void main(String[] args) {

		// wackadoodle example to show crazy mixture of catching some types of
		// exceptions and then throwing other types. See if you can trace what
		// is happening.

		PrintStream output = System.out;
		try {
			myMethod();
		} catch (ArithmeticException e) {
			output.println("Cannot divide by zero !");
		}
		output.println("Clean Exit.");
	}

	public static void myMethod() throws ArithmeticException {
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in);
		try {
			output.println("Enter a fraction (x/y) and I will give you the quotient");
			String str = input.nextLine();
			int slash = str.indexOf("/");
			String left = str.substring(0, slash);
			String right = str.substring(slash + 1);
			int numer = Integer.parseInt(left);
			int denom = Integer.parseInt(right);
			int quotient = numer / denom;
			output.println("Quotient = " + quotient);
			input.close();
		} catch (IndexOutOfBoundsException e) {
			output.println("No slash in input!");
		} catch (NumberFormatException e) {
			output.println("Non-integer operands !");
		}
	}
}
