package homeworks.homework_31;

import java.util.Comparator;

public class ParrotComparator implements Comparator<Parrot> {
    @Override
    public int compare(Parrot parrot1, Parrot parrot2) {
        return Integer.compare(parrot1.getWordsCount(), parrot2.getWordsCount());
    }
}
