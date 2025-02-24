import java.util.List;
import java.util.List;

public class CountStrings {
    public static void main(String[] args) {
        List<String> words = List.of("elephant", "peacock", "tiger", "dog");
        char targetLetter = 'p';
        long count = words.stream().filter(word -> word.startsWith(String.valueOf(targetLetter))).count();

        System.out.println("Number of words starting with '" + targetLetter + "': " + count);
    }
}
