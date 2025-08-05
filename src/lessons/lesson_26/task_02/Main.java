package lessons.lesson_26.task_02;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(3);

        System.out.println("Возраст кота: " + cat1.getAge());

        cat1.celebrateBirthday();

        System.out.println("Возраст кота: " + cat1.getAge());

        System.out.println("=========\n");

        MyNumber myNumber = new MyNumber(4);
        System.out.println("My number: " + myNumber);

        myNumber.increase();
        System.out.println("My number: " + myNumber);

        myNumber.decrease();
        System.out.println("My number: " + myNumber);

        System.out.println("=========\n");

        int i1 = 7;
        Integer i2 = 7;

        System.out.println(i1);
        System.out.println(i2);

        System.out.println("=========\n");

        byte b = i2.byteValue();

        System.out.println(b);
    }
}
