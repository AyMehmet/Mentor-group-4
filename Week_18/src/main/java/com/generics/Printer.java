package com.generics;

public class Printer {

    Integer thingtoPrint;

    public Printer(Integer thingtoPrint) {
        this.thingtoPrint = thingtoPrint;
    }

    public void print(){
        System.out.println(thingtoPrint);
    }
}
