package Week_21;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertFrequencyofWord {

     /*
        Find Frequency of Each Array Element And Convert to English Word
        Write a function that takes an integer array, and counts each number and
        prints a sentence to say how many times a number is repeated.
        NumberToWord order is not important.
        EXAMPLE:
        input  :  array = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2}
        output :
        1 is two
        3 is three
        4 is two
        2 is more than ten
     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2};

        qadir1();
        System.out.println("----------------------");
        qadir2();
        System.out.println("----------------------");

        findFrequency(arr);
        System.out.println("----------------------");

        arrayAndMap(arr);
        System.out.println("----------------------");
        withEnumAndMap(arr);
        System.out.println("----------------------");
        withStreamAndEnum(arr);
    }

    // Time complexity O( n^2 )   Space Complexity( O(n) )
    static void arrayAndMap(int[] arr) {
        if (arr == null || arr.length == 0){
            System.out.println("array is empty");
            return;
        }
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};
        Map<Integer, String> map = new HashMap<>();

        for (int each : arr) {
            int count = 0;
            for (int n : arr) {
                if (each == n) {
                    count++;
                }
            }
            if (count > 10) {
                map.put(each, words[11]);
            } else {
                map.put(each, words[count]);
            }
        }

        map.forEach((k, v) -> System.out.println(k + " is " + v + " times"));
    }

    // Time complexity O( n )   Space Complexity( O(n) )
    static void withEnumAndMap(int[] arr) {
        if (arr == null || arr.length == 0){
            System.out.println("array is empty");
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int each : arr) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        map.forEach((k, v) -> {
            int n = v <= 11 ? v : 11;
            System.out.println(k + " is " + NumberToWord.values()[n].value  + " times");
        });
    }



    // Time complexity O( n )   Space Complexity( O(n) )
    static void withStreamAndEnum(int[] arr) {
        if (arr == null || arr.length == 0){
            System.out.println("array is empty");
            return;
        }
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .forEach((k, v) -> {                            //Map.forEach method
                    //  int n = v <= 11 ? Math.toIntExact(v) : 11;
                    long n = v <= 11 ?  v : 11;
                    System.out.println(k + " is " + NumberToWord.values()[(int) n].value + " times");
                });
    }

    enum NumberToWord {
        ZERO("zero"), ONE("one"), TWO("two"), THREE("three"), FOUR("four"), FIVE("five"),
        SIX("six"), SEVEN("seven"), EIGHT("eight"), NINE("nine"), TEN("ten"), MORE_THAN_TEN("more than ten");

        final String value;
        NumberToWord(String value){
            this.value = value;
        }
    }

    // dilara
    public static void findFrequency(int[] arr) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            intMap.put(arr[i], intMap.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> each : intMap.entrySet()) {
            System.out.println(each.getKey() + " is " + translateNo(each.getValue()) + " times");
        }
    }

    public static String translateNo(Integer num) {
        Map<Integer, String> singleDigits = new LinkedHashMap<>(Map.of(0, "", 1, "one", 2, "two", 3, "three", 4, "four", 5, "five",
                6, "six", 7, "seven", 8, "eight", 9, "nine"));
        Map<Integer, String> twoDigits = new LinkedHashMap<>(Map.of(1, "ten", 2, "twenty", 3, "thirty", 4, "forty", 5, "fifty",
                6, "sixty", 7, "seventy", 8, "eighty", 9, "ninety"));
        Map<Integer, String> teens = new LinkedHashMap<>(Map.of(10, "ten", 11, "eleven", 12, "twelve", 13, "thirteen", 14, "fourteen", 15, "fifteen",
                16, "sixteen", 17, "seventeen", 18, "eighteen", 19, "nineteen"));
        int remainder = 0;
        String result = "";
        int counter = 0;

        while (num != 0) {
            if (num > 10 && num < 20) {
                result = teens.get(num);
                num = 0;
                return result;
            } else {
                remainder = num % 10;
                if (counter == 0) {
                    result = singleDigits.get(remainder);
                    counter++;
                } else {
                    result = twoDigits.get(remainder) + result;
                    counter++;
                }
                num = num / 10;
            }

        }
        return result;
    }

    // qadir
    static void qadir1(){
        Integer[] arrInput = {1, 2, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2,5,5,5,5,5, 9,9,4, 2, 2, 2, 2, 2, 2};

        Map<Integer, String> dataMap = new HashMap<>();
        dataMap.put(1,"one");
        dataMap.put(2,"two");
        dataMap.put(3,"three");
        dataMap.put(4,"four");
        dataMap.put(5,"five");
        dataMap.put(6,"six");
        dataMap.put(7,"seven");
        dataMap.put(8,"eight");
        dataMap.put(9,"nine");
        dataMap.put(10,"ten");
        dataMap.put(12,"more than ten times");
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(arrInput));
        Map<Integer, String> otherResult = myList.stream()
                .collect(Collectors.toMap(Function.identity(), x->dataMap.get(Collections.frequency(myList,x)),(x1, x2) -> x1));
        otherResult.forEach( (k, v) -> { System.out.println(k +" is "+ v + " times"); } );
    }

    static void qadir2(){
        Integer[] arrInput = {1, 2, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2,5,5,5,5,5, 4, 2, 2, 2, 2, 2, 6};

        Map<Integer, String> dataMap = new HashMap<>();
        dataMap.put(1,"one");
        dataMap.put(2,"two");
        dataMap.put(3,"three");
        dataMap.put(4,"four");
        dataMap.put(5,"five");
        dataMap.put(12,"more than ten times");

        Map<Integer, String> map = new LinkedHashMap<>();
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(arrInput));
        for (Integer each : myList) {
            int count = Collections.frequency(myList, each);
            map.put(each, dataMap.get(count));
        }
        map.forEach( (k, v) -> { System.out.println(k +" is "+ v + " times"); } );

    }


}
