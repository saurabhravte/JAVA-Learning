import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class WorldCupSchedule {
    static void main() {
        LocalDate finalMatchDate = LocalDate.of(2026,7,19);
        LocalDate today = LocalDate.of(2026,7,16);

        System.out.println(today);

        Period daysUntilFinal = Period.between(today,finalMatchDate);
        System.out.println(daysUntilFinal);

        LocalDateTime kickOff = LocalDateTime.of(2026,7,19,18,0);
        LocalDateTime fullTime = LocalDateTime.of(2026,7,19,19,0);
        Duration matchLength = Duration.between(kickOff,fullTime);
//        System.out.println(matchLength);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm");
        System.out.println(kickOff.format(formatter));
        System.out.println("Match Length: " + matchLength.toHours() + " hours, " + matchLength.toMinutes() + " mins." );

    }
}
