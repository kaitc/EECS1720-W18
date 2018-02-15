package imagePackage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.geom.*;
import java.io.File;

/**
 * This class encapsulates a raster graphics image, which is an image that is
 * composed of a rectangular grid of pixels. The raster graphics image is
 * displayable at runtime in a window through the use of the {@link #show()
 * show} method. The window will have the default window decorators and the
 * string that appears as the title is an attribute of the RasterImage object.
 * This class provides constructors for the instantiation of a raster graphic
 * image (i) from a file name, (ii) from another image, or (iii) from a width
 * and height specification. This class provides accessor methods for the pixels
 * of the raster image.
 * 
 * @author M. Baljko mb@cse.yorku.ca, based upon the Picture class provided in
 *         the Guzdial and Ericson textbook, with explanatory comments and
 *         modifications provided by various other contributors:
 *         sdc@cs.albany.edu, ericson@cc.gatech.edu
 */
public class RasterImage implements Iterable<Pixel> { // implements
														// AbstractDigitalPicture
														// {

	private String fileName;
	private String theTitle;
	private BufferedImage bufferedImage;
	private PictureFrame pictureFrame;
	private String fileNameExtension; // e.g., (jpg or bmp)

	/**
	 * Constructs a raster image consisting of only white pixels, with a default
	 * width of 200 and a default height of 100. The image title string will be
	 * "New Picture".
	 */
	public RasterImage() {
		this(200, 100);
	}

	/**
	 * Constructs a raster image consisting of only white pixels, with a width
	 * and height as specified by the passed parameter values. All of the pixels
	 * are set to the default colour of white. The image title string will be
	 * "New Picture".
	 * 
	 * @param width
	 *            the width of the raster image, expressed in number of pixels
	 * @param height
	 *            the height of the raster image, expressed in number of pixels
	 */
	public RasterImage(int width, int height) {
		bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		theTitle = "New Picture";
		fileNameExtension = "jpg";
		setAllPixelsToAColor(Color.white);
	}

	/**
	 * Constructs a raster image consisting of the pixels derived from the image
	 * that is specified in the file that is passed as parameter. The width and
	 * height of the picture will be determined by the image that is contained
	 * in the file. The image title string will be "New Picture". The passed
	 * file name will remain associated with this raster image and can be
	 * accessed later. If the contents of the specified file cannot be
	 * interpreted in any of the supported image formats, then this constructor
	 * will cause the app to shut down, with the printStack printed to standard
	 * out.
	 * 
	 * @param fileName
	 *            the name of the file that contains the source image
	 */
	public RasterImage(String fileName) {

		try {
			load(fileName);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	/**
	 * Constructs a new instance of this class that has the same state as the
	 * passed instance.
	 * 
	 * @param copyPicture
	 *            the picture to copy from
	 */
	public RasterImage(RasterImage copyPicture) {
		this.fileName = copyPicture.getFileName();// new
													// String(copyPicture.fileName);
		this.theTitle = copyPicture.getTitle();// new
												// String(copyPicture.theTitle);
		this.fileNameExtension = copyPicture.fileNameExtension;
		if (copyPicture.bufferedImage != null) {
			this.bufferedImage = new BufferedImage(copyPicture.getWidth(), copyPicture.getHeight(),
					BufferedImage.TYPE_INT_RGB);
			this.copyPicture(copyPicture);
		}
	}

	/**
	 * Returns the extension of the filename used to create this picture (e.g.,
	 * jpg or bmp), if one exists (otherwise, null is returned).
	 * 
	 * @return as described above
	 */
	// public String getExtension() {
	// return fileNameExtension;
	// }

	/**
	 * Mutates this raster image to have the same state as the passed raster
	 * image. This pixels of this image are unique to this image. Each pixel's
	 * state will be copied from the corresponding pixel of the passed raster
	 * image.
	 * 
	 * @param otherRasterImage
	 *            the raster image from which the attributes are to be copied.
	 */
	public void copyPicture(RasterImage otherRasterImage) {
		Pixel sourcePixel = null;
		Pixel targetPixel = null;

		// loop through the columns
		for (int sourceX = 0, targetX = 0; sourceX < otherRasterImage.getWidth()
				&& targetX < this.getWidth(); sourceX++, targetX++) {
			// loop through the rows
			for (int sourceY = 0, targetY = 0; sourceY < otherRasterImage.getHeight()
					&& targetY < this.getHeight(); sourceY++, targetY++) {
				sourcePixel = otherRasterImage.getPixel(sourceX, sourceY);
				targetPixel = this.getPixel(targetX, targetY);
				targetPixel.setColor(sourcePixel.getColor());
			}
		}

	}

	/**
	 * Mutate all of this image's pixels to have the passed color
	 * 
	 * @param color
	 *            the new color for all of the pixels
	 */
	public void setAllPixelsToAColor(Color color) {
		// loop through all x
		for (int x = 0; x < this.getWidth(); x++) {
			// loop through all y
			for (int y = 0; y < this.getHeight(); y++) {
				getPixel(x, y).setColor(color);
			}
		}
	}

	/**
	 * Mutate the colour of all of the pixels in the specified row to be black.
	 * The row index 0 corresponds to the top row. If the passed rowIndex is
	 * outside of the row indices that are defined for this image, then nothing
	 * happens. If the passed rowIndex is outside of the row indices that are
	 * defined for this image, then nothing happens. This method causes this
	 * image to be repainted after the colour of each pixel is mutated (and thus
	 * this method may be relatively slow).
	 * 
	 * @param rowIndex
	 *            as described above
	 */
	public void blacken(int rowIndex) {
		for (int i = 0; i < this.getWidth(); i++) {
			Pixel p = getPixel(i, rowIndex);
			p.setRed(0);
			p.setGreen(0);
			p.setBlue(0);
			this.repaint();
		}
	}

	/**
	 * Cause the pixels in the specified row to change to the specified colour.
	 * The row index 0 corresponds to the top row. If the passed rowIndex is
	 * outside of the row indices that are defined for this image, then nothing
	 * happens. This method causes this image to be repainted after the colour
	 * of each pixel is mutated (and thus this method may be relatively slow).
	 * 
	 * 
	 * @param rowIndex
	 *            as described above
	 * @param theNewColor
	 *            the new colour of the pixels in the row
	 */
	public void modifyRowColour(int rowIndex, Color theNewColor) {
		for (int i = 0; i < this.getWidth(); i++) {
			Pixel p = getPixel(i, rowIndex);
			p.setColor(theNewColor);
			this.repaint();
		}
	}

	/**
	 * Returns the buffered image associated with this picture.
	 * 
	 * @return as described above
	 */
	BufferedImage getBufferedImage() {
		return bufferedImage;
	}

	/**
	 * Returns the Graphics2D instance that is associated with this ratser
	 * image. The Graphics2D instance encapsulates the graphics context for the
	 * platform upon which the virtual machine is running.
	 * 
	 * @return as described above
	 */
	public Graphics2D getGraphics2D() {
		// mb: did promotion cast here rather than require client to do it
		return (Graphics2D) bufferedImage.getGraphics();
	}

	/**
	 * Returns the Graphics2D instance (encapsulates the graphics context for
	 * the platform upon which the virtual machine is running), which can then
	 * be used to do 2D drawing on the picture
	 * 
	 * @return as described above
	 */
	// private Graphics2D createGraphics() {
	// return bufferedImage.createGraphics();
	// }

	/**
	 * Returns the name of the file that is associated with this raster image
	 * picture, if any exists. If this raster image was instantiated using means
	 * that did not involve a file, then this method will return the value null.
	 * 
	 * @return as described above
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Returns the string that is used in the title bar of the window that is
	 * used for the display of this raster image.
	 * 
	 * @return as described above
	 */
	public String getTitle() {
		return theTitle;
	}

	/**
	 * Set the string the string that is used in the title bar of the window
	 * that is used for the display of this raster image.
	 * 
	 * @param titleString
	 *            as described above
	 */
	public void setTitle(String titleString) {
		this.theTitle = titleString;
		pictureFrame.setTitle(titleString);
	}

	/**
	 * Returns the width of this picture in pixels.
	 * 
	 * @return as described above.
	 */
	public int getWidth() {
		return bufferedImage.getWidth();
	}

	/**
	 * Returns the height of this picture in pixels.
	 * 
	 * @return as described above.
	 */
	public int getHeight() {
		return bufferedImage.getHeight();
	}

	/**
	 * Returns the PictureFrame object that associated with this picture (it may
	 * be null)
	 * 
	 * @return as described above.
	 */
	// private PictureFrame getPictureFrame() {
	// return pictureFrame;
	// }

	/**
	 * Set the passed PictureFrame object to be associated with this picture.
	 * 
	 * @param pictureFrame
	 *            the picture frame to use
	 */
	// private void setPictureFrame(PictureFrame pictureFrame) {
	// // set this picture objects' picture frame to the passed one
	// this.pictureFrame = pictureFrame;
	// }

	/**
	 * Returns the Image from the picture
	 * 
	 * @return as described above.
	 */
	public Image getImage() {
		return bufferedImage;
	}

	/**
	 * Returns the colour of the pixel at the specified coordinate, in the
	 * integer color representation.
	 * 
	 * @param x
	 *            the x position of the pixel
	 * @param y
	 *            the y position of the pixel
	 * @return as described above
	 */
	public int getPixelColor(int x, int y) {
		return bufferedImage.getRGB(x, y);
	}

	/**
	 * Sets the colour of the specified pixel, as encoded in the passed int
	 * value.
	 * 
	 * @param x
	 *            the x position of the pixel
	 * @param y
	 *            the y position of the pixel
	 * @param rgb
	 *            the new rgb value of the pixel (alpha, red, green, blue)
	 */
	public void setBasicPixel(int x, int y, int rgb) {
		bufferedImage.setRGB(x, y, rgb);
	}

	/**
	 * Returns the Pixel object at the specified (x,y) coordinate.
	 * 
	 * @param x
	 *            the x position of the pixel
	 * @param y
	 *            the y position of the pixel
	 * @return as descibed above
	 */
	public Pixel getPixel(int x, int y) {
		// create the pixel object for this picture and the given x and y
		// location
		Pixel pixel = new Pixel(this, x, y);
		return pixel;
	}

	/**
	 * Returns an array of Pixels for this picture, which is composed of the
	 * pixels from the first row of this raster (from left to right), followed
	 * by the next row, and so on until the final row.
	 * 
	 * @return as described above
	 */
	public Pixel[] getPixelArray() {
		// a one-dimensional array of Pixel objects starting with y=0 to
		// y=height-1 and x=0 to x=width-1.
		int width = getWidth();
		int height = getHeight();
		Pixel[] pixelArray = new Pixel[width * height];

		// loop through height rows from top to bottom
		for (int row = 0; row < height; row++)
			for (int col = 0; col < width; col++)
				pixelArray[row * width + col] = new Pixel(this, col, row);

		return pixelArray;
	}

	/**
	 * Load the buffered image with the passed image
	 * 
	 * @param image
	 *            the image to use
	 */
	// public void load(Image image) {
	// // get a graphics context to use to draw on the buffered image
	// Graphics2D graphics2d = bufferedImage.createGraphics();
	//
	// // draw the image on the buffered image starting at 0,0
	// graphics2d.drawImage(image, 0, 0, null);
	//
	// // show the new image
	// show();
	// }

	/**
	 * Causes this raster image to be displayed graphically on the screen
	 * display device of the runtime platform of the client application.
	 */
	public void show() {
		// if there is a current picture frame then use it
		if (pictureFrame != null)
			pictureFrame.updateImageAndShowIt();

		// else create a new picture frame with this picture
		else
			pictureFrame = new PictureFrame(this);
	}

	/**
	 * Causes this picture to be shown in a new PictureExplorer window.
	 */
	public void explore() {
		// create a copy of the current picture and explore it
		new PictureExplorer(new RasterImage(this));
	}

	/**
	 * This method causes the window which contains this raster image to be
	 * marked that it needs to be redrawn. This window manager polls all of the
	 * currently-open graphical windows for this indication and redraws them
	 * accordingly. Some documentation identifies the repaint() method as
	 * 'causing the image to repaint itself', but this description can be
	 * problematic, since it incorrectly characterizes the window as having a
	 * power or ability that it does not have. Invocation of this method is
	 * often necessary after this raster image's pixels have been modified (but
	 * perhaps not, since this behavious can vary across different windowing
	 * systems).
	 */
	public void repaint() {
		// if there is a picture frame tell it to repaint
		if (pictureFrame != null)
			pictureFrame.repaint();

		// else create a new picture frame
		else
			pictureFrame = new PictureFrame(this);
	}

	/**
	 * Loads the picture from the passed file name, if a picture exists in the
	 * file. If not, this method throws an exception.
	 * 
	 * @param fileName
	 *            the file name to use to load the picture from
	 * @throws Exception
	 *             as described above
	 */
	private void load(String fileName) throws Exception {

		// set the current piture's file name
		this.fileName = fileName;

		// set the extension
		int posDot = fileName.indexOf('.');
		if (posDot >= 0)
			this.fileNameExtension = fileName.substring(posDot + 1);

		// if the current title is null use the file name
		if (theTitle == null)
			theTitle = fileName;

		// try to get the buffered image from the file
		try {
			bufferedImage = ImageIO.read(new File(this.fileName));
			if (bufferedImage == null)
				throw new Exception("null BufferedImage");
			/*
			 * if anything goes wrong tell the user on the console, set the
			 * image to a black image with a message on it, and return false
			 */
		} catch (Exception ex) {
			String MSG = "Couldn't load the file " + this.fileName;
			throw new Exception(MSG);
		}
	}

	/**
	 * Causes the passed string to be added to this raster image, where the
	 * bottom left-hand anchor point of the string will be positioned at the
	 * specified coordinates. The default font is Helvetica, bold, with point
	 * size 16 and color Black. The modified image may need to be redrawn by the
	 * window manager.
	 * 
	 * @param message
	 *            the message to draw on the buffered image
	 * @param xPos
	 *            the leftmost point of the string in x
	 * @param yPos
	 *            the bottom of the string in y
	 */
	public void addMessage(String message, int xPos, int yPos) {
		// get a graphics context to use to draw on the buffered image
		Graphics2D graphics2d = bufferedImage.createGraphics();

		// set the color to white
		graphics2d.setPaint(Color.BLACK);

		// set the font to Helvetica bold style and size 16
		graphics2d.setFont(new Font("Helvetica", Font.BOLD, 16));

		// draw the message
		graphics2d.drawString(message, xPos, yPos);

	}

	/**
	 * Returns a new raster image object that is based on this raster image,
	 * except that the new raster image will be scaled to have the passed
	 * height. The width of the new raster image will be automatically
	 * determined in order to maintain the same aspect ratio.
	 * 
	 * @param height
	 *            the target height of the new raster image, a value that is
	 *            strictly larger than 0
	 * @return as described above
	 */
	public RasterImage createResizedCopy(int height) {
		// set up the scale tranform
		double yFactor = (double) height / this.getHeight();
		AffineTransform scaleTransform = new AffineTransform();
		scaleTransform.scale(yFactor, yFactor);

		// create a new picture object that is the right size
		RasterImage result = new RasterImage((int) (getWidth() * yFactor), (int) (getHeight() * yFactor));

		// get the graphics 2d object to draw on the result
		Graphics2D g2 = result.getGraphics2D();

		// draw the current image onto the result image scaled
		g2.drawImage(this.getImage(), scaleTransform, null);

		return result;
	}

	/**
	 * Causes the contents of this raster image to be written to a file that has
	 * the passed filename and in a image format that is specified by the
	 * extension of the passed filename (such as .bmp or .jpg). If this raster
	 * image cannot be written in the format that is specified in the extension
	 * of the passed filename, then this method will not do anything except
	 * print an informative message to standard output.
	 * 
	 * @param fileName
	 *            the name of the file to which this raster image should be
	 *            written.
	 */
	public void write(String fileName) {
		String extension = this.fileNameExtension; // the default is current

		try {
			// create the file object
			File file = new File(fileName);

			// get the extension
			int posDot = fileName.indexOf('.');
			if (posDot >= 0)
				extension = fileName.substring(posDot + 1);

			// write the contents of the buffered image to the file as jpeg
			ImageIO.write(bufferedImage, extension, file);

		} catch (Exception ex) {
			System.out.println("Couldn't write out the picture to the file " + fileName);
		}

	}

	/**
	 * Method to get the coordinates of the enclosing rectangle after this
	 * transformation is applied to the current picture
	 * 
	 * @return the enclosing rectangle
	 */
	// public Rectangle2D getTranslationEnclosingRectangle(AffineTransform
	// trans) {
	// int width = getWidth();
	// int height = getHeight();
	// double maxX = width - 1;
	// double maxY = height - 1;
	// double minX, minY;
	// Point2D.Double p1 = new Point2D.Double(0, 0);
	// Point2D.Double p2 = new Point2D.Double(maxX, 0);
	// Point2D.Double p3 = new Point2D.Double(maxX, maxY);
	// Point2D.Double p4 = new Point2D.Double(0, maxY);
	// Point2D.Double result = new Point2D.Double(0, 0);
	// Rectangle2D.Double rect = null;
	//
	// // get the new points and min x and y and max x and y
	// trans.deltaTransform(p1, result);
	// minX = result.getX();
	// maxX = result.getX();
	// minY = result.getY();
	// maxY = result.getY();
	// trans.deltaTransform(p2, result);
	// minX = Math.min(minX, result.getX());
	// maxX = Math.max(maxX, result.getX());
	// minY = Math.min(minY, result.getY());
	// maxY = Math.max(maxY, result.getY());
	// trans.deltaTransform(p3, result);
	// minX = Math.min(minX, result.getX());
	// maxX = Math.max(maxX, result.getX());
	// minY = Math.min(minY, result.getY());
	// maxY = Math.max(maxY, result.getY());
	// trans.deltaTransform(p4, result);
	// minX = Math.min(minX, result.getX());
	// maxX = Math.max(maxX, result.getX());
	// minY = Math.min(minY, result.getY());
	// maxY = Math.max(maxY, result.getY());
	//
	// // create the bounding rectangle to return
	// rect = new Rectangle2D.Double(minX, minY, maxX - minX + 1, maxY - minY
	// + 1);
	// return rect;
	// }

	/**
	 * Returns a descriptive string about this raster image which includes this
	 * raster image's height and width and associated filename, if any.
	 * 
	 * 
	 * @return as described above.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	@Override
	public Iterator<Pixel> iterator() {
		List<Pixel> thePixels = new ArrayList<Pixel>();
		// a one-dimensional array of Pixel objects starting with y=0 to
		// y=height-1 and x=0 to x=width-1.
		int width = getWidth();
		int height = getHeight();

		// loop through height rows from top to bottom
		for (int col = 0; col < width; col++)
			for (int row = 0; row < height; row++)
				thePixels.add(new Pixel(this, col, row));
		return thePixels.iterator();
	}

}

/**
 * The class encapsulates a frame that is capable of displaying a
 * DigitalPicture.
 * 
 * This class is based on an original specificaion from Guzdial and Ericson,
 * with explanatory comments and modifications provided by various contributors:
 * mb@cse.yorku.ca
 */
class PictureFrame {

	private JFrame frame = new JFrame();
	private ImageIcon imageIcon = new ImageIcon();
	private JLabel label = new JLabel(imageIcon);
	private RasterImage picture;

	/**
	 * Default constructor that ...
	 * 
	 * A constructor that takes no arguments. This is needed for subclasses of
	 * this class
	 */
	public PictureFrame() {
		// set up the frame
		initFrame();
	}

	/**
	 * Constructs a PictureFrame for the passed DigitalPicture object.
	 * 
	 * @param picture
	 *            the digital picture to display in the picture frame
	 */
	public PictureFrame(RasterImage picture) {
		// set the current object's picture to the passed in picture
		this.picture = picture;

		// set up the frame
		initFrame();
	}

	/**
	 * Set the digital picture to be shown in the this picture frame
	 * 
	 * @param picture
	 *            the digital picture to be shown in this frame
	 */
	// private void setPicture(RasterImage picture) {
	// this.picture = picture;
	// imageIcon.setImage(picture.getImage());
	// frame.pack();
	// frame.repaint();
	// }

	/**
	 * Update this picture frame to show the current digital picture (it may
	 * have been changed since the most recent display)
	 */
	public void updateImage() {
		// only do this if there is a picture
		if (picture != null) {
			// set the image for the image icon from the picture
			Image img = picture.getImage();
			imageIcon.setImage(img);

			// set the title of the frame to the title of the picture
			frame.setTitle(picture.getTitle());

		}
	}

	/**
	 * A method to update the picture frame image with the image in the picture
	 * and show it
	 */
	public void updateImageAndShowIt() {
		// first update the image
		updateImage();

		// now make sure it is shown
		frame.setVisible(true);
	}

	/**
	 * Ensure that this picture frame is shown on the current graphical display.
	 */
	public void displayImage() {
		frame.setVisible(true);
	}

	/**
	 * Ensure that this picture frame is not shown on the current graphical
	 * display.
	 */
	public void hide() {
		frame.setVisible(false);
	}

	/**
	 * Specify whether this picture frame is shown on the current graphical
	 * display or not, as per the passed boolean flag.
	 * 
	 * @param shouldBeShown
	 *            a boolean value that indicates whether this picture frame
	 *            should be shown on not.
	 */
	public void setVisible(boolean shouldBeShown) {
		frame.setVisible(shouldBeShown);
	}

	/**
	 * Causes this picture frame to be closed.
	 */
	public void close() {
		frame.setVisible(false);
		frame.dispose();
	}

	/**
	 * Set the title for the picture frame to be the passed string value.
	 * 
	 * @param title
	 *            as described above
	 */
	public void setTitle(String title) {
		frame.setTitle(title);
	}

	/**
	 * Cause this picture frame to signal to the graphics manager that it needs
	 * to be redrawn at the next opportunity.
	 */
	public void repaint() {

		// make it visible
		frame.setVisible(true);

		// update the image from the picture
		updateImage();

		// tell the JFrame to handle the repaint
		frame.repaint();
	}

	/**
	 * Causes this picture frame to be initialized.
	 */
	private void initFrame() {

		// set the image for the picture frame
		updateImage();

		// add the label to the frame
		frame.getContentPane().add(label);

		// pack the frame (set the size to as big as it needs to be)
		frame.pack();

		// make the frame visible
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}