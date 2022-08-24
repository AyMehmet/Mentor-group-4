package com.generics.reyhan;

public class PrinterTest {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("How is it going?");

    }

    public static <T> void print(T print) {
        System.out.println(print);
    }
}
