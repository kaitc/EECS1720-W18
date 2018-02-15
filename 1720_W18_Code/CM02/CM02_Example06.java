package CM02;
import java.io.PrintStream;
import java.util.Scanner;

public class CM02_Example06 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		try {
			out.println("Here I will create and throw an exception.\n");
			RuntimeException myException = new RuntimeException();
			throw myException;
		} catch (RuntimeException e) {
			out.println("And here I have caught the exception.\n");
		}
	}
}
