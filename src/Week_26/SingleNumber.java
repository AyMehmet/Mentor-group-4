package Week_26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {

        int[] numbers={1,3,4,3,1,2,2};

        System.out.println(singleNumber(numbers));
        System.out.println(singleNumber1(numbers));

    }




    public static int singleNumber(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (Integer i : nums) {
            if (!list.remove(i)) {
                list.add(i);
            }
        }

        return list.get(0);
    }

    public static int singleNumber1(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (Integer i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }

        }
        return (int) set.toArray()[0];
    }


}
