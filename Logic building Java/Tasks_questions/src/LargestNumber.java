public class LargestNumber {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;
        int c = 19;

        int larger = findLargestNumber(a, b, c);

        System.out.println("The larger number is: " + larger);
    }

    public static int findLargestNumber(int a, int b, int c) {
        int larger = a; // Assume a is the largest number initially

        if (b > larger) {
            larger = b;
        }

        if (c > larger) {
            larger = c;
        }

        return larger;
    }
}
