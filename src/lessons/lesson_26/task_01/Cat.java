package lessons.lesson_26.task_01;

public class Cat {
    private String color;
    private int age;
    private double weight;

    public static int pawsCount = 4;

    public Cat(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }
     public void play() {
         System.out.println(color + " кот играет");
     }

     public static void printInfo() {
         System.out.println("Все коты любят покушать");
     }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
