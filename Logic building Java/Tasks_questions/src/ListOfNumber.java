public class ListOfNumber {
    public static void main(String[] args) {
        int[] integerArray = {10, 20, 30, 40, 50};

        // Creating
        java.util.List<Integer> integerList = new java.util.ArrayList<>();

        // Adding elements from the array to the list
        for (int num : integerArray) {
            integerList.add(num);
        }

        // Accessing elements
        System.out.println("List: " + integerList);
        System.out.println("Element at index 0: " + integerList.get(0));

        // Modifying elements
        integerList.set(1, 25);
        System.out.println("Modified list: " + integerList);

        // Removing
        integerList.remove(2);
        System.out.println("List after removal: " + integerList);

        // Checking the size of the list
        System.out.println("Size of the list: " + integerList.size());
    }
}