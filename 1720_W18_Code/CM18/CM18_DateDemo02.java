package CM18;

import java.io.PrintStream;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class CM18_DateDemo02 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		LocalDate nowDate = LocalDate.now();

		output.println("The LocalDate is: " + nowDate.toString());
		output.println("Year: " + nowDate.getYear());
		output.println("Month: " + nowDate.getMonthValue());
		output.println("Month: " + nowDate.getMonth());
		output.println("Day of month: " + nowDate.getDayOfMonth());

	}

}
