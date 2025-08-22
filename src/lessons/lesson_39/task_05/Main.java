package lessons.lesson_39.task_05;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File shipsDir = new File("ships");
        boolean isShipsDirCreated = shipsDir.mkdir();
        boolean isShipsDirExist = shipsDir.exists();

        if (isShipsDirCreated || isShipsDirExist) {
            try {
                File file1 = new File(shipsDir, "titanic.txt");
                file1.createNewFile();
                File file2 = new File(shipsDir, "aurora.txt");
                file2.createNewFile();

                for (int i = 1; i <= 50; i++) {
                    File dir = new File(shipsDir, "folder" + i);
                    boolean isCreated = dir.mkdir();
                }

                for (int i = 1; i <= 50; i++) {
                    File dir = new File(shipsDir, "folder" + i);
                    boolean isCreated = dir.delete();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
