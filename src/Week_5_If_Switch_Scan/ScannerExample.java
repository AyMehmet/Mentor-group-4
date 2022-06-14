package Week_5_If_Switch_Scan;



import java.util.Arrays;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

//
//        Scanner scan=new Scanner(System.in);
//        String name,lastName;
//        //name=scan.nextLine();
//        name= scan.next();
//        lastName=scan.nextLine();
//        System.out.println(name + " "+ lastName);
//    }

    int[] numbers= {1,2,3,4,5,6,7,8,9,10};


        for (int i = 0; i < numbers.length; i++) {

        if( numbers[i] %2==1){
            numbers[i]= numbers[i]*2;

        }

    }
        System.out.println(Arrays.toString(numbers));



        int[] numbers1= {1,2,3,4,5,6,7,8,9,10};


        for (int i = 0; i < numbers1.length; i++) {

            if( numbers1[i] %2==1){
                continue;

            }
            numbers1[i]= numbers1[i]*2;
        }
        System.out.println(Arrays.toString(numbers1));

    }

}

