package Week_24;

import java.util.Arrays;

public class ArrayofProduct_Reyhan {

    public static void main(String[] args) {

        int[] givenArray = {0,1,2};
        System.out.println(Arrays.toString(product(givenArray)));

    }

    public static int[] product(int[] arr) {

        int[] output = new int[arr.length];

        int i = 0;
        int j = 0;
        int product = 1;

        while (j < output.length) {

            if (i != j) product *= arr[i];

            i++;

            if (i >= arr.length) {

                output[j] = product;
                product = 1;
                i = 0;
                j++;
            }
        }

        return output;
    }
}
