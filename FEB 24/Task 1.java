//task1
import java.util.Arrays;

public class AlternateElementsCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int newSize = (originalArray.length + 1) / 2;
        int[] alternateArray = new int[newSize];
        int index = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            alternateArray[index++] = originalArray[i];
        }
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Alternate Elements Array: " + Arrays.toString(alternateArray));
    }
}
