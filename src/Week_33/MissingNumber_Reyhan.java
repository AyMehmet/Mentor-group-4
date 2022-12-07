package Week_33;

import java.util.Arrays;

public class MissingNumber_Reyhan {

    public static void main(String[] args) {

        int[] ints = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNum(ints));

    }



    public static int missingNum(int[] arr) {

        if (arr.length == 1) return 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length) {

                if (arr[i + 1] == arr[i] + 1) {

                    continue;

                }
            }

            return arr[i] + 1;
        }
        return 0;

    }
}
