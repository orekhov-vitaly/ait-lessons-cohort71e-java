package homeworks.homework_34;

/*
Напишите функцию (используя интерфейс Function), которая на вход принимает целое число, затем высчитывает квадрат этого числа и возвращает строку типа "Квадрат числа x равен y". Примечание: вместо x и y должны быть числа
Используйте, получившийся метод apply несколько раз с разными входными значениями
 */

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        MyFunction function = x -> {
            Integer pow = x * x;
            String result = "Квадрат числа " + x + " равен "+ pow;
            return result;
        };

        System.out.println(function.getResult(2));
        System.out.println(function.getResult(-5));
        System.out.println(function.getResult(128));
    }
}
