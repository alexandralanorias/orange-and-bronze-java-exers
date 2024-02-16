// Local Arrival date & Time

// by Alexandra Lanorias
// February 16, 2024

// Implement the arrival(..) method that returns the local arrival date & time. The local arrival date & time should be the time in 
// the time zone that the system is running, not the time in the time zone departure.

/*
    static LocalDateTime arrival (ZonedDateTime departure, Duration flightTime) {
        // add your code here
    }

    public static void main(String[] args) {
	    ZonedDateTime harareDeparture = ZonedDateTime.of(
		    LocalDateTime.of(2015, DECEMBER, 1, 9, 15),
		    ZonedId.of("Africa/Harare"));
	    Duration harareFlightTime = Duration.ofHours(20);
	    LocalDateTime arrival = arrival(harareDeparture, harareFlightTime);
	    System.out.println(arrival); // 2015-12-02T11:15
    }
*/

import java.time.*;
import static java.time.Month.*;

public class local_arrival_date_and_time {
    static LocalDateTime arrival(ZonedDateTime departure, Duration flightTime) {
        LocalDateTime arrivalTime = departure.toLocalDateTime().plus(flightTime);
        ZoneId systemTimeZone = ZoneId.systemDefault();
        ZonedDateTime arrivalInSystemTimeZone = arrivalTime.atZone(departure.getZone()).withZoneSameInstant(systemTimeZone);

        return arrivalInSystemTimeZone.toLocalDateTime();
    }

    public static void main(String[] args) {
        ZonedDateTime harareDeparture = ZonedDateTime.of(
                LocalDateTime.of(2015, DECEMBER, 1, 9, 15),
                ZoneId.of("Africa/Harare"));
        Duration harareFlightTime = Duration.ofHours(20);
        LocalDateTime arrival = arrival(harareDeparture, harareFlightTime);
        System.out.println(arrival); // 2015-12-02T11:15
    }
}