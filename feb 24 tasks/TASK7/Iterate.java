import java.util.ArrayList;
import java.util.List;

public class Iterate {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Iterating through ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

