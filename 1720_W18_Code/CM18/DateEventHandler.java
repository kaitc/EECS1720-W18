package CM18;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.DatePicker;

public class DateEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() instanceof DatePicker) {
			DatePicker datePicker = (DatePicker) event.getSource();
			LocalDate selectedDate = datePicker.getValue();
			System.out.println("Selected Date is: " + selectedDate.toString());
		}
	}

}
