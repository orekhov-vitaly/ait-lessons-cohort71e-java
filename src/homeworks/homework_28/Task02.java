package homeworks.homework_28;

/*
Task 2.
- Создайте список чисел и заполните его несколькими значениями (5-10 значений).
- Создайте целочисленную переменную и при помощи цикла запишите в неё сумму всех элементов списка.
- Выведите в консоль список и значение переменной, проконтролируйте результат.
*/

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int)(Math.random() * 100));
        }

        System.out.println(numbers);

        // Variant 1
        int result1 = 0;
        for (int num : numbers) {
            result1 += num;
        }
        System.out.println("Sum (v.1): " + result1);

        // Variant 2
        int result2 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result2 += numbers.get(i);
        }
        System.out.println("Sum (v.2): " + result2);
    }
}
