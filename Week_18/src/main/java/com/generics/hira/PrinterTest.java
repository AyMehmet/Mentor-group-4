package com.generics.hira;

public class PrinterTest<T> {

    public static void main(String[] args) {

        Printer<String> printerHira = new Printer<>("Hira");
        printerHira.print("hello");//hira

        Printer<Integer> intPrinted = new Printer<>(8);
        intPrinted.print(8);

        Printer<Double> doublePrinted = new Printer<>(7.9);
        doublePrinted.print(7.9);

    }

}
