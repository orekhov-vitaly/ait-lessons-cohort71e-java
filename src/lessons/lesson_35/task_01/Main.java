package lessons.lesson_35.task_01;

/*
Задача: написать метод, который на вход принимает массив строк,
преобразует этот массив в сет, при этом попутно обрабатывая
каждый элемент массива переданной функцией
Пример:
[AAA, BBBBB, CC, BBBBB] -> Set [AAAAAA, BBBBBBBBBB, CCCC]
[AAA, BBBBB, CC, BBBBB] -> Set [AAA 3, BBBBB 5, CC 2]
 */

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String[] array = {"AAA", "BBBBB", "CC", "BBBBB"};
        Set<String> result1 = generateSetFromArray(array, x -> x + x);
        Set<String> result2 = generateSetFromArray(array, x -> x + " " + x.length());
        System.out.println("First Set: " + result1);
        System.out.println("Second Set: " + result2);

        Set<String> result3 = generateSetFromArray(array, Function.identity());
        System.out.println(result3);
    }

    public static Set<String> generateSetFromArray(String[] array, Function<String, String> function) {
        Set<String> result = new LinkedHashSet<>();
        for (String element : array) {
            String processedElement = function.apply(element);
            result.add(processedElement);
        }
        return result;
    }
}
