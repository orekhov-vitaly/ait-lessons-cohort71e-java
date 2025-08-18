package lessons.lesson_35.task_02;

/*
Написать функцию, которая имитирует бросок игрального кубика,
то есть функция при каждом вызове должна отдавать случайное
 число от 1 до 6
 */

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> throwDice = () -> new Random().nextInt(1, 7);
        for (int i = 0; i < 10; i++) {
            System.out.println("На кубике выпало: " + throwDice.get());
        }
    }
}