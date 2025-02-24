import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(java.util.List.of("Red", "Blue", "Green", "Yellow"));
        Collections.shuffle(colors);
        System.out.println("Shuffled ArrayList: " + colors);
    }
}
