package Week_22;

import java.util.Arrays;

public class MoveZerosToEnd {
    /*
    Move Zeros To End in place
    Given an array of integers, move all the 0s to the back of the array while maintaining the relative order of the non-zero elements.
    Do this in-place using constant auxiliary space.

    Input:
    [1, 0, 2, 0, 0, 7]

    Output:
    [1, 2, 7, 0, 0, 0]
     */

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 3, 7};
        oneLoopOneIf(arr);
       // moveZerosToEnd(arr);
       // moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZerosToEnd(int[] arr) {
        int fast = 0, slow = 0;

        while (fast < arr.length-1) {
            if (arr[slow] != 0) {
                slow++;
            }
            if (fast <= slow || arr[fast] == 0) {
                fast++;
            }
            if (arr[slow] == 0 && arr[fast] != 0) {
                arr[slow] = arr[fast];
                arr[fast] = 0;
            }
        }
    }

    static void oneLoopOneIf(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
    }

}
