package CM18;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class ColourEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() instanceof ColorPicker) {
			ColorPicker colourPicker = (ColorPicker) event.getSource();
			Color selectedColour = colourPicker.getValue();
			System.out.println("Colour chosen:" + selectedColour);

		}
	}

}
