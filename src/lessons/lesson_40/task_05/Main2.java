package lessons.lesson_40.task_05;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        /*
        Задача: скопировать содержимое файла source.txt в файл target.txt
         */

        try (
                InputStream inputStream = new FileInputStream("source.txt");
                BufferedInputStream in = new BufferedInputStream(inputStream);
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("target.txt", true));
        ) {
            byte[] data = in.readAllBytes();
            out.write(data);
            String symbol = "\n";
            out.write(symbol.getBytes());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
