package lessons.lesson_38;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        LocalDateTime date1 = LocalDateTime.of(2030, Month.AUGUST, 22, 9, 12, 55);
        System.out.println(date1);

        Locale russianLocale = new Locale("ru");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("", russianLocale);
    }
}
