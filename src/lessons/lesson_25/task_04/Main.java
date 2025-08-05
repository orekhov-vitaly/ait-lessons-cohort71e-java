package lessons.lesson_25.task_04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Planet[] solarSystem = Planet.values();

        System.out.println("Список всех планет");
        System.out.println(Arrays.toString(solarSystem));

        for (Planet currentPlanet : solarSystem) {
            int order = currentPlanet.ordinal();
            System.out.println(order);
        }

        Planet planet = Planet.valueOf("EARTH");
        System.out.println(planet);
    }
}
