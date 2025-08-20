package lessons.lesson_33.task_02;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int course;
    private double averageRate;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
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
