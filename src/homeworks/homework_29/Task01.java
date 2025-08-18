package homeworks.homework_29;

/*
Создайте список чисел - 4, 8, 7, 10, 2, 9, 11, 5, 8, 0, 5. Выведите его в консоль.
Удалите из списка все числа, которые делятся нацело на 5. Снова выведите список в консоль.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(7);
        numbers.add(10);
        numbers.add(2);
        numbers.add(9);
        numbers.add(11);
        numbers.add(5);
        numbers.add(8);
        numbers.add(0);
        numbers.add(5);

        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number !=0 && number % 5 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
