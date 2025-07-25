package homeworks.homework_18;

/*
Напишите программу, которая выводит в консоль числа от 20 до 10 включительно
*/

public class Task02 {
    public static void main(String[] args) {
        int count = 20;

        while (count >= 10) {
            System.out.println(count--);
        }
    }
}
