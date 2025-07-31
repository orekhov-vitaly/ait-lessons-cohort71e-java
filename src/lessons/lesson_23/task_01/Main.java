package lessons.lesson_23.task_01;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(123254, "Vitalii", 37);
        System.out.println("Данные пользователя: " + person1.getId() + ", " + person1.getName() + ", " + person1.getAge());

        person1.setAge(31);
        System.out.println("Новый возраст пользователя: " + person1.getAge());

        person1.greeting();
    }
}
