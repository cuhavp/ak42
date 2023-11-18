package specs.theIntenet;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class Debug {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochMilli(1699692197764L);
        ZoneId zoneId = ZoneId.systemDefault(); // Use the system default time zone
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        System.out.println(localDate); // Output: 2021-06-29

    }
}
