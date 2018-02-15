package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example06 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		// assume hours is in the AM meridian
		int hours = 1;
		int minutes = 30;

		// write the expression that derives the number of minutes that elapsed
		// since midnight

		int minutesElapsed = hours * 60 + minutes;

		output.println("The number of minutes elapsed since midnight is: " + minutesElapsed);

		// There are two problems with the code above; locate and fix the
		// problems. (solution is in CM07_Example07)

	}
}
