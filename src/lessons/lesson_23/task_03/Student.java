package lessons.lesson_23.task_03;

public class Student extends Human {
    String schoolName;
    int course;

    public void study() {
        System.out.println("Студент учится");
    }

    @Override
    public void sleep() {
        System.out.println("Студент спит");
    }

    @Override
    public void run() {
        System.out.println("Студент бежит");
    }
}
