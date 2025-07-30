package homeworks.homework_21;

/*
Задача 2:
Создать объект StringBuilder со строкой на ваше усмотрение
Вывести длину строки в консоль
Добавить новый символ с кодом 244 в конец строки
Вывести строку в консоль.
*/

public class Task02 {
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

        names.appendCodePoint(244);

        System.out.println(names);
    }
}
