package lessons.lesson_39.task_04;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        boolean isExist = file.exists();
        System.out.println("Существует ли файл? " + isExist);

        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println("Был ли создан файл? " + isFileCreated);

            File animalsDir = new File("./animals");
            boolean isDirCreated = animalsDir.mkdir();

            File catsText = new File(animalsDir, "cat.txt");
            catsText.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Теперь файл должен быть. " + file.exists());

    }
}
