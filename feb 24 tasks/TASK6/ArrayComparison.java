import java.util.Arrays;

public class ArrayComparison {
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 5, 4};
        System.out.println("Equal? " + areArraysEqual(intArray1, intArray2));
        System.out.println("Equal? " + areArraysEqual(intArray1, intArray3));

    }
}
