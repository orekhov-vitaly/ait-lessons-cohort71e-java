package lessons.lesson_35.task_03;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(6, 17, 4, 12, 15, 7, 2, 14, 8));

        System.out.println("Original list: " + numbers);

        // Необходимо получить новый список чисел, но только тех, которые больше 10
        /*
        .stream()
        .filter()
        .toList()
         */

        List<Integer> filterNumbers = numbers
                .stream()
                .filter(i -> i > 10)
                .toList();

        System.out.println("Filtered list: " + filterNumbers);
        System.out.println("Original list: " + numbers);

        List<Integer> sortedNumbers = numbers
                .stream()
                .sorted()
                .toList();

        System.out.println("Sorted list: " + sortedNumbers);

        List<Cat> cats = List.of(
                new Cat("Black", 5, 7),
                new Cat("Gray", 2, 4),
                new Cat("Ginger", 7, 3),
                new Cat("White", 3, 7),
                new Cat("Braun", 1, 8)
        );
        System.out.println("Original cats list:");
        cats.forEach(i -> System.out.println(i));
        System.out.println();

        List<Cat> sortedCats = cats
                .stream()
                .sorted()
                .toList();
        sortedCats.forEach(i -> System.out.println(i));
        System.out.println();

        sortedCats = cats
                .stream()
                .sorted((cat1, cat2) -> Double.compare(cat2.getWeight(), cat1.getWeight()))
                .toList();
        sortedCats.forEach(i -> System.out.println(i));
        System.out.println();

        // Необходимо получить новый список чисел - отсортированный и содержать значения меньше 10

        List<Integer> sortedAndFilteredNumbers = numbers
                .stream()
                .filter(x -> x < 10)
                .sorted()
                .toList();
        System.out.println("Отсортированный и отфильтрованный список: " + sortedAndFilteredNumbers);

        // .limit(count)

        List<Integer> limitNumbers = numbers
                .stream()
                .sorted()
                .limit(3)
                .toList();
        System.out.println(limitNumbers);

        List<Integer> skipNumbers = numbers
                .stream()
                .sorted((x,y) -> y - x)
                .skip(2)
                .sorted()
                .toList();
        System.out.println(skipNumbers);
    }
}
