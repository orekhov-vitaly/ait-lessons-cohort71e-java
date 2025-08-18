package lessons.lesson_34.task_02;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // На базе созданного функционального интерфейса реализовать: принимает число, выводит его на экран, округляет и возвращает

        // Вариант 1
        MyFunction function = x -> {
            System.out.println("Переданное значение - " + x);
            return Math.round(x);
        };

        Long result = function.getResult(5.2);
        System.out.println(result);

        result = function.getResult(5.5);
        System.out.println(result);

        // Вариант 2
        Function<Double, Long> function1 = x -> {
            System.out.println("Переданное значение - " + x);
            return Math.round(x);
        };

        result = function1.apply(4.3);
        System.out.println(result);

        result = function1.apply(4.6);
        System.out.println(result);
    }
}
