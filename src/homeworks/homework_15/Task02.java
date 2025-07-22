package homeworks.homework_15;

/*
 Бананы стоят 11 у.е., яблоки - 8 у.е. Вам нужно купить два килограмма бананов и три килограмма яблок.
 Сохраните все эти данные в переменных. Напишите программу, которая выводит на экран сколько денег вам понадобится
 */

public class Task02 {
    public static void main(String[] args) {
        double bananaPrice = 11;
        double applePrice = 8;
        double bananaQuantity = 2;
        double appleQuantity = 3;

        double bananaAmount = bananaPrice * bananaQuantity;
        double appleAmount = applePrice * appleQuantity;

        double totalAmount = bananaAmount + appleAmount;

        System.out.println(totalAmount);
    }
}
