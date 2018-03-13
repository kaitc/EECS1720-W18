package CM18;

import java.io.PrintStream;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class CM18_DateDemo03 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		LocalTime nowTime = LocalTime.now();

		output.println("The LocalTime is: " + nowTime.toString());
		output.println("Hour: " + nowTime.getHour());
		output.println("Minute: " + nowTime.getMinute());
		output.println("Second: " + nowTime.getSecond());
		output.println("Nano: " + nowTime.getNano());


	}

}
