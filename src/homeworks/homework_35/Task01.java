package homeworks.homework_35;

/*
Создайте лист чисел и заполните его произвольными значениями от 0 до 20 (10 значений).
Получите новый список, в котором содержатся числа в порядке убывания.
Получите новый список, в котором содержатся 3 самых больших числа.
Получите новый список, в котором содержится 3-е и 4-е число из исходного списка.
Задание должно быть решено при помощи стримов.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(new Random().nextInt(21));
        }

        System.out.println(numbers);

        List<Integer> numbers1 = numbers
                .stream()
                .sorted((x,y) -> y - x)
                .toList();
        System.out.println("Числа в порядке убывания: " + numbers1);

        List<Integer> numbers2 = numbers
                .stream()
                .sorted((x,y) -> y - x)
                .limit(3)
                .toList();
        System.out.println("3 самых больших числа: " + numbers2);

        List<Integer> numbers3 = numbers
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println("3-е и 4-е число из исходного списка: " + numbers3);
    }
}
