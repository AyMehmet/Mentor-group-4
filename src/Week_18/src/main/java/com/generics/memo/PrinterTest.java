package Week_18.src.main.java.com.generics.memo;

import Week_18.src.main.java.com.generics.Mohamed.Printer;


public class PrinterTest {

    public static void main(String[] args) {

       Printer<String> str=new Printer<>("memo");
       str.print();
        Printer<Integer> num1=new Printer<>(4);
        str.print();

        printr(2);
        printr("memo");


    }

    public static <T> void printr(T toprint){
        System.out.println(toprint);
    }
}
