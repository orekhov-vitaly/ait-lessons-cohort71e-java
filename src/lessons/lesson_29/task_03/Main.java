package lessons.lesson_29.task_03;

import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(6);
        numbers.add(12);
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);

        System.out.println(numbers);

        Enumeration<Integer> enumeration = numbers.elements();

        while (enumeration.hasMoreElements()) {
            Integer currentElement = enumeration.nextElement();
            System.out.print(currentElement + " ");
        }
    }
}
