package CM02;
public class CM02_Example02 {

	public static void main(String[] args) {
		try {
			int denom = 0;
			int result = 7 / denom;
		} catch (ArithmeticException e) {
			// ok, here is the block of code that will be invoked if an
			// ArithmeticException was raised in the try block
			System.out.println("I caught it");
			// e.printStackTrace();
			// System.out.println(e.getMessage());
		}
		System.out.println("here is my parting msg");
	}
}
