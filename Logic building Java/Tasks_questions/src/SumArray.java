public class SumArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        int sum = calculateSum(array);
        System.out.println("The sum of all integers in the array is: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
