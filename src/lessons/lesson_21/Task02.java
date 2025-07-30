package lessons.lesson_21;

/*
Создать метод, который может возвращать сумму чисел, при этом количество
чисел, которое будет передано заранее, неизвестно
 */

public class Task02 {
    public static void main(String[] args) {
        System.out.println(getSum(5));
        System.out.println(getSum(5, 5, 6, 8));
        System.out.println(getSum());
        System.out.println(getSum(-5, -7));
    }

    public static int getSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
