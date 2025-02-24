import java.util.ArrayList;

public class Update {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(java.util.List.of("Red", "Blue", "Green"));
        colors.set(1, "Black");
        System.out.println("After updating: " + colors);
    }
}
