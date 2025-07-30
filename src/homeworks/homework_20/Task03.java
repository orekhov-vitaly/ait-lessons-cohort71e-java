package homeworks.homework_20;

/*
Напишите программу, которая помогает пользователю рассчитать общую стоимость поездки на автомобиле.
Программа должна запрашивать у пользователя информацию о расстоянии до пункта назначения, расходе топлива на 100 км,
цене топлива за литр и выводить итоговую стоимость поездки. Программа должна использовать методы и конкатенацию строк.
Создайте метод getTripInfo(), который будет: Запрашивать у пользователя расстояние до пункта назначения (в км), расход
топлива на 100 км (в литрах) и цену топлива за литр. Сохранять эти данные в отдельные переменные. Вызывать метод
calculateFuelCost(double distance, double fuelConsumption, double fuelPrice), который будет: Возвращать общую стоимость
топлива для поездки. Затем метод getTripInfo() должен вызвать метод generateTripReport(double distance, double
fuelConsumption, double fuelPrice, double totalCost), который будет: Выводить отчёт о стоимости поездки, используя
конкатенацию строк.
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        getTripInfo();
    }

    public static void getTripInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите расстояние до пункта назначения:");
        double distance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Укажите расходе топлива на 100 км:");
        double fuelConsumption = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Укажите цену топлива:");
        double fuelPrice = scanner.nextDouble();
        scanner.nextLine();

        double totalCost = calculateFuelCost(distance, fuelConsumption, fuelPrice);
        generateTripReport(distance, fuelConsumption, fuelPrice, totalCost);
    }

    public static double calculateFuelCost(double distance, double fuelConsumption, double price) {
        return distance / 100 * (fuelConsumption * price);
    }

    public static void generateTripReport(double distance, double fuelConsumption, double fuelPrice, double totalCost) {
        String info = "Расстояние до пункта назначения: " + distance + " км\n" +
                "Расход топлива: " + fuelConsumption + " л на 100 км\n" +
                "Цена топлива: " + fuelPrice + " евро за литр\n" +
                "Общая стоимость топлива для поездки: " + totalCost + " евро";
        System.out.println(info);
    }
}
