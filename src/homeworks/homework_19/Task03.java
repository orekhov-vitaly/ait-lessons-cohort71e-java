package homeworks.homework_19;

/*
Напишите программу, которая находит в созданном заранее массиве целых чисел максимальное и минимальное значения и меняет их местами.
*/

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 2, 3, 9, 4, 3, 4, 65, 4, 19, 7, 2, 1, 5, 7, 12, 54, 15, 8, 42, 12};

        System.out.println(Arrays.toString(numbers));

        int maxNumber = numbers[0];
        int maxNumberIndex = 0;
        int minNumber = numbers[0];
        int minNumberIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxNumberIndex = i;
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                minNumberIndex = i;
            }
        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);

        numbers[minNumberIndex] = maxNumber;
        numbers[maxNumberIndex] = minNumber;

        System.out.println(Arrays.toString(numbers));
    }
}
