import java.util.List;

public class AverageStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(19, 60, 36, 84);
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0); 
        System.out.println("Average: " + average);
    }
}
