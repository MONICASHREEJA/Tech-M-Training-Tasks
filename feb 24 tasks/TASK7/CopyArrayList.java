import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(java.util.List.of("Red", "Blue", "Green"));
        ArrayList<String> new_color = new ArrayList<>(colors);
        System.out.println("Copied ArrayList: " + new_color);
    }
}
