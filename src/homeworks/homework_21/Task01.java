package homeworks.homework_21;

/*
Задача 1:
Создать объект StringBuilder.
Наполнить строку именами студентов (5-7 имён) через пробел.
Вывести строку в консоль.
*/

public class Task01 {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();

        names
                .append("John")
                .append(" ")
                .append("Max")
                .append(" ")
                .append("Maria")
                .append(" ")
                .append("Hanna")
                .append(" ")
                .append("Johan")
                .append(" ")
                .append("Stefan")
                .append(" ")
                .append("Denis");

        System.out.println(names);
    }
}
