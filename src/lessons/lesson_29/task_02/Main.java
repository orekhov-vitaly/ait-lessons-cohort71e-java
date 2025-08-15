package lessons.lesson_29.task_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Cantaloupe");
        fruits.add("Grapefruit");
        fruits.add("Kiwi");
        fruits.add("Pear");
        fruits.add("Peach");
        fruits.add("Watermelon");
        fruits.add("Apricot");
        fruits.add("Mango");
        fruits.add("Lemons");

        System.out.println(fruits);

        // Удалить из списка все названия на букву P

//        for (int i = 0; i < fruits.size(); i++) {
//            while(fruits.get(i).startsWith("P")) {
//                fruits.remove(i);
//            }
//        }

//        for (String fruit : fruits) {
//            if(fruit.startsWith("P")){
//                fruits.remove(fruit);
//            }
//        }

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement.startsWith("P")) {
                iterator.remove();
            }
        }

        System.out.println(fruits);
    }
}
