import java.util.List;

public class GenericSum {
    public static <T extends Number> void calculateSum(List<T> numbers) {
        int evenSum = 0, oddSum = 0;

        for (T num : numbers) {
            int value = num.intValue(); 
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Integer List:");
        calculateSum(intList);

        List<Double> doubleList = List.of(1.2, 2.8, 3.6, 4.5, 5.1);
        System.out.println("\nDouble List:");
        calculateSum(doubleList);
    }
}
