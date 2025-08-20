package homeworks.homework_36;

/*
Создать класс Student.
Каждый студент должен иметь имя, возраст и специальность, на которой учится студент.
В методе main создать список студентов и наполнить его 5-10 объектами студентов
Сгруппировать всех студентов по специальности и вывести результат в консоль
Высчитать средний возраст всех студентов и вывести результат в консоль
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 20, Specialty.ENGINEER));
        students.add(new Student("Max", 37, Specialty.DEVELOPER));
        students.add(new Student("Smith", 25, Specialty.HISTORIAN));
        students.add(new Student("Anna", 24, Specialty.ENGINEER));
        students.add(new Student("Den", 30, Specialty.DEVELOPER));
        students.add(new Student("Jack", 24, Specialty.HISTORIAN));
        students.add(new Student("Nick", 28, Specialty.ENGINEER));
        students.add(new Student("July", 25, Specialty.DEVELOPER));

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("Группировка по специальности:");
        Map<Specialty, List<Student>> studentsBySpecialty = students
                .stream()
                .collect(Collectors.groupingBy(x -> x.getSpecialty()));
        System.out.println(studentsBySpecialty);

        System.out.println();

        double averageAge = students
                .stream()
                .mapToDouble(x -> x.getAge())
                .average()
                .orElse(0.0);
        System.out.println("Средний возраст студентов - " + averageAge);
    }
}
