import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(java.util.List.of("Red", "Blue", "Green"));
        System.out.println("Is blue present? " + colors.contains("Blue"));
    }
}
