package Week_34;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1_Gulcin {


    public static void main(String[] args) {
        String str="memo..., memo33...///memo**545454";

        countFreq4(str);
    }
    public static void countFreq4(String str) {
        Map<String, Integer> maps = new HashMap<>();
        String[] arrs = str.split(" ");
        Arrays.stream(arrs).forEach(word -> maps.merge(word, 1, Integer::sum));
        System.out.println(maps.toString());
    }
}
