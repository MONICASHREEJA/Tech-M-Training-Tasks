import java.util.LinkedList;
import java.util.Arrays;

public class MultipleInsertion {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana"));
        list.addAll(1, Arrays.asList("Strawberry", "Blueberry"));
        System.out.println("After inserting multiple: " + list);
    }
}
