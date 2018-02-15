package CM02;
import java.io.PrintStream;
import java.util.Scanner;

public class CM02_Example03a {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Scanner input = new Scanner(System.in);
		out.println("Please enter an integer and I will tell you whether it is odd or even");
		int numer = Integer.parseInt(input.nextLine());
		input.close();
	}
}
