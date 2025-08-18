package homeworks.homework_30;

/*
Создать сет имён студентов - Jack, John, Ada, Bill, Leon, John.
Определить размер сета и вывести размер в консоль. Почему размер не соответствует количеству добавленных элементов? Напишите ответ в комментарии.
Добавить в сет нового студента Jenna и результат добавления записать в boolean переменную. Был ли добавлен студент? Вывести результат в консоль.
Определить, есть ли в сете студент Leon.
Определить, есть ли в сете студент Samantha.
Вывести каждое имя студента сета в консоль с новой строки при помощи for-each.
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class Task01 {
    public static void main(String[] args) {
        Set students = new LinkedHashSet();

        students.add("Jack");
        students.add("John");
        students.add("Ada");
        students.add("Bill");
        students.add("Leon");
        students.add("John");

        System.out.println(students.size()); // Set хранит только уникальные элементы, а имя John у нас повторяется, поэтому в сэте сохранено 5 элементов

        System.out.println("Есть ли в сете студент Leon? - " + students.contains("Leon"));
        System.out.println("Есть ли в сете студент Samanta? - " + students.contains("Samanta"));

        for (Object name : students) {
            System.out.println(name);
        }
    }
}
