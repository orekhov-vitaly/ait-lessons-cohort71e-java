package lessons.lesson_39.task_06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("text.txt");
            int data = in.read();
            char firstSymbol = (char) data;
            System.out.println(firstSymbol);

            System.out.println((char) in.read());
            System.out.println((char) in.read());
            System.out.println((char) in.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
