package Week_18.src.main.java.com.generics.naran;

import java.util.Collection;

public class PrinterNaran {

    //Integer thingtoPrint;

    //public Printer(Integer thingtoPrint) {
        //this.thingtoPrint = thingtoPrint;
    //}

    //public  void print(){
        //System.out.println(thingtoPrint);
    //}

    public static void printInteger (Integer a){
        System.out.println(a);
    }

    public static void printInteger (Double d){
        System.out.println(d);
    }

    public static void printInteger (String str){
        System.out.println(str);
    }

    public static void printCollection (Collection<?> t){
        System.out.println(t.getClass());
        t.forEach(System.out::println);
        System.out.println();
    }







}



/*
1 .create a  Printer class with the print method
which can print all type of object.
Implement the structure for Integer, Double and String.
2. Create a generic method can print any type.
 */