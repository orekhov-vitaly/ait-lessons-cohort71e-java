package homeworks.homework_31;

import java.util.Comparator;

public class ParrotComparator implements Comparator<Parrot> {
    @Override
    public int compare(Parrot o1, Parrot o2) {
        return Integer.compare(o1.getWordsCount(), o2.getWordsCount());
    }
}
