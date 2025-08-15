package lessons.lesson_29.task_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Apricot");
        fruits.add("Cantaloupe");
        fruits.add("Grapefruit");
        fruits.add("Apricot");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Peach");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Lemons");

        ListIterator<String> listIterator = fruits.listIterator();

        while (listIterator.hasNext()) {
            String currentFruit = listIterator.next();
            if (currentFruit.startsWith("B")) {
                listIterator.add("Pineapple");

                while (listIterator.hasPrevious()) {
                    currentFruit = listIterator.previous();
                    if (currentFruit.startsWith("A")) {
                        listIterator.remove();
                    }
                }
                break;
            }
        }

        System.out.println(fruits);
    }
}
