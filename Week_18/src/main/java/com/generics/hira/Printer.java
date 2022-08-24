package com.generics.hira;

public class Printer<T> {

    T thingtoPrint;

    public Printer(T thingtoPrint) {
        this.thingtoPrint = thingtoPrint;
    }

    public void print(){
        System.out.println(thingtoPrint);
    }

    public <T>void print2(T thing){
        System.out.println(thing);
    }
}
