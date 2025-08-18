package lessons.lesson_34.task_01;

import java.util.ArrayList;
import java.util.List;

import static lessons.lesson_34.task_01.StudentUtils.printFilteredStudents;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Василий", 25, 5, 4.1, Degree.BACHELOR));
        students.add(new Student("Александра", 31, 1, 4.34, Degree.MASTER));
        students.add(new Student("Пётр", 22, 2, 4.65, Degree.BACHELOR));
        students.add(new Student("Иван", 27, 4, 3.98, Degree.BACHELOR));
        students.add(new Student("Ольга", 21, 3, 4.23, Degree.BACHELOR));
        students.add(new Student("Артём", 29, 1, 3.74, Degree.MASTER));
        students.add(new Student("Николай", 34, 2, 4.7, Degree.MASTER));

        System.out.println("Список всех студентов:");
        for (Student student : students){
            System.out.println(student);
        }

        System.out.println("Студенты, длина имени которых больше 5:");
        printFilteredStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().length() > 5;
            }
        });

        printFilteredStudents(students, student -> student.getAge() % 2 != 0);

        // Создать объект студента и проверить, что студент учится на бакалавра и его возраст больше 25

        Student student = new Student("Рита", 26, 5, 4.4, Degree.BACHELOR);
        System.out.println(student);
        // Для проверки студента нам необходим метод test, мы используем лямбда-выражение
        Filter filter = x -> x.getDegree().equals(Degree.BACHELOR) && x.getAge() > 25;
        System.out.println("Студент учится на бакалавра и он старше 25 лет? - " + filter.test(student));

        printFilteredStudents(students, filter);
    }
}
