package CM03;
import java.io.PrintStream;
import java.util.Scanner;

public class CM03_Example04 {

	public static void main(String[] args) {
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in);
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
	}
}
