package homeworks.homework_23;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 27, "test@mail.com", "+491512345678");

        System.out.println(person1.toString());

        person1.setEmail("new.email@mail.com");
        System.out.println(person1.toString());
    }
}
