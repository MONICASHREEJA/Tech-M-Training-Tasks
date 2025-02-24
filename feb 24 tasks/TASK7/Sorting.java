import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(java.util.List.of("Yellow", "Blue", "Green", "Red"));
        Collections.sort(colors);
        System.out.println("Sorted ArrayList: " + colors);
    }
}
