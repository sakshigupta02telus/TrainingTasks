public class ProductArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        int product = calculateProduct(array);
        System.out.println("The product of all integers in the array is: " + product);
    }

    public static int calculateProduct(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }
}
