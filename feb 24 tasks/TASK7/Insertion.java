import java.util.LinkedList;

public class Insertion {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana"));
        list.add(1, "Grapes");
        System.out.println("After inserting: " + list);
    }
}
