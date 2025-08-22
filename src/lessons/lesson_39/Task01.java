package lessons.lesson_39;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        if (name.contains("Егор")) {
            System.out.println("Привет, " + name + "! Давно не виделись");
        } else {
            System.out.println("Я давно вас ждала, " + name);
        }
    }
}
