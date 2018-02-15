package Lab01Exercises;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * This app (Exercise01) prompts the user for a time. If the input adheres the
 * input requirements, then the app prints to the console the number of minutes
 * that passed since the start of that day. Otherwise, this app crashes or has
 * possibly incorrect behaviours.
 * 
 * The start of the Xth day is defined as midnight of the (X-1)th day. For
 * instance, the start of the day Tuesday Jan 02, 2018 is defined as the
 * midnight of Monday Jan 1st (12:00am). See
 * http://en.wikipedia.org/wiki/12-hour_clock
 * 
 * The smallest value is 12:00, for which 0 minutes have elapsed since the start
 * of the day (i.e., 0 hours * 60 minutes + 0 minutes = 0 + 0 = 0). The largest
 * value is 11:59, for which 719 minutes have elapsed since the start of the day
 * (i.e., 11 hours * 60 minutes + 59 minutes = 660 + 59 = 719).
 * 
 * *** Required User Input ***
 * 
 * (1) two colon-delimited tokens (e.g., h:m). Let the tokens be denoted h and
 * m, respectively. The colon may be prefixed or suffixed with an arbitrary
 * number of space characters.
 * 
 * (2) each of the two tokens can be parsed as an int
 * 
 * (3) The first token, h, has a value 0 < h <=12. The second token, m, has a
 * value 0 <= m <= 59.
 * 
 * *** App Behaviour: ***
 * 
 * If the user's input conforms to the requirements, then the app prints a value
 * as described above. Otherwise, there are no guarantees about this app's
 * behaviour. It may crash, or it may output a number that is correct or
 * incorrect.
 * 
 * *** Sample 1: ***
 * 
 * Input: 11:50
 * 
 * Output: 710
 * 
 * e.g., 11 * 60 + 50 = 710
 * 
 * *** Sample 2: ***
 * 
 * Input: 12:10  (or 0:10)
 * 
 * Output: 10
 * 
 * e.g., 0 * 60 + 10 = 10 (because 12:00 am is the start of the day, see above
 * for further explanation)
 * 
 * *** Sample 3: ***
 * 
 * Input: 56
 * 
 * Output: unspecified (app may or may not crash)
 * 
 * *** Sample 4: ***
 * 
 * Input: "" (i.e., the empty string)
 * 
 * Output: unspecified (app may or may not crash)
 * 
 * *** Sample 5: ***
 * 
 * Input: asd:asd
 * 
 * Output: unspecified (app may or may not crash)
 * 
 * *** Sample 6: ***
 * 
 * Input: 14:20
 * 
 * Output: unspecified (app may or may not crash, may produce some number,
 * perhaps 140, whereas the actual number of minutes elapsed since the start of
 * the day is 14*60+20=860)
 * 
 * *** End of Samples ***
 * 
 * @author [INSERT YOUR NAME/STUDENT NUMBER HERE]
 * 
 */
public class Exercise01 {

	public static void main(String[] args) {

		/*
		 * Start by setting up variables for input and output.
		 */
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in); // place input.close(); as the
												// final statement to eliminate
												// the compiler warning.

		/*
		 * Here is a statement that is provided to you, to get you started. We
		 * begin by prompting the user to provide the input.
		 */

		final String PROMPT = "Enter \"h:m\" (where 0 <= h <= 12 and 0 <= m < 60): ";
		output.printf(PROMPT);
		
		/*
		 * Start by reading the comment block at the start of this class
		 * definition. Ensure that you first understand this app's
		 * specification.
		 * 
		 * Your first step is to read the user's inputed string and store in an
		 * appropriately-named variable, say "userInput".
		 * 
		 * For the sake of this exercise, you may assume that the input is valid
		 * (i.e., you may assume that the user will enter two tokens that are
		 * delimited by a colon as per the instructions above).
		 */

		/*
		 * Now identify and make use of a service that can be used to extract
		 * the two colon-delimited tokens from the String variable "userInput",
		 * and to store each of tokens in its own String variables.For the sake
		 * of this lab exercises, declare the variables and assign the variables
		 * in separate statements (you will see why we need to do this in
		 * Exercise02). For example, the variable names "tok1" and "tok2".
		 * 
		 * Print each token to the console.
		 */

		/*
		 * Hint: you can do this using the "split" method of String, or the
		 * nextXX from Scanner.
		 */


		/*
		 * Now identify and make use of a service that can be used to parse each
		 * token as an integer. For the sake of these lab exercises, declare the
		 * variables and assign the variables in separate statements (you will
		 * see why we need to do this in Exercise03).
		 */


		/*
		 * Now implement an arithmetic expression in order to derive the number
		 * of minutes that have elapsed since midnight. Print the result to the
		 * console.
		 * 
		 * Hint: The seemingly obvious approach would be as follows: take the
		 * inputed number of hours and multiply by the number of minutes per
		 * hour (a constant), then add to this product the inputed number of
		 * minutes. However, check to see whether this works for the boundary
		 * cases (the smallest and largest possible inputs). You will need to
		 * devise a solution that works for the full range of possible inputs.
		 * 
		 * Hint: Do not use MAGIC NUMBERS. Instead, use the coding pattern of
		 * using final variables.
		 */


	}
}
