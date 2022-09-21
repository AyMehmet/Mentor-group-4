package Week_21;

import java.util.HashMap;
import java.util.Map;

public class ConvertFreq {

    public static void main(String[] args) {


        int arrayList[] = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2};

        Map<Integer, Integer> mapList = new HashMap<>();
        for (int i = 0; i < arrayList.length; i++) {
            {
                if (mapList.containsKey(arrayList[i])) {
                    mapList.put(arrayList[i], mapList.get(arrayList[i]) + 1);
                } else {
                    mapList.put(arrayList[i], 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> each : mapList.entrySet()) {
            if (each.getValue() > 10) {
                System.out.println(each.getKey() + " " + "more than 10");
            } else {
                System.out.println(each.getKey() + " " + each.getValue());
            }
        }

    }

}
