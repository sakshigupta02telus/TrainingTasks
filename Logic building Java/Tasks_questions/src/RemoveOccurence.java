public class RemoveOccurence {
    public static void main(String[] args) {
        String input = "abcdABCDabcdABCD";
        char characterToRemove = 'a';

        String output = input.replace(String.valueOf(characterToRemove), "");
        System.out.println("Output: " + output);
    }

}

