package lessons.lesson_31.task_02;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);

        System.out.println(numbers);

        Integer number1 = 5;
        Integer number2 = 8;
        Integer number3 = 5;

        int result = number1.compareTo(number2);
        System.out.println("5 and 8: " + result);

        result = number2.compareTo(number1);
        System.out.println("8 and 5: " + result);

        result = number1.compareTo(number3);
        System.out.println("5 and 5: " + result);
    }
}
