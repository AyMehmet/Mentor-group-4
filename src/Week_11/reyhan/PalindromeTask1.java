package Week_11.reyhan;

public class PalindromeTask1 {

    public static void main(String[] args) {

        boolean a = isPalindrome("Was it a car or a cat I saw");

        System.out.println(a);

    }

    public static boolean isPalindrome(String str) {
        String strReversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                strReversed += str.charAt(i);
            }
        }

        String strWithoutSpace = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strWithoutSpace += str.charAt(i);
            }
        }

        if (strWithoutSpace.equalsIgnoreCase(strReversed)) {
            return true;
        }

        return false;
    }
}
/*
   A string is said to be palindrome after converting all uppercase letters into lowercase letters and removing all spaces it reads the same backward as forward.
   For e.g. civic, radar, level, rotor, race car, are palindrome because if we try to read it from backward, it is same as forward.
   ● Write a method that accepts a String as argument and return true if it is a palindrome, or false otherwise.
   ● Assume string has only alphanumeric characters include letters and numbers and spaces, ignore upper-lowercase characters.
   Examples:
   Radar → true
   rotator → true
   Summer→false
   Was it a car or a cat I saw →true
   “” → true
   “ ” → true
 */