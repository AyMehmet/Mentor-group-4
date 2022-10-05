package Week_24;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ArrayofProductStream {

    public static void main(String[] args) {

    }

    public static int[] productsOfOthers(int[] nums) {
        var resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int finalI = i;
            AtomicInteger temp = new AtomicInteger(1);
            var list=   Arrays.stream(nums).boxed()
                    .filter(num -> num != nums[finalI])
                    .map(n -> temp.getAndUpdate(v -> v * n)).collect(Collectors.toList());
            resultArray[i] = temp.get();
        }
        return resultArray;
    }
}
