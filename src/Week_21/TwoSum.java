package Week_21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TwoSum {
    public static void main(String[] args) {


    int[] nums = {16, 3, 11, 5, 15};

     System.out.println(Arrays.toString(findThePairNumbers(nums, 8)));
//        System.out.println(Arrays.toString(findIndicesWithTwoPointer(nums, 8)));
//        System.out.println(Arrays.toString(findIndicesWithTwoPointerAndTreeMap(nums, 8)));
//        System.out.println(Arrays.toString(findIndicesWithTwoPointerAndHashMap(nums, 8)));
//        System.out.println(Arrays.toString(nums));
    khashayar();
}


    public static int[] findThePairNumbers(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        Arrays.sort(arr);  // nlog(n)

        while (left < right) {  //n
            if (arr[left] + arr[right] == target)
                return new int[]{arr[left], arr[right]};
            else if (arr[left] + arr[right] < target) {
                left++;
            } else
                right--;
        }
        return new int[0];
    }

    public static int[] findIndicesWithTwoPointer(int[] arr, int target) {
        int firstPointer = 0, lastPointer = arr.length - 1;
        int num1, num2;
        int ind1 = -1, ind2 = -1;
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);  // nlog(n)

        while (firstPointer < lastPointer) {  //n
            if (temp[firstPointer] + temp[lastPointer] == target) {
                num1 = temp[firstPointer];
                num2 = temp[lastPointer];
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == num1) {
                        ind1 = i;
                    } else if (arr[i] == num2) {
                        ind2 = i;
                    }
                }
                return new int[]{ind1, ind2};
            } else if (temp[firstPointer] + temp[lastPointer] < target) firstPointer++;
            else lastPointer--;
        }
        return new int[0];
    }

    public static int[] findIndicesWithTwoPointerAndHashMap(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {  // n
            map.put(arr[i], i);
        }
        Arrays.sort(arr);  // n log(n)

        while (left < right) {  // n
            if (arr[left] + arr[right] == target) {
                return new int[]{map.get(arr[left]), map.get(arr[right])};
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else
                right--;
        }
        return new int[0];
    }

    public static int[] findIndicesWithTwoPointerAndTreeMap(int[] arr, int target) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) { // n log (n)
            map.put(arr[i], i);
        }

        while (!map.firstKey().equals(map.lastKey())) {  // n
            if (map.firstKey() + map.lastKey() == target) {
                return new int[]{map.firstEntry().getValue(), map.lastEntry().getValue()};
            } else if (map.firstKey() + map.lastKey() < target) {
                map.remove(map.firstKey());
            } else
                map.remove(map.lastKey());
        }
        return new int[0];
    }

    // khashayar
    static void khashayar(){
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        int num1 = 0;
        int num2 = 0;
        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    pairs.put(arr[i], arr[j]);

                }

            }
        }
        System.out.println("pairs = " + pairs);
    }
}
