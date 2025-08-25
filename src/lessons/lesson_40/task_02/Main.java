package lessons.lesson_40.task_02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        Прочитать первую букву из файла text40.txt и вывести на экран.
        При этом поток ввода после работы с ним нужно закрыть.
         */

        File file = new File("text40.txt");
        boolean isFileExist = file.exists();

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileInputStream in = null;

        try {
            // Способ 1. При помощи имени файла
            //FileInputStream in = new FileInputStream("text40.txt");

            // Способ 2. При помощи объекта класса File
            in = new FileInputStream(file);

            System.out.println((char) in.read());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
