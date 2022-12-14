package Week_34;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multipyofArray {

    public static void main(String[] args) {
        //int[] num={2, 3, 4, 5, 6};
        int[] num={2};
        System.out.println("input = " +Arrays.toString(num));
        System.out.println("output = "+Arrays.toString(multiplyArray(num)));
        //System.out.println("output ="+Arrays.toString(multiply_Array(num)));
        System.out.println("output ="+Arrays.toString(multiply_Array_Element(num)));
    }







     static int[] multiplyArray(int[] num){
         // Nothing to do when array size is 1
        if (num.length<=1) return null;
         // Initialize temp array
        int[] temp=new int[num.length] ;
        for (int i=0; i<num.length;i++){
            // Calculate first element
            if(i==0){
                temp[i]=num[i]*num[i+1];
            }
            // Calculate last element
            else if(i== num.length-1)
            temp[i]=num[i-1]*num[i];
            // Calculate rest of elements
            else temp[i]=num[i-1]*num[i+1];
        }
        return temp;
    }


    static int[] multiply_Array(int[] num){
        // Nothing to do when array size is 1
        if (num.length<=1) return num;
        int prev=1;
        for (int i=0; i<num.length;i++){
            // Calculate first element
            if (i==0){
                prev=num[i];
                num[i]=num[i]*num[i+1];
            }
            // Calculate last element
            else if(i==num.length-1){
                num[i]=prev*num[i];
            }
            // Calculate rest of elements
            else {
                int temp=num[i];
                num[i]=prev*num[i+1];
                prev=temp;
            }
        }
        return num;
    }

    static int[] multiply_Array_Element(int [] num){
        // Nothing to do when array size is 1
        if (num.length <= 1)
            return null;

        // store current value of arr[0] and update it
        int prev = num[0];
        num[0] = num[0] * num[1];

        // Update rest of the array elements
        for (int i=1; i<num.length-1; i++) {
            // Store current value of next interaction
            int curr = num[i];

            // Update current value using previous value
            num[i] = prev * num[i+1];

            // Update previous value
            prev = curr;
        }

        // Update last array element
        num[num.length-1] = prev * num[num.length-1];
        return num;
    }
}
