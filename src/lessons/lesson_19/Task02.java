package lessons.lesson_19;

public class Task02 {
    public static void main(String[] args) {
        // Задача: вывести на экран все числа от 0 до 4

        // Способ 1. Решение через цикл while
        int i = 0;
        while (i <= 4) {
            System.out.println(i);
            i++;
        }

        System.out.println("=====");

        // Способ 2. Решение через цикл for
        for (int j = 0; j <= 4; j++) {
            System.out.println(j);
        }
    }
}
