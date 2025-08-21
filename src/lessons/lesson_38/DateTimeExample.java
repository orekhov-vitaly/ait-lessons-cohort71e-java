package lessons.lesson_38;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class DateTimeExample {
    public static void main(String[] args) {
        /*
        Пустой конструктор создаёт объект времени, соответствующий текущему моменту времени
         */
        Date currentDate = new Date();
        System.out.println(currentDate);

        Date secondDate = new Date();
        System.out.println(secondDate);

        boolean result = currentDate.equals(secondDate);
        System.out.println(result);

        System.out.println();

        System.out.println("Сколько миллисекунд прошло с 1 января 1970 года?");
        System.out.println(currentDate.getTime());
        System.out.println(secondDate.getTime());

        System.out.println();

        Date date = new Date(100_000_000_000L);
        System.out.println(date);

        Date date2 = new Date(-100_000_000_000L);
        System.out.println(date2);

        Date date3 = new Date(-100_000_000_000L);
        System.out.println(date2.equals(date3));

        /*
        Задача: создать объект момента времени, который произойдёт в будущем
        ровно через 5 минут 20 секунд после текущего момента времени
         */

        currentDate = new Date();
        long millisec = currentDate.getTime();
        millisec += (5 * 60 + 20) * 1000;
        Date futureDate = new Date(millisec);
        System.out.println(currentDate);
        System.out.println(futureDate);

        System.out.println();

        result = currentDate.before(futureDate);
        System.out.println("Момент currentDate наступил перед моментом futureDate? - " + result);

        result = futureDate.before(currentDate);
        System.out.println("Момент futureDate наступил перед моментом currentDate? - " + result);

        System.out.println();

        result = currentDate.after(futureDate);
        System.out.println("Момент currentDate наступил после моментом futureDate? - " + result);

        result = futureDate.after(currentDate);
        System.out.println("Момент futureDate наступил после моментом currentDate? - " + result);

        System.out.println();

        System.out.println(currentDate.compareTo(futureDate));
        System.out.println(futureDate.compareTo(currentDate));
        System.out.println(currentDate.compareTo(currentDate));

        System.out.println();

        Set<Date> dates = new TreeSet<>();
        dates.add(new Date(100_000_000_000L));
        dates.add(new Date(50_000_000_000L));
        dates.add(new Date(30_000_000_000L));
        dates.add(new Date(500_000_000_000L));
        dates.add(new Date(900_000_000_000L));

        System.out.println("Отсортированные даты");
        dates.forEach(System.out::println);
    }
}
