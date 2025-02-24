import java.util.ArrayList;

public class Removal {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(java.util.List.of("Red", "Blue", "Green", "Yellow"));
        colors.remove(2);
        System.out.println("After removing third element: " + colors);
    }
}
