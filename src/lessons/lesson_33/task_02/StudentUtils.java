package lessons.lesson_33.task_02;

import java.util.List;

public class StudentUtils {
    public static void printFilterStudents(List<Student> students, Filter filter) {
        for (Student student : students) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }
}
