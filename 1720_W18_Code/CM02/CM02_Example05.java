package CM02;
import java.io.PrintStream;
import java.util.Scanner;

public class CM02_Example05 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		out.println("Here I will create and throw an exception.\n");
		RuntimeException myException = new RuntimeException();
		throw myException;
	}
}
