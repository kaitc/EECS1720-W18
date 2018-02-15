package imagePackage;

import java.awt.Color;

/**
 * Class that encapsulates a pixel that is a component of a specific digital
 * picture. Attributes of a pixel include: its x and y location within its
 * picture, and its colour. This class provides services to access and mutate
 * the colour of a pixel. The x,y locations cannot be changed.
 * 
 * This class provides services for accessing and/or mutating the colour of a
 * pixel via (1) red, green, blue, and alpha values or via (2) using a Color
 * instance.
 * 
 * Copyright Georgia Institute of Technology 2004
 * 
 * @author Barb Ericson ericson@cc.gatech.edu
 */

/**
 * This class encapsulates a pixel that exists in the context of an existing
 * raster graphic image. The attributes of a pixel include its x and y
 * coordinates within the raster image and its colour. This class provides
 * accessors and mutators for the pixel's colour. The pixel's (x,y) coordinates
 * cannot be changed because they are determined by the raster graphic image to
 * which the pixel belongs.
 * 
 * @author M. Baljko mb@cse.yorku.ca, based upon the Pixel class provided in the
 *         Guzdial and Ericson textbook, with explanatory comments and
 *         modifications provided by various other contributors:
 *         sdc@cs.albany.edu, ericson@cc.gatech.edu
 */
public class Pixel {

	// //////////////////////// fields ///////////////////////////////////

	/** the digital picture this pixel belongs to */
	private RasterImage picture;

	/** the x location of this pixel in the picture (0,0) is top left */
	private int x;

	/** the y location of this pixel in the picture (0,0) is top left */
	private int y;

	// //////////////////// constructors /////////////////////////////////

	/**
	 * A constructor that take the x and y location for the pixel and the
	 * picture the pixel is coming from
	 * 
	 * @param picture
	 *            the picture that the pixel is in
	 * @param x
	 *            the x location of the pixel in the picture
	 * @param y
	 *            the y location of the pixel in the picture
	 */
	public Pixel(RasterImage picture, int x, int y) {
		// set the picture
		this.picture = picture;

		// set the x location
		this.x = x;

		// set the y location
		this.y = y;

	}

	// /////////////////////// methods //////////////////////////////

	/**
	 * Accessor for the x location of this pixel. Assumes an origin of (0,0) in
	 * the upper left-hand corner.
	 * 
	 * @return as described above
	 */
	public int getX() {
		return x;
	}

	/**
	 * Accessor for the y location of this pixel. Assumes an origin of (0,0) in
	 * the upper left-hand corner.
	 * 
	 * @return as described above
	 */
	public int getY() {
		return y;
	}

	/**
	 * Accessor for this pixel's alpha value (transparency). The returned value
	 * will fall within the range [0,255].
	 * 
	 * @return as described above
	 */
	public int getAlpha() {

		/*
		 * get the value at the location from the picture as a 32 bit int with
		 * alpha, red, green, blue each taking 8 bits from left to right
		 */
		int value = picture.getPixelColor(x, y);

		// get the alpha value (starts at 25 so shift right 24)
		// then and it with all 1's for the first 8 bits to keep
		// end up with from 0 to 255
		int alpha = (value >> 24) & 0xff;

		return alpha;
	}

	/**
	 * Accessor for this pixel's red value. The returned value will fall within
	 * the range [0,255]. The lower extreme of the range means red is completely
	 * absent and the higher extreme of the range means maximum amount of red.
	 * 
	 * @return as described above
	 */
	public int getRed() {

		/*
		 * get the value at the location from the picture as a 32 bit int with
		 * alpha, red, green, blue each taking 8 bits from left to right
		 */
		int value = picture.getPixelColor(x, y);

		// get the red value (starts at 17 so shift right 16)
		// then and it with all 1's for the first 8 bits to keep
		// end up with from 0 to 255
		int red = (value >> 16) & 0xff;

		return red;
	}

	/**
	 * Accessor for this pixel's green value. The returned value will fall
	 * within the range [0,255]. The lower extreme of the range means green is
	 * completely absent and the higher extreme of the range means maximum
	 * amount of green.
	 * 
	 * @return as described above
	 */
	public int getGreen() {

		/*
		 * get the value at the location from the picture as a 32 bit int with
		 * alpha, red, green, blue each taking 8 bits from left to right
		 */
		int value = picture.getPixelColor(x, y);

		// get the green value (starts at 9 so shift right 8)
		int green = (value >> 8) & 0xff;

		return green;
	}

	/**
	 * Accessor for this pixel's blue value. The returned value will fall within
	 * the range [0,255]. The lower extreme of the range means blue is
	 * completely absent and the higher extreme of the range means maximum
	 * amount of blue.
	 * 
	 * @return as described above
	 */
	public int getBlue() {

		/*
		 * get the value at the location from the picture as a 32 bit int with
		 * alpha, red, green, blue each taking 8 bits from left to right
		 */
		int value = picture.getPixelColor(x, y);

		// get the blue value (starts at 0 so no shift required)
		int blue = value & 0xff;

		return blue;
	}

	/**
	 * Accessor for this pixel's colour.
	 * 
	 * @return as described above
	 */
	public Color getColor() {
		/*
		 * get the value at the location from the picture as a 32 bit int with
		 * alpha, red, green, blue each taking 8 bits from left to right
		 */
		int value = picture.getPixelColor(x, y);

		// get the red value (starts at 17 so shift right 16)
		// then and it with all 1's for the first 8 bits to keep
		// end up with from 0 to 255
		int red = (value >> 16) & 0xff;

		// get the green value (starts at 9 so shift right 8)
		int green = (value >> 8) & 0xff;

		// get the blue value (starts at 0 so no shift required)
		int blue = value & 0xff;

		return new Color(red, green, blue);
	}

	/**
	 * Mutates this pixel's colour to the passed color.
	 * 
	 * @param newColor
	 *            the new color to use
	 */
	public void setColor(Color newColor) {
		// set the red, green, and blue values
		int red = newColor.getRed();
		int green = newColor.getGreen();
		int blue = newColor.getBlue();

		// update the associated picture
		updatePicture(this.getAlpha(), red, green, blue);
	}

	/**
	 * Mutates this pixel's colour to the passed color, as represented by the
	 * tuple of values described below.
	 * 
	 * 
	 * @param alpha
	 *            the alpha (transparency) value that the pixel should have
	 * @param red
	 *            the red value for the color that the pixel should have
	 * @param green
	 *            the green value for the color that the pixel should have
	 * @param blue
	 *            the blue value for the color that the pixel should have
	 */
	public void updatePicture(int alpha, int red, int green, int blue) {
		// create a 32 bit int with alpha, red, green blue from left to right
		int value = (alpha << 24) + (red << 16) + (green << 8) + blue;

		// update the picture with the int value
		picture.setBasicPixel(x, y, value);
	}

	/**
	 * Mutates this pixel's red colour value to the passed value, provided the
	 * passed value falls within the interval [0,255]. For values below 0, the
	 * red colour value of 0 is used. For values above 255, the red colour value
	 * of 255 is used.
	 * 
	 * @param value
	 *            the new value to use
	 */
	public void setRed(int value) {
		// set the red value to the corrected value
		int red = correctValue(value);

		// update the pixel value in the picture
		updatePicture(getAlpha(), red, getGreen(), getBlue());
	}

	/**
	 * Mutates this pixel's green colour value to the passed value, provided the
	 * passed value falls within the interval [0,255]. For values below 0, the
	 * red colour value of 0 is used. For values above 255, the red colour value
	 * of 255 is used.
	 * 
	 * @param value
	 *            the value to use
	 */
	public void setGreen(int value) {
		// set the green value to the corrected value
		int green = correctValue(value);

		// update the pixel value in the picture
		updatePicture(getAlpha(), getRed(), green, getBlue());
	}

	/**
	 * Mutates this pixel's blue colour value to the passed value, provided the
	 * passed value falls within the interval [0,255]. For values below 0, the
	 * red colour value of 0 is used. For values above 255, the red colour value
	 * of 255 is used.
	 * 
	 * @param value
	 *            the new value to use
	 */
	public void setBlue(int value) {
		// set the blue value to the corrected value
		int blue = correctValue(value);

		// update the pixel value in the picture
		updatePicture(getAlpha(), getRed(), getGreen(), blue);
	}

	/**
	 * Mutates this pixel's alpha value to the passed value, provided the passed
	 * value falls within the interval [0,255]. For values below 0, the alpha
	 * value value of 0 is used. For values above 255, the alpha value of 255 is
	 * used.
	 * 
	 * 
	 * Method to set the alpha (transparency) to a new alpha value
	 * 
	 * @param value
	 *            the new value to use
	 */
	public void setAlpha(int value) {
		// make sure that the alpha is from 0 to 255
		int alpha = correctValue(value);

		// update the associated picture
		updatePicture(alpha, getRed(), getGreen(), getBlue());
	}

	/**
	 * Method to correct a color value to be within 0 and 255
	 * 
	 * @param the
	 *            value to use
	 * @return a value within 0 and 255
	 */
	private static int correctValue(int value) {
		if (value < 0)
			value = 0;
		if (value > 255)
			value = 255;
		return value;
	}

	/**
	 * Determines the distance between this pixel's color and the passed color.
	 * Distance is defined as the square root of the squares of the differences
	 * between each of the 4 components: red, green, blue, alpha
	 * 
	 * @param testColor
	 *            the color to which to compare
	 * @return the distance between this pixel's color and the passed color
	 */
	public double colorDistance(Color testColor) {
		double redDistance = this.getRed() - testColor.getRed();
		double greenDistance = this.getGreen() - testColor.getGreen();
		double blueDistance = this.getBlue() - testColor.getBlue();
		double distance = Math.sqrt(redDistance * redDistance + greenDistance
				* greenDistance + blueDistance * blueDistance);
		return distance;
	}

	/**
	 * Determines the average value of the three colour components of this pixel
	 * 
	 * @return as described above
	 */
	public double getAverage() {
		double average = (getRed() + getGreen() + getBlue()) / 3.0;
		return average;
	}

	/**
	 * Returns a string descriptor about the 3 colour components of this pixel.
	 * 
	 * @return as described above
	 */
	public String toString() {
		return "Pixel red=" + getRed() + " green=" + getGreen() + " blue="
				+ getBlue();
	}

}