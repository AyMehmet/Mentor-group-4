package com.generics;

public class Printer <T>{

    T thingtoPrint;

    public Printer(T thingtoPrint) {
        this.thingtoPrint = thingtoPrint;
    }

    public  void print(){
        System.out.println(thingtoPrint);
    }
}
