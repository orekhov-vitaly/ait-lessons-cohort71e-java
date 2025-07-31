package homeworks.homework_22;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Smith", 5, "test@mail.com", "+491234567890");
        System.out.println(person1.toString());

        person1.setEmail("smith@gmail.com");
        System.out.println(person1.toString());
    }
}
