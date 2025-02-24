import java.util.List;

public class TargetSearch{
        public static <T> int findFirstOccurrence(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;             }
        }
        return -1;     }

    public static void main(String[] args) {
        List<Integer> intList = List.of(10, 20, 30, 40, 50, 20);
        System.out.println("Index of 20 in Integer List: " + findFirstOccurrence(intList, 20));
    
        List<String> stringList = List.of("apple", "banana", "cherry", "pineapple");
        System.out.println("Index of 'banana' in String List: " + findFirstOccurrence(stringList, "banana"));

        List<Double> doubleList = List.of(10.1, 12.5, 53.3, 94.24);
        System.out.println("Index of 5.5 in Double List: " + findFirstOccurrence(doubleList, 5.5));
    }
}
