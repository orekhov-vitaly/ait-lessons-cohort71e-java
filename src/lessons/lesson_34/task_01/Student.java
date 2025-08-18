package lessons.lesson_34.task_01;

import java.util.Objects;

public class Student {
    // Имя студента
    private String name;

    // Возраст студента
    private int age;

    // Курс, на котором учится студент
    private int course;

    // Средний балл
    private double averageRate;

    // Учёная степень, на которую обучается студент
    private Degree degree;

    public Student(String name, int age, int course, double averageRate, Degree degree) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.averageRate = averageRate;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public Degree getDegree() {
        return degree;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Double.compare(averageRate, student.averageRate) == 0 && Objects.equals(name, student.name) && degree == student.degree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, averageRate, degree);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageRate=" + averageRate +
                ", degree=" + degree +
                '}';
    }
}
