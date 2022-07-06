package Week_10.StringPalindromes;

import java.util.ArrayList;

public class Palindrome2_HLN {

    public static ArrayList<String> getPalindromeList (String[] array){
        ArrayList<String> results = new ArrayList<>();
        String reversed = "";

        for (String j : array) {
            if(Palindrome1_HLN.isPalindrome(j)){
                results.add(j);
            }
        }
        return results;


    }

    public static void main(String[] args) {

       String[] arr ={"abc", "car", "level","racecar", "cool"};

        System.out.println(getPalindromeList(arr));



    }

    }
    /*
    Write a method that takes in a non-empty array of Strings
that will return an ArrayList which consist of palindromic
strings in given array.
The input string can be assumed to contain only alphabets
(both uppercase and lowercase) and numeric digits.
     */

