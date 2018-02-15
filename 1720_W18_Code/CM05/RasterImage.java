package CM05;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RasterImage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// here we instantiate a Circle object
		Circle myCircle = new Circle();

		// here we see that Circle HAS-A fill color
		// the aggregated part is referenced by the variable 'fillColour'
		Paint fillColour = myCircle.getFill();
		System.out.println("Color object's fill: " + fillColour);

		// here we dereference myCircle, so this object is orphaned
		myCircle = null;
		// here we invoke the garbage collector, so the orphaned object FOR SURE
		// gets removed
		System.gc();

		// now we check whether the aggregated part has been destroyed as well.
		// If it has, then the value of the reference will be null
		System.out.println("Color object's fill: " + fillColour);

		stop();
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void stop() {
		Platform.exit();
	}

}
