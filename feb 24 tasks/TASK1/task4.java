import java.util.Arrays;

public class ArrayCopyRangeExample {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Copy a range from index 2 (inclusive) to 6 (exclusive)
        int[] copiedArray = Arrays.copyOfRange(originalArray, 2, 6);

        // Print results
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array (Index 2 to 5): " + Arrays.toString(copiedArray));
    }
}
