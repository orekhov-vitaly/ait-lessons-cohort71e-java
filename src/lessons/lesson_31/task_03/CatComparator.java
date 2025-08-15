package lessons.lesson_31.task_03;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat firsCat, Cat secondCat) {
        return Double.compare(firsCat.getWeight(), secondCat.getWeight());
    }

}
