import java.util.ArrayList;
import java.util.List;

public class MergeList {
        public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size(), size2 = list2.size();
        int i = 0;
        while (i < size1 || i < size2) {
            if (i < size1) mergedList.add(list1.get(i));
            if (i < size2) mergedList.add(list2.get(i));
            i++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> intList1 = List.of(1, 3, 5);
        List<Integer> intList2 = List.of(2, 4, 6, 8, 10);
        System.out.println("Merged Integer List: " + mergeAlternating(intList1, intList2));

        List<String> stringList1 = List.of("A", "C", "E");
        List<String> stringList2 = List.of("B", "D", "F", "G");
        System.out.println("Merged String List: " + mergeAlternating(stringList1, stringList2));

        List<Double> doubleList1 = List.of(1.1, 3.3);
        List<Double> doubleList2 = List.of(2.2, 4.4, 5.5);
        System.out.println("Merged Double List: " + mergeAlternating(doubleList1, doubleList2));
    }
}
