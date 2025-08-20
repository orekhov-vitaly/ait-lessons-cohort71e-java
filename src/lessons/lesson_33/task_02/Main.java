package lessons.lesson_33.task_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Василий", 25, 5, 4.1, Degree.BACHELOR));
        students.add(new Student("Александр", 31, 1, 4.34, Degree.MASTER));
        students.add(new Student("Петр", 22, 2, 4.65, Degree.BACHELOR));
        students.add(new Student("Иван", 27, 4, 3.98, Degree.BACHELOR));
        students.add(new Student("Ольга", 21, 3, 4.23, Degree.BACHELOR));
        students.add(new Student("Артем", 29, 1, 3.74, Degree.MASTER));
        students.add(new Student("Николай", 34, 2, 4.7, Degree.MASTER));

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

//        for (Student student : students) {
//            Filter filter = new FilterByAge();
//            if (filter.test(student)) {
//                System.out.println(student);
//            }
//        }

        StudentUtils.printFilterStudents(students, new FilterByAge());

        StudentUtils.printFilterStudents(students, new FilterByCourseAndRate());

        System.out.println("Длина имени больше 5:");

        StudentUtils.printFilterStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().length() > 5;
            }
        });

        StudentUtils.printFilterStudents(students, student -> student.getAge() % 2 != 0);
    }
}
