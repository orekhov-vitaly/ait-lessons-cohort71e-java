package lessons.lesson_28.task_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");

        list2.add("D");
        list2.add("F");

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        // size
        System.out.println("Size list1: " + list1.size());
        System.out.println("Size list2: " + list2.size());

        // addAll
        list1.addAll(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        // removeAll
        list1.removeAll(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        // clear
        list2.clear();
        System.out.println("list2: " + list2);

        // contains
        System.out.println("Contains A in list1: " + list1.contains("A"));
        System.out.println("Contains A in list1: " + list1.contains("L"));

        // indexOf
        System.out.println("Index C: " + list1.indexOf("C"));

        // Вывести все элементы списка и пронумеровать
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + 1 + ". " + list1.get(i));
        }

        for (String letter : list1) {
            System.out.println(letter);
        }

        for (int i = list1.size() - 1; i >= 0; i-=2) {
            System.out.println(list1.get(i));
        }
    }
}
