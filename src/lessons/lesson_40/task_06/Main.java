package lessons.lesson_40.task_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Задача: записать в файл target.txt только первое предложение из файла source.txt. При этом мы не знаем длину предложения и не знаем на какой точно знак препинания заканчивается.
         */

        try (
                InputStream in = new FileInputStream("source.txt");
                OutputStream out = new FileOutputStream("target.txt");
        ) {
            List<Character> endSentenceSymbols = List.of('.', '!', '?');

            while (true) {
                 int data = in.read();

                 if (data == -1) {
                     break;
                 }

                 char symbol = (char) data;

                 out.write(data);

                 if (endSentenceSymbols.contains(symbol)) {
                     break;
                 }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
