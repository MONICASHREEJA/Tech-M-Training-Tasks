import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseList {
    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>(originalList); 
        Collections.reverse(reversedList); 
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(21, 22, 23, 24, 25);
        System.out.println("Original Integer List: " + intList);
        System.out.println("Reversed Integer List: " + reverseList(intList));

        List<String> stringList = List.of("apple", "banana", "cherry");
        System.out.println("\nOriginal String List: " + stringList);
        System.out.println("Reversed String List: " + reverseList(stringList));

        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4);
        System.out.println("\nOriginal Double List: " + doubleList);
        System.out.println("Reversed Double List: " + reverseList(doubleList));
    }
}
