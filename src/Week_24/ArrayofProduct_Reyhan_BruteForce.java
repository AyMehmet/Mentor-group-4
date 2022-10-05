package Week_24;

import java.util.Arrays;

public class ArrayofProduct_Reyhan_BruteForce {

    public static void main(String[] args) {

        int[] givenArray = {0,1,2};
        System.out.println(Arrays.toString(product(givenArray)));

    }

    public static int[] product(int[] arr) {

        int[] output = new int[arr.length];

        for (int j = 0; j < output.length; j++) {

            int product = 1;

            for (int i = 0; i < arr.length; i++) {

                if (i != j) product *= arr[i];
            }

            output[j] = product;

        }

        return output;
    }
}
