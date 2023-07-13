public class StringComparison {
    public static void main(String[] args) {
        String s1 = "hello tst";
        String s2 = "hello test";

        boolean result = areStringsEqual(s1, s2);

        if (result) {
            System.out.println("s1 and s2 are equal.");
        } else {
            System.out.println("s1 and s2 are not equal.");
        }
    }

    public static boolean areStringsEqual(String s1, String s2) {
        return s1.equals(s2);
    }
}

