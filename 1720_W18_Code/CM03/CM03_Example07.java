package CM03;
import java.io.PrintStream;
import java.util.Scanner;

public class CM03_Example07 {

	public static void main(String[] args) {
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in);
		
		// demonstrate catch block with a parent class in catch block header
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
		} catch (Exception e) {
			output.println("Something happened, not such what");
			output.println("Here's the exception: " + e.getClass());
		}
		output.println("Clean Exit .");
	}
}
