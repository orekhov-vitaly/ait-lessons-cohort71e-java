package lessons.lesson_33.task_02;

public class FilterByCourseAndRate implements Filter{
    @Override
    public boolean test(Student student) {
        return student.getCourse() > 2 && student.getAverageRate() > 4;
    }
}
