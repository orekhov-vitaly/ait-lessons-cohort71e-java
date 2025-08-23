package homeworks.homework_39;

/*
2. Задача 2:
Создайте в корне проекта файл cat.txt.
Поместите в файл вручную следующую информацию: Hello! I am cat! My name is Jasper. I like to eat and my human named Eva.
Создайте поток ввода из этого файла.
Пропустите 36 байт информации из файла (метод skip).
Следующие 7 байт преобразуйте в символы и выведите в консоль в одну строку.
Создайте второй поток ввода из этого же файла.
При помощи второго потока пропустите 28 байт, затем в эту же строку выведите 2 следующих символа, пропустите 40 байт, и ещё 2 символа выведите в эту же строку.
Какая строка у Вас получилась? Помимо кода приложите скриншот с полученной строкой к домашнему заданию.
 */

import java.io.*;

public class Task02 {
    public static void main(String[] args) {
        String fileName = "cat.txt";
        File file = new File(fileName);
        boolean isFileExist = file.exists();

        if (!isFileExist) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            isFileExist = file.exists();
        }

        if (isFileExist) {
            try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
                String message = "Hello! I am cat! My name is Jasper. I like to eat and my human named Eva.";
                outputStream.write(message.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                int byteData;
                inputStream.skip(36);
                for (int i = 0; i < 7; i++) {
                    byteData = inputStream.read();
                    System.out.print((char) byteData);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
