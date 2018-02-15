package CM13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class File_Example04 {
	public static void main(String[] args) throws IOException {
		Integer theObject  = new Integer(75);
		// Create an output stream connected to a file:
		String fileName = "data.obj";
		FileOutputStream fos;
		fos = new FileOutputStream(fileName);

		// Create an object output stream that feeds the file output stream:
		ObjectOutputStream oos;
		oos = new ObjectOutputStream(fos);

		// Serialize the circle object
		oos.writeObject(theObject );

		// Close the stream:
		oos.close();
	}
}
