import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, AssignmentsApp!\n");

        //Output the current date-time.
        LocalDateTime today = LocalDateTime.now();
        System.out.println("\nThe current date-time is " + today);

        //Output tomorrow's date using a formatter.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = today.format(formatter);
        System.out.println("Tomorrow's formatted date is " + formatDateTime);

        //Add 5 weeks to today's LocalDateTime.
        LocalDateTime fiveWeeksLater = addWeeksToDate(today, 5);
        System.out.println("The five weeks, the date will be " + fiveWeeksLater);

    }

    private static LocalDateTime addWeeksToDate(LocalDateTime date, long numWeeks) {
        return date.plusWeeks(5);
    }
}
