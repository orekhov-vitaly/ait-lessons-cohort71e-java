package lessons.lesson_20;

/*
Задача: написать метод, который на вход принимает число,
и если оно чётное, то возвращает это же число увеличенное на 1.
А если число нечетное, возвращает квадрать этого числа
 */

public class Task02 {
    public static void main(String[] args) {
        System.out.println(incrementOrPow(5));
        System.out.println(incrementOrPow(4));
    }

    public static int incrementOrPow(int num) {
        if (num % 2 == 0) return ++num;
        return num*num;
    }
}
