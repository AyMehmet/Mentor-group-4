package Week_29;

import java.util.Arrays;

public class ValidAnagram_Gulcin {

    public static void main(String[] args) {
        System.out.println(isTheAnagram("asfasf","gregerg"));
    }


    public static boolean isTheAnagram(String s, String t) {
        String m= s.toLowerCase();
        String n= t.toLowerCase();
        char[] car = m.toCharArray();
        char[] car2 = n.toCharArray();
        Arrays.sort(car);
        Arrays.sort(car2);
        if (!Arrays.equals(car, car2)) return false;
        return true;
    }
}
