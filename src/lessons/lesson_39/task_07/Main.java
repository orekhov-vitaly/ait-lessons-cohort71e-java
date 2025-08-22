package lessons.lesson_39.task_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("text.txt")) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Запись файла
        try (FileOutputStream outputStream = new FileOutputStream("text.txt")) {
            String message = "Hello from Java";
            outputStream.write(message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
