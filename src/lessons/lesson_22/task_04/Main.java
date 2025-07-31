package lessons.lesson_22.task_04;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Red", 15);

        parrot.setWords(20);
        System.out.println(parrot.getWords());

        // parrot.color = "Blue";

        parrot.setWords(25);
        System.out.println(parrot.getWords());
    }
}
