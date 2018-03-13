package CM18;

import java.io.PrintStream;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class CM18_DateDemo01 {

	public static void main(String[] args) {
		PrintStream output = System.out;

		Instant nowInstant = Instant.now();

		output.println("The Instant is:\t" + nowInstant.toString());

		output.println("sec since epoch:\t" + nowInstant.getEpochSecond());
		output.println("msec at this instant:\t" + System.currentTimeMillis());

		// here is the older way to do it
		output.println();
		Date today = new Date();
		output.println("msec since epoch: \t" + today.getTime());

	}

}
