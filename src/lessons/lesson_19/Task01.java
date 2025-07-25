package lessons.lesson_19;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int a = 7;

        int[] numbers = new int[5];

        numbers[2] = 20;

        System.out.println(numbers[2]);

        boolean[] booleans = new boolean[5];
        System.out.println("Значение ячейки 5 массива booleans: " + booleans[4]);

        String[] words = new String[7];
        System.out.println("Значение ячейки 6 массива words: " + words[5]);

        System.out.println("Значение переменной a: " + a);
        System.out.println("Значение переменной numbers: " + numbers);

        String arrayAsString = Arrays.toString(numbers);
        System.out.println("Массив в виде строки: " + arrayAsString);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(booleans));

        double[] doubleNumbers = {5.4, 2.37, 7, 10.6, 4};

        System.out.println("Вывести последний элемент массива: " + doubleNumbers[doubleNumbers.length - 1]);
        System.out.println(Arrays.toString(doubleNumbers));

        String[] wordsArray = {"Hello", "I", "study", "Python"};

        System.out.println(Arrays.toString(wordsArray));

        wordsArray[3] = "Java";

        System.out.println(Arrays.toString(wordsArray));
    }
}
