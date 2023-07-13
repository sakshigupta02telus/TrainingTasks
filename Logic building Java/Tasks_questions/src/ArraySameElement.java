import java.util.Arrays;
public class ArraySameElement {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        boolean result = areArraysEqual(array1, array2);

        if (result) {
            System.out.println("The arrays contain the same elements.");
        } else {
            System.out.println("The arrays do not contain the same elements.");
        }
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if the arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays element by element
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
