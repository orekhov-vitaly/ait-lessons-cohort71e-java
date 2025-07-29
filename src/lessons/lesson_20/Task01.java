package lessons.lesson_20;

public class Task01 {
    public static void main(String[] args) {
        int[] numbers1 = {7, 3, 5, 10};
        int[] numbers2 = {2, 5, 3};

        calculationSum1(numbers1);
        System.out.println("Sum - " + calculationSum2(numbers1));

        calculationSum1(numbers2);
        System.out.println("Sum - " + calculationSum2(numbers2));
    }

    public static void calculationSum1(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println("Sum - " + result);
    }

    public static int calculationSum2(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
