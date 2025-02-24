import java.util.LinkedList;

public class Append {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Cherry"));
        list.add("Orange");
        System.out.println("After appending: " + list);
    }
}
