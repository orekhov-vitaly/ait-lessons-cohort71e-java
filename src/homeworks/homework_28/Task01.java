package homeworks.homework_28;

/*
Task 1.
- Создайте список названий фруктов и заполните его несколькими значениями (5-10 значений).
- Создайте второй список названий фруктов и при помощи цикла заполните его только теми названиями фруктов из первого списка, длина которых нечётная.
- Выведите оба списка в консоль, проконтролируйте результат.
*/

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Cantaloupe");
        fruits.add("Grapefruit");
        fruits.add("Kiwi");
        fruits.add("Peach");
        fruits.add("Watermelon");
        fruits.add("Apricot");
        fruits.add("Mango");
        fruits.add("Lemons");

        System.out.println(fruits);

        // Variant 1
        List<String> fruitOdd1 = new ArrayList<>();
        for (String item : fruits) {
            if (item.length() % 2 != 0) fruitOdd1.add(item);
        }
        System.out.println("v.1: " + fruitOdd1);

        // Variant 2
        List<String> fruitOdd2 = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).length() % 2 != 0) fruitOdd2.add(fruits.get(i));
        }
        System.out.println("v.2: " + fruitOdd2);
    }
}
