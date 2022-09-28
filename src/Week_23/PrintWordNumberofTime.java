package Week_23;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintWordNumberofTime {

    public static void main(String[] args) {
        printword("memo",5);
        System.out.println("*********************");
        printword1("memo",3);


    }
    private static void printword(String word, int i) {
        System.out.println(word);
        if (i>1) printword(word,i-1);

    }

    private static void printword1(String word, int i) {
        IntStream.rangeClosed(1,i).forEach(times->{
            System.out.println(word);
        });
    }
}
