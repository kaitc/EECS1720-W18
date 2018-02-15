package CM07;
import java.io.PrintStream;
import java.util.Scanner;

public class CM07_Example08 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		// assume hours is in the AM meridian
		int hours = 12;
		int minutes = 30;

		// write the expression that derives the number of minutes that elapsed
		// since midnight

		final int MINUTES_PER_HOUR = 60; // all CAPS with UNDERSCORE is the
		// STYLE FOR variables meant to be
		// CONSTANTS!

		int minutesElapsed = hours * MINUTES_PER_HOUR + minutes;

		output.println("The number of minutes elapsed since midnight is: " + minutesElapsed);

		/*
		 * PROBLEM #2
		 * 
		 * The expression works well for hours 1-11, but gives an incorrect
		 * answer when hour is 12
		 * 
		 * e.g. 12:30am is only 30 minutes past midnight
		 * 
		 * INSTEAD derive the number of hours modulo 12
		 * 
		 */
		final int HOURS_PER_MEDIAN = 12;
		int minutesElapsedV2 = hours % HOURS_PER_MEDIAN * MINUTES_PER_HOUR + minutes;

		output.println("The number of minutes elapsed since midnight is: " + minutesElapsedV2);

	}
}
