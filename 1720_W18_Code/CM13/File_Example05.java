package CM13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class File_Example05 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PrintStream output = System.out;

		String fileName = "data.obj";
		FileInputStream fis;
		fis = new FileInputStream(fileName);

		ObjectInputStream ois;
		ois = new ObjectInputStream(fis);
		Object obj;
		obj = ois.readObject();
		output.println(obj.getClass().toString());
		Integer myObject = (Integer) obj;
		// notice how the VM resolves toString correctly, even without the
		// manual cast
		output.println(obj.toString());
		output.println(myObject.toString());

		ois.close();

	}
}
