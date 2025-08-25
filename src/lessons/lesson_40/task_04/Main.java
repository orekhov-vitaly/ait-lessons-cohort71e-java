package lessons.lesson_40.task_04;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        /*
        Задача: информация о документе находится в файле в виде:
        003|   CREATED|Invoice
        Нужно вывести на экран сведенья о названии документа и го номер:
        Invoic 003
        Статус отображать в выводе не нужно.
         */

        try (InputStream inputStream = new FileInputStream("document.txt")) {
            if (inputStream.available() == 0) {
                System.out.println("Файл пустой. Вывод невозможен");
            } else {
                StringBuilder docNumber = new StringBuilder();
                for (int i = 0; i < 3; i++) {
                    docNumber.append((char) inputStream.read());
                }
                // System.out.println(docNumber);

                inputStream.skip(12);
                StringBuilder docTitle = new StringBuilder();
                int charNumber = 0;
                while ((charNumber = inputStream.read()) != -1) {
                    docTitle.append((char) charNumber);
                }
                // System.out.println(docTitle);

                StringBuilder result = new StringBuilder(docTitle + " " + docNumber);
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
