package imagePackage;

import java.awt.Color;

/**
 * Utility class that encapsulates various functions concerning pixels.
 * 
 * @author M. Baljko
 */
public class PixelServices {

	/**
	 * Method to get the red value from a integer pixel color representation.
	 * 
	 * @param value
	 *            the integer color representation
	 * @return as described above
	 */
	public static int getRed(int value) {
		int red = (value >> 16) & 0xff;
		return red;
	}

	/**
	 * Method to get the green value from a integer pixel color representation.
	 * 
	 * @param value
	 *            the integer color representation
	 * @return as described above
	 */
	public static int getGreen(int value) {
		int green = (value >> 8) & 0xff;
		return green;
	}

	/**
	 * Method to get the blue value from a integer pixel color representation.
	 * 
	 * @param value
	 *            the integer color representation
	 * @return as described above
	 */
	public static int getBlue(int value) {
		int blue = value & 0xff;
		return blue;
	}

	/**
	 * Method to compute the distance between two colors
	 * 
	 * @param color1
	 *            the first color
	 * @param color2
	 *            the second color
	 * @return the distance between the two colors
	 */
	public static double colorDistance(Color color1, Color color2) {
		double redDistance = color1.getRed() - color2.getRed();
		double greenDistance = color1.getGreen() - color2.getGreen();
		double blueDistance = color1.getBlue() - color2.getBlue();
		double distance = Math.sqrt(redDistance * redDistance + greenDistance
				* greenDistance + blueDistance * blueDistance);
		return distance;
	}

}