package CM06;

import java.awt.Color;

import imagePackage.Pixel;
import imagePackage.RasterImage;

public class CM06_Example02 {

	public static void main(String[] args) {
		RasterImage myPict = new RasterImage("imageFiles/img1.jpg");
		myPict.show();

		for (Pixel p : myPict) {
			p.setColor(Color.RED);
		}

	}
}
