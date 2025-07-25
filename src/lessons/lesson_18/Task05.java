package lessons.lesson_18;

// Задача: есть два числа - 5 и 10.
// Сохранить эти числа в переменных.
// Запросить у пользователя тип операции, который нужно провести с этими числами.
// Если тип - "sum" - нужно сложить числа.
// Если тип - "mul" - нужно умножить числа.
// Если тип - "pow sum" - нужно первое число возвести в квадрат, а затем сложить эти числа.
// И каждый из результатов нужно при этом выводить на экран.
// Если пользователь ввёл некорректное наименование операции, вывести на экран фразу о том,
// что операция некорректна.

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 5;
        int number2 = 10;

        System.out.println("Числа 5 и 10");
        System.out.println("Укажите тип операции, который надо провести с этими числами (sum, mul, pow sum):");
        String operator = scanner.nextLine();

        switch (operator) {
            case "pow sum":
                number1 *= number1;
            case "sum":
                System.out.println(number1 + number2);
                break;
            case "mul":
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Операция некорректна");
        }
    }
}
