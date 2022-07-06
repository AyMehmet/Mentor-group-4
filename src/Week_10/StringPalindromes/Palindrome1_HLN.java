package Week_10.StringPalindromes;

import java.util.Locale;

public class Palindrome1_HLN {


    public static boolean isPalindrome(String str) {
        int strLength = str.length();
        String reversed = "";

        for (int i = strLength-1; i >= 0 ; i--) {
           reversed += "" + str.toLowerCase().charAt(i);
        }

        if(reversed.equals(str.toLowerCase())){
        return true;
        }
        return false;
    }


    public static void main(String[] args) {

        String s = "level";
        System.out.println(isPalindrome(s));

    }



}



/*
● A string is said to be palindrome after converting all uppercase
letters into lowercase letters and removing all spaces it reads the
same backward as forward.
For e.g. civic, radar, level, rotor, race car, are palindrome because if we
try to read it from backward, it is same as forward.

● Write a method that accepts a String as argument and return true
if it is a palindrome, or false otherwise.

● Assume string has only alphanumeric characters include letters
and numbers and spaces, ignore upper-lowercase characters.
Examples:
Radar → true
rotator → true
Summer→false
Was it a car or a cat I saw →true
“” → true
“ ” → tru
 */