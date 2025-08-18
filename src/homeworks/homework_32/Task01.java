package homeworks.homework_32;

/*
Task 1
Создайте коллекцию, которая содержит пары значений Имя студента - Средний балл студента (дробные значения).
Наполните коллекцию несколькими парами значений (от 8 до 10).
Выведите в консоль средний балл любого из студентов.
Измените средний балл этого же студента, а затем выведите новое значение в консоль.
Проверьте, содержится ли в коллекции студент с любым именем на Ваш выбор.

Task 2
Увеличьте средний балл всех студентов с нечётной длиной имени на 0,2 (можно в цикле обращаться к объекту пары и сеттить в неё новое значение).
Посчитайте среднее значение среднего балла для всех студентов и выведите его в консоль.
 */

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        Map<String, Double> students = new HashMap<>();
        students.put("John", 4.3);
        students.put("Max", 3.8);
        students.put("Smith", 5.0);
        students.put("Anna", 4.7);
        students.put("Den", 4.1);
        students.put("Jack", 3.1);
        students.put("Nick", 4.3);
        students.put("July", 2.5);
        students.put("Kat", 4.9);
        students.put("Jahn", 4.0);

        System.out.println("=== Task 1 ===");

        System.out.println("Средний балл студента: Max - " + students.get("Max"));

        students.put("Max", 4.2);

        System.out.println("Средний балл студента: Max - " + students.get("Max"));

        System.out.println("Есть ли студент Anna? - " + students.containsKey("Anna"));
        System.out.println("Есть ли студент Vitalii? - " + students.containsKey("Vitalii"));

        System.out.println("\n=== Task 2 ===");
        double averagePoint = 0;
        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.print(student.getKey() + ": " + student.getValue() + " -> ");
            student.setValue(student.getValue() + 0.2);
            System.out.println(student.getValue());
            averagePoint += student.getValue();
        }
        averagePoint = averagePoint / students.size();
        System.out.println("Средний балл: " + averagePoint);
    }
}
