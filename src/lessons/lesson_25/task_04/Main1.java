package lessons.lesson_25.task_04;

public class Main1 {
    public static void main(String[] args) {
        Planet planet = Planet.SATURN;

        switch (planet) {
            case JUPITER:
                System.out.println("Это планета: " + planet.getRussianName());
                System.out.println("Она газовый гигант: " + planet.isGasGiant());
                break;
            case SATURN:
                System.out.println("Это планета: " + planet.getRussianName());
                System.out.println("Она газовый гигант: " + planet.isGasGiant());
                break;
            case URANUS:
                System.out.println("Это планета: " + planet.getRussianName());
                System.out.println("Она газовый гигант: " + planet.isGasGiant());
                break;
            case NEPTUNE:
                System.out.println("Это планета: " + planet.getRussianName());
                System.out.println("Она газовый гигант: " + planet.isGasGiant());
                break;
            default:
                System.out.println("Планета не является газовым гигантом");
        }
    }
}
