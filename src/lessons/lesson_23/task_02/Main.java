package lessons.lesson_23.task_02;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(123254, "Vitalii", 37);

        System.out.println("Данные пользователя: " + person1.getId() + ", " + person1.getName() + ", " + person1.getAge());
    }
}
