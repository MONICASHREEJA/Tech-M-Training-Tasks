import java.util.Arrays;

public class AlternateElementsCopy {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the size of the new array (every second element)
        int newSize = (originalArray.length + 1) / 2;

        // Create the new array
        int[] alternateArray = new int[newSize];

        // Copy alternate elements
        int index = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            alternateArray[index++] = originalArray[i];
        }

        // Print the original and new array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Alternate Elements Array: " + Arrays.toString(alternateArray));
    }
}
