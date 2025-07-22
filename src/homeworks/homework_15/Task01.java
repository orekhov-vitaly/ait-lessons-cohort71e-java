package homeworks.homework_15;

/*
Исходные данные: конфета стоит 3 у.е., у Вас есть 27 у.е.
Напишите программу, которая сохраняет эти данные в переменных, вычисляет и выводит в консоль, сколько конфет Вы можете купить.
* */

public class Task01 {
    public static void main(String[] args) {
        int candyPrice = 3;
        int balance = 27;
        int candies = balance / candyPrice;

        System.out.println("Сколько конфет Вы можете купить? - " + candies + " шт.");
    }
}
