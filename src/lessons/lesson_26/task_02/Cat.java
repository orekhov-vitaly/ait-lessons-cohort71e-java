package lessons.lesson_26.task_02;

public class Cat {
    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void celebrateBirthday() {
        System.out.println("У кота День Рождения!!!");
        age++;
    }
}
