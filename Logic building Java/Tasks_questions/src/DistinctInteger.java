import java.util.ArrayList;
import java.util.List;

public class DistinctInteger {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(10);
        integerList.add(40);
        integerList.add(20);

        List<Integer> distinctList = createDistinctList(integerList);
        System.out.println("Distinct List: " + distinctList);
    }

    public static List<Integer> createDistinctList(List<Integer> integerList) {
        List<Integer> distinctList = new ArrayList<>();

        for (Integer num : integerList) {
            if (!distinctList.contains(num)) {
                distinctList.add(num);
            }
        }

        return distinctList;
    }
}