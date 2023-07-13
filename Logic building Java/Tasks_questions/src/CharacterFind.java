import java.util.HashMap;
import java.util.Map;
public class CharacterFind {
    public static void main(String[] args) {
        String string = "Today is Evaluation Day.Evaluation is good for us";
        Map<Character, Integer> characterCounts = new HashMap<>();

        for (char c : string.toCharArray()) {
            characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            if (entry.getValue() == 3) {
                System.out.println(entry.getKey());
            }
        }
    }

}
