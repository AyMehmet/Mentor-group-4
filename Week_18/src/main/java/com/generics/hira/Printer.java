package com.generics.hira;

public class Printer<T> {

    T thingtoPrint;

    public Printer(T thingtoPrint) {
        this.thingtoPrint = thingtoPrint;
    }

    public void print(){
        System.out.println(thingtoPrint);
    }

    public void hiraMethod(T printedType){
        System.out.println(printedType+" is printed");
    }//hira
}
