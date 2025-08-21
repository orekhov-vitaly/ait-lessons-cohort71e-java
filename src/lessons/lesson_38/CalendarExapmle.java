package lessons.lesson_38;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarExapmle {
    public static void main(String[] args) {
        System.out.println("=== GregorianCalendar(), getInstance() ===");
        // 1. variant
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);

        // 2. variant
        calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println();
        System.out.println("=== SimleDateFormator ===");
        SimpleDateFormat formatter = new SimpleDateFormat("'Сегодня' EEEE, d MMMM y 'г.'");
        Date date = calendar.getTime();
        String dateAsString = formatter.format(date);
        System.out.println(dateAsString);

        // 3. variant
        System.out.println(formatter.format(calendar.getTime()));

        System.out.println();

        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));

        System.out.println();

        calendar.set(Calendar.YEAR, 2030);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DATE, 10);

        System.out.println(formatter.format(calendar.getTime()));
    }
}
