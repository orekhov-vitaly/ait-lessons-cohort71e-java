package homeworks.homework_38;

/*
Задача 1:
Создайте объект, соответствующий дате и времени Вашего рождения. Если время не знаете, укажите 10 ч, 34 минуты, 56 секунд. Используйте любой класс на Ваше усмотрение.
Создайте объект, который соответствует моменту времени через 5 лет, 3 недели и 9 часов после Вашего рождения.
Выведите оба объекта в консоль.
Проверьте, что второй момент времени наступает действительно после Вашего Дня Рождения.

*** Задача 2 (необязательная, повышенной сложности, для желающих):
Используя форматирование при помощи класса DateTimeFormatter, выведите Вашу дату рождения в консоль по следующему шаблону - "Я родился (родилась) в 1983 году, 12 мая. Это был четверг. На часах было 9 часов 10 минут."
 */

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("=== Task 1 ===");
        LocalDateTime birthday = LocalDateTime.of(1987, Month.NOVEMBER, 9, 10, 34, 56);
        LocalDateTime futureDate = birthday.plusYears(5).plusWeeks(3).plusHours(9);

        System.out.println(birthday);
        System.out.println(futureDate);

        System.out.println(birthday + " раньше чем " + futureDate + "? - " + birthday.isBefore(futureDate));

        System.out.println("\n=== Task 2 ===");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Я родился в yyyy году, d MMMM. Это был EEEE. На часах было H часов m минут.");
        System.out.println(formatter.format(birthday));
    }
}
