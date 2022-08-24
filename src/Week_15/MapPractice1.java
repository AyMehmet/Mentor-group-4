package Week_15;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {


    }
    static int getFirstNonRepeatingVowel(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (!map.containsKey(ch)) {
                    map.put(ch, i);
                } else {
                    map.put(ch, -1);
                }
            }
        }
        for (Integer value : map.values()) {
            if (value >= 0) {
                return value;
            }
        }
        return -1;
    }
}
