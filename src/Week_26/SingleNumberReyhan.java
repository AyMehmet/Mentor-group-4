package Week_26;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberReyhan {

    public static void main(String[] args) {




    }

    public static Integer findSingleNum(Integer[] arr) {

        //element, count
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer each : arr) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        for (Integer each : arr) {
            if (map.get(each) == 1) {
                return each;
            }
        }

        return null;

    }
}
