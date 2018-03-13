package CM18;

import java.io.PrintStream;
import java.util.List;

import javafx.scene.text.Font;

public class CM18_FontDemo {

	public static void main(String[] args) {
		PrintStream output = System.out;

		List<String> allFamilies = Font.getFamilies();

		for (String s : allFamilies) {
			output.println(s);
		}

	}

}
