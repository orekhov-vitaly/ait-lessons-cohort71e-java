package lessons.lesson_20;

/*
Задача 1: написать метод, который считает сумму элементов массива.
Задача 2: написать метод, который считает сумму элементов массива
начиная с определённой ячейки
 */

public class Task03 {
    public static void main(String[] args) {
        int[] numbers = {9, 4, 5, 6};
        System.out.println("Сумма всех элементов массива: " + getSum(numbers));
        System.out.println("Сумма элементов массива, начиная с индекса 2: " + getSum(numbers, 2));
    }

    public static int getSum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static int getSum(int[] numbers, int start) {
        int result = 0;
        for (int i = start; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }
}
