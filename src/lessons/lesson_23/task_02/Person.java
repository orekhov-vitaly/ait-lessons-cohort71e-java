package lessons.lesson_23.task_02;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            System.out.println("Имя не введено");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else if (age > 200) {
            System.out.println("Укажите возраст меньше 200");
        } else {
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greeting() {
        System.out.println("Привет, меня зовут " + name);
    }
}
