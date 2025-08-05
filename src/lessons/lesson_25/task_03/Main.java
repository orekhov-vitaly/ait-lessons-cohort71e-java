package lessons.lesson_25.task_03;

public class Main {
    public static void main(String[] args) {
        Color color = Color.GREEN;

        // color = new Color(); // ограничили создание новых объектов, сделав конструктор прватным

        if (color.equals(Color.GREEN)) {
            System.out.println("GREEN");
        } else if (color.equals(Color.RED)) {
            System.out.println("RED");
        } else if (color.equals(Color.YELLOW)) {
            System.out.println("YELLOW");
        }
    }
}