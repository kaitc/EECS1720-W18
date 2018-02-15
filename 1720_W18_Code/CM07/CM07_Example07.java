package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example07 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		// assume hours is in the AM meridian
		int hours = 1;
		int minutes = 30;

		// write the expression that derives the number of minutes that elapsed
		// since midnight

		int minutesElapsed = hours * 60 + minutes;

		output.println("The number of minutes elapsed since midnight is: " + minutesElapsed);

		/*
		 * PROBLEM #1
		 * 
		 * the number 60 above is a numerical literal. It is appearing in the
		 * middle of the source code. This is not an acceptable coding pattern.
		 * 
		 * INSTEAD
		 */

		final int MINUTES_PER_HOUR = 60; // all CAPS with UNDERSCORE is the
											// STYLE FOR variables meant to be
											// CONSTANTS!

		int minutesElapsedV2 = hours * MINUTES_PER_HOUR + minutes;
	}
}
