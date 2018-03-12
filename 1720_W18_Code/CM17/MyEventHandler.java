package CM17;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("I am handling an event by printing this string to the console!");
	}

}
