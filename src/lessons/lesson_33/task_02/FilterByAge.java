package lessons.lesson_33.task_02;

public class FilterByAge implements Filter{
    @Override
    public boolean test(Student student) {
        return student.getAge() > 25;
    }
}
