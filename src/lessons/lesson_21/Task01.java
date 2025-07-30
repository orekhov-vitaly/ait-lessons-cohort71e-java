package lessons.lesson_21;

public class Task01 {
    public static void main(String[] args) {
        // Задача: создать метод, который высчитывает и возвращет сумму целых чисел
        // или вещественных

        int x1 = 5;
        int x2 = 10;

        double y1 = 4.5;
        double y2 = 7.35;

        System.out.println("Sum x1 and x2 = " + getSum(x1, x2));
        System.out.println("Sum y1 and y2 = " + getSum(y1, y2));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
}
