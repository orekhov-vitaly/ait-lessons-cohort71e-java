package lessons.lesson_28.task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // add(value)
        numbers.add(7);
        numbers.add(2);
        numbers.add(10);
        numbers.add(22);
        System.out.println(numbers.add(9));

        System.out.println(numbers);

        String listAsString = numbers.toString();
        System.out.println(listAsString);

        // add(index, value)
        numbers.add(2, 20);
        System.out.println(numbers);

        // set(index; value)
        numbers.set(1, 45);
        System.out.println(numbers);

        System.out.println(numbers.set(0, 100));

        System.out.println(numbers.get(4));
        // System.out.println(numbers.get(8)); // Error
    }
}
