import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        // duplicate characters and their count in a string

        String str = "Better Butter";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            else
                hm.put(str.charAt(i), 1);
        }
        for (Map.Entry<Character, Integer> map : hm.entrySet()) {
            if (map.getValue() > 1) {
                System.out.println(map.getKey() + " " + map.getValue());
            }
        }
    }
}
