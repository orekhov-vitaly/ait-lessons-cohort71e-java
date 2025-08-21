package homeworks.homework_37.task_01;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 27, "test@mail.com", "+491512345678");

        System.out.println(person1);

        person1.setEmail("new.email@mail.com");
        person1.setEmail("");
        System.out.println(person1);
    }
}
