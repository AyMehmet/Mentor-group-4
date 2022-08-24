package com.generics.sarankara;


import com.generics.Printer;

import java.util.ArrayList;
import java.util.List;



public class sarankara {


    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("How is it going?");
        Printer<Integer> item= new Printer(1983);
        item.print();
        Printer <String>item1= new Printer("1983");
        item1.print();


        List<Integer> num = new ArrayList<Integer>();
        num.add(12,25);

    }
    public static void print(ArrayList<Integer> item) {

        for (Integer each : item) {
            System.out.println(item);
        }
        public static <T> void print(T print) {
            System.out.println(print);
        }
    }
}
