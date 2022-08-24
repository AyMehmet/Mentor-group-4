package com.generics.hira;

public class PrinterTest<T> {

    public static void main(String[] args) {

        Printer printerHira = new Printer<>("Hira");
        printerHira.print();//hira
        printerHira.hiraMethod(9);//hira

    }

}
