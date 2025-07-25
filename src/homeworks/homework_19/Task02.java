package homeworks.homework_19;

/*
Создайте массив, который состоит из нескольких положительных целых чисел.
Напишите программу, которая определяет и выводит на экран максимальное из этих чисел.
*/

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 2, 3, 9, 4, 3, 4, 65, 4, 19, 7, 2, 1, 5, 7, 12, 54, 15, 8, 42, 12};

        System.out.println(Arrays.toString(numbers));

        int maxNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println(maxNumber);
    }
}
