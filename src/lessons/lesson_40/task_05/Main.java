package lessons.lesson_40.task_05;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        Задача: скопировать содержимое файла source.txt в файл target.txt
         */

        try (InputStream inputStream = new FileInputStream("source.txt")) {
            if (inputStream.available() == 0) {
                System.out.println("Файл пустой. Вывод невозможен");
            } else {
                StringBuilder text = new StringBuilder();
                int byteNumber = 0;
                while ((byteNumber = inputStream.read()) != -1) {
                    text.append((char) byteNumber);
                }

                OutputStream outputStream = new FileOutputStream("target.txt");
                outputStream.write(text.toString().getBytes());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
