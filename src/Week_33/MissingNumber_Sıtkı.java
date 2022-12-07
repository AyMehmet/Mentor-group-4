package Week_33;

import java.util.Arrays;

public class MissingNumber_Sıtkı {

    public static void main(String[] args) {
        //in this case n = 3
        int[] arr1 = {3, 0, 1};
        int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int result = 0;

        Arrays.sort(arr1);

        //we can create dummy array, where there will be no missing numbers (abstracted temporary array)
        //next we will find the sum our array
        //and then, we will subtract our array from the dummy array to find the missing number


        //dummy array in abstraction  should be  [0,1,2,3]


        int sumDum = 0;
        for (int i = arr1[0]; i <= arr1[arr1.length - 1]; i++) {
            sumDum += i;
        }

        int sum1 = 0;
        //let's find sum of our array
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }

        //finally subtract sums, and that will be the Missing Number
        result = sumDum - sum1;
        System.out.println(result);


    }

}
