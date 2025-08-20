package lessons.lesson_36.stream_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPart2 {
    public static void main(String[] args) {
        List<String> fruits = List.of("Яблоко", "Ананас", "Персик", "Яблоко", "Банан", "Банан");

        /*
        Task 1.
        Получить список фруктов без повторов
         */
        System.out.println("=== Task 1 ===");
        // .distinct() - удаляет дубликаты
        List<String> uniqueFruits = fruits
                .stream()
                .distinct()
                .toList();

        System.out.println("Исходный список:");
        System.out.println(fruits);
        System.out.println("Уникальные фрукты:");
        System.out.println(uniqueFruits);

        /*
        Task 2.
        Получить сортированный список фруктов, при этом, как промежуточный результат, вывести на экран фрукт так, чтобы отображалось количество букв в названии фрукта
         */
        // .peek()
        System.out.println("\n=== Task 2 ===");
        List<String> sortedFruits = fruits
                .stream()
                .sorted()
                .peek(x -> System.out.println(x + " " + x.length()))
                .toList();
        System.out.println("Отсортированный список: " + sortedFruits);

        /*
        Task 3.
        Необходимо преобразовать список строк в список чисел
         */
        // .map()
        System.out.println("\n=== Task 3 ===");
        List<String> stringNumbers = List.of("7", "4", "10", "5", "1");

        List<Integer> numbers = stringNumbers
                .stream()
                .map(x -> Integer.parseInt(x))
                .toList();

        System.out.println("Исходный список чисел: " + stringNumbers);
        System.out.println("Новый список чисел: " + numbers);

        /*
        Task 4.
        Посчитать средний вес котов
         */
        System.out.println("\n=== Task 4 ===");
        Cat[] catsArray = {
                new Cat("Черный", 5, 4.72),
                new Cat("Белый", 2, 5.12),
                new Cat("Рыжий", 8, 3.98),
                new Cat("Коричневый", 3, 6.52),
                new Cat("Серый", 4, 7.18)
        };

        double averageCatsWeight = Arrays.stream(catsArray)
                .mapToDouble(x -> x.getWeight())
                .average()
                .orElse(0.0);

        System.out.println("Средний вес котов: " + averageCatsWeight);
    }
}
