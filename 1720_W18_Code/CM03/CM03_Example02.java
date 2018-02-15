package CM03;
import java.util.Scanner;

public class CM03_Example02 {

	public static void main(String[] args) {
	     String input = "1 2 3";
	     Scanner s = new Scanner(input);
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());	     
	     // nextInt() throws NoSuchElementException if input is exhausted
	     System.out.println(s.nextInt());
	     s.close(); 

	}
}
