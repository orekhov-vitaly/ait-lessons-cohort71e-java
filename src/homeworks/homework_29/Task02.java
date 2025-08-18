package homeworks.homework_29;

/*
Создайте список чисел - 4, 8, 7, 10, 2, 9, 11, 5, 8, 0, 5. Выведите его в консоль.
Двигаясь по списку, найдите число, которое больше 10.
Удалите из списка все чётные числа перед этим числом. Снова выведите список в консоль.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task02 {
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

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 10) {
                while (iterator.hasPrevious()) {
                    number = iterator.previous();
                    if (number % 2 == 0) {
                        iterator.remove();
                    }
                }
                break;
            }
        }

        System.out.println(numbers);
    }
}
