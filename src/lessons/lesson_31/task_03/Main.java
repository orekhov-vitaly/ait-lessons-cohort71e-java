package lessons.lesson_31.task_03;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat("Black", 5, 6.28));
        cats.add(new Cat("Ginger", 2, 7.23));
        cats.add(new Cat("White", 7, 5.18));
        cats.add(new Cat("White", 7, 5.18));
        cats.add(new Cat("Braun", 4, 4.59));
        cats.add(new Cat("Gray", 9, 8.48));

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("==========");

        Set<Cat> cats1 = new TreeSet<>(new CatComparator());
        cats1.add(new Cat("Black", 5, 6.28));
        cats1.add(new Cat("Ginger", 2, 7.23));
        cats1.add(new Cat("White", 7, 5.18));
        cats1.add(new Cat("White", 7, 5.18));
        cats1.add(new Cat("Braun", 4, 4.59));
        cats1.add(new Cat("Gray", 9, 8.48));
        for (Cat cat : cats1) {
            System.out.println(cat);
        }

        Set<Cat> cats2 = new TreeSet<>();
    }
}
