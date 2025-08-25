package lessons.lesson_40.task_03;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        Прочитать первую букву из файла text40.txt и вывести на экран.
        При этом поток ввода после работы с ним нужно закрыть.
         */

        /*
        Конструкция try-с-ресурсами нужна для того, чтобф какой-то открытый внешний
        ресурс автоматически закрывался, когда мы с ним поработали. Ресурс будет
        закрыт гарантированно, независимо от того, произошла ли ошибка при работе
        блока try или блок try отработал успешно
        Это нам позволит не писать блок finally и не вызывать явно метод close()

        Ограничение: в этой конструкции можно использовать только те ресурсы,
        которые реализуют интерфейс Closeable или Autocloseable
         */

        File file = new File("text40.txt");
        boolean isFileExist = file.exists();

        InputStream outerIn = null;

        if (isFileExist) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (InputStream in = new FileInputStream(file)) {
                outerIn = in;
                System.out.println((char) in.read());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        /*
        При помощи следующего кода мы убедимся, что поток действительно был закрыт после выполнения предыдущей конструкции
         */

        try {
            System.out.println((char) outerIn.read());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
