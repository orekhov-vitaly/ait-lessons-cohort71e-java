package lessons.lesson_34.task_01;

import java.util.List;

public class StudentUtils {

    public static void printFilteredStudents(List<Student> students, Filter filter){

        for (Student student : students){
            if (filter.test(student)){
                System.out.println(student);
            }
        }
        System.out.println();

    }
}
