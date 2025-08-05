package lessons.lesson_26.task_04;

public class Dog implements Cloneable{
    private String color;
    private int age;

    public Dog(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
