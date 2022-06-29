package Week_11.reyhan;

import java.util.ArrayList;
import static Week_11.reyhan.PalindromeTask1.isPalindrome;

public class PalindromeTask2 {

    public static void main(String[] args) {

        String[] arr = {"abc", "car", "ada", "racecar", "cool"};

        System.out.println(palindromeStrings(arr));

    }

    public static ArrayList<String> palindromeStrings(String[] arr) {

        ArrayList<String> list = new ArrayList<>();

        for (String each : arr) {

         /*  String reversedEach = "";  //without using the method from previous task
            for (int i = each.length() - 1; i >= 0; i--) {
                reversedEach += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversedEach)) {
                list.add(each);
            }

          */

            if (isPalindrome(each)) { //the method from previous task
                list.add(each);
            }
        }
        return list;

    }
}
