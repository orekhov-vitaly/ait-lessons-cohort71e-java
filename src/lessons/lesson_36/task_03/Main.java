package lessons.lesson_36.task_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Создать класс Employee и создать коллекцию из объектов этого класса
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Александр", "Разработчик", 1200));
        employees.add(new Employee("Василий", "Тестировщик", 1100));
        employees.add(new Employee("Наталья", "Разработчик", 1050));
        employees.add(new Employee("Елена", "Аналитик", 1030));
        employees.add(new Employee("Борис", "Аналитик", 800));
        employees.add(new Employee("Пётр", "Разработчик", 1100));
        employees.add(new Employee("Иван", "Тестировщик", 1150));
        employees.add(new Employee("Аркадий", "Аналитик", 950));
        employees.add(new Employee("Ольга", "Тестировщик", 970));

        employees.forEach(System.out::println);
        System.out.println();

        // 2. Сгруппировать сотрудников по должности
        Map<String, List<Employee>> employeesByPosition = employees
                .stream()
                .collect(Collectors.groupingBy(x -> x.getPosition()));
        System.out.println(employeesByPosition);

        double averageSalary = employees
                .stream()
                .mapToDouble(x -> x.getSalary())
                .average()
                .orElse(0.0);
        System.out.println("Средняя ЗП: " + averageSalary);

        List<Employee> employeesWithBigSalary = employees
                .stream()
                .filter(x -> x.getSalary() > 1000)
                .toList();
        employeesWithBigSalary.forEach(System.out::println);
    }
}
