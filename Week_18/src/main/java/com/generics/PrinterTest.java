package com.generics;

import java.util.Arrays;
import java.util.List;

public class PrinterTest {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("How is it going?");
        Printer<Integer> printInteger=new Printer<>(23);
        printInteger.print();
        Printer<String> printWord=new Printer<>("Hello World");
        printWord.print();
        Printer<Double>printDouble=new Printer<>(33.5);
        printDouble.print();
        Printer<List<String>> names=new Printer<>(Arrays.asList("Hi","How is your day"));
        names.print();

    }
}
