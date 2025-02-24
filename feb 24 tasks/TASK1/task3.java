import java.util.Arrays;

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        // Case 1: Simple object comparison
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("Using equals(): " + str1.equals(str2)); // true (checks values)
        System.out.println("Using deepEquals(): " + Arrays.deepEquals(new String[]{str1}, new String[]{str2})); // true

        // Case 2: One-dimensional array comparison
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("\nUsing equals(): " + arr1.equals(arr2)); // false (compares references)
        System.out.println("Using deepEquals(): " + Arrays.deepEquals(new int[][]{arr1}, new int[][]{arr2})); // true

        // Case 3: Multi-dimensional array comparison
        Integer[][] nestedArr1 = {{1, 2, 3}, {4, 5, 6}};
        Integer[][] nestedArr2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("\nUsing equals(): " + nestedArr1.equals(nestedArr2)); // false (compares references)
        System.out.println("Using deepEquals(): " + Arrays.deepEquals(nestedArr1, nestedArr2)); // true (compares values deeply)
    }
}
