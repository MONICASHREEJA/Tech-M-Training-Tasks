import java.util.LinkedList;

public class GetElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Cherry"));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}
