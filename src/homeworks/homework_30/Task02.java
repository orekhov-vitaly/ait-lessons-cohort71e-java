package homeworks.homework_30;

/*
Создать лист элементов - AAA, BBB, CCC, DDD, EEE.
Создать второй лист элементов - DDD, EEE, FFF, GGG.
Написать метод, который на вход принимает оба этих листа и возвращает результирующий лист, содержащий элементы обоих листов, но без дубликатов - AAA, BBB, CCC, DDD, EEE, FFF, GGG.
Написать метод, который на вход принимает оба этих листа и возвращает результирующий лист, содержащий только те элементы, которые содержатся в обоих листах - DDD, EEE.
В обоих случаях исходные листы изменяться не должны.
 */

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("AAA", "BBB", "CCC", "DDD", "EEE"));
        List<String> list2 = new ArrayList<>(List.of("DDD", "EEE", "FFF", "GGG"));

        System.out.println("Список 1: " + list1);
        System.out.println("Список 2: " + list2);

        System.out.println("Уникальные элементы: " + getUniqueList(list1, list2));
        System.out.println("Пересечение элементов: " + getIntersectionList(list1, list2));
        System.out.println("Не повторяющиеся элементы: " + getDifferenceList(list1, list2));

        System.out.println("Исходный список 1: " + list1);
        System.out.println("Исходный список 2: " + list2);
    }

    public static List<String> getUniqueList(List<String> list1, List<String> list2) {
        Set<String> resultSet = new LinkedHashSet<>(list1);
        resultSet.addAll(list2);
        return new ArrayList<>(resultSet);
    }

    public static List<String> getIntersectionList(List<String> list1, List<String> list2) {
        Set<String> resultSet = new LinkedHashSet<>(list1);
        resultSet.retainAll(list2);
        return new ArrayList<>(resultSet);
    }

    public static List<String> getDifferenceList(List<String> list1, List<String> list2) {
        List<String> newSet1 = new ArrayList<>(list1);
        List<String> newSet2 = new ArrayList<>(list2);
        newSet1.removeAll(list2);
        newSet2.removeAll(list1);
        newSet1.addAll(newSet2);
        return newSet1;
    }
}
