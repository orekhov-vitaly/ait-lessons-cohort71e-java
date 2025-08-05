package lessons.lesson_25.task_02;

public class Main {
    public static void main(String[] args) {
        // Color color = new Color(); - мы не можем создавать объекты перечислений при помощи стандартного способа и ключевого слова new.

        Color color = Color.RED;
        System.out.println("Цвет в переменной color: " + color);

        color = Color.GREEN;
        System.out.println("Цвет в переменной color: " + color);

        System.out.println("\n==========\n");

        Lights trafficLights1 = new Lights("M342TL", "Völklinger Str. 37", Color.GREEN);
    }
}
