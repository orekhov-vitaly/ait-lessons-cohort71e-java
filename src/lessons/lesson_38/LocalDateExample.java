package lessons.lesson_38;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        // LocalDate.now()
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println();

        // LocalDate.of()
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 10);
        System.out.println(date);

        System.out.println();

        // .get...()
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());

        System.out.println();

        //
        currentDate = currentDate.plusDays(2).minusWeeks(3).plusYears(1);
        System.out.println(currentDate);
    }
}
