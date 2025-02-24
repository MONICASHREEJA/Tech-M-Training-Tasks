import java.util.LinkedList;

public class InsertFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Pineapple");
        list.addLast("Mango");
        System.out.println("After inserting first & last: " + list);
    }
}
