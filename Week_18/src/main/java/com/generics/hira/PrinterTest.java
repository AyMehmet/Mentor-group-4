package com.generics.hira;

public class PrinterTest<T> {

    public static void main(String[] args) {

        Printer<String> printerHira = new Printer<>("Hira");
        printerHira.print();//hira

        Printer<Integer> intPrinted = new Printer<>(8);
        intPrinted.print();

        Printer<Double> doublePrinted = new Printer<>(7.9);
        doublePrinted.print();

        Printer printed = new Printer("c");
        printed.print2("letter");

    }

}
