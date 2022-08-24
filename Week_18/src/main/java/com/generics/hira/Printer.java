package com.generics.hira;

public class Printer<T> {

    T thingtoPrint;

    public Printer(T thingtoPrint) {
        this.thingtoPrint = thingtoPrint;
    }

    public void print(T thingtoPrint){
        System.out.println(thingtoPrint);
    }
}
