package lessons.lesson_27.task_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers;

        numbers = new int[5];

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {5, 8, 4, 3};

        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        System.out.println("Value in index 3: " + numbers2[2]);

        numbers2 = new int[6];

        System.out.println(Arrays.toString(numbers2));
    }
}
