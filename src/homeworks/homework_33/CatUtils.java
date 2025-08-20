package homeworks.homework_33;

import java.util.List;

public class CatUtils {
    public static void printFilterCats(List<Cat> cats, Filter filter) {
        for (Cat cat : cats) {
            if (filter.filter(cat)) {
                System.out.println(cat);
            }
        }
        System.out.println();
    }
}
