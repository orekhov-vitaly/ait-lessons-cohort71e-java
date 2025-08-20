package homeworks.homework_36;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private Specialty specialty;

    public Student(String name, int age, Specialty specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
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

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && specialty == student.specialty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, specialty);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialty=" + specialty +
                '}';
    }
}
