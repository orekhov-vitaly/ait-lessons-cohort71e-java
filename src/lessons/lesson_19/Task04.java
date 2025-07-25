package lessons.lesson_19;

//        Задача: найти первое попавшееся отрицательное число в массиве
// и вывести его на экран

public class Task04 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2, -2, 0, -12, 78, -9};

        for (int number : numbers) {
            if (number < 0) {
                System.out.println(number);
                break;
            }
        }
    }
}
