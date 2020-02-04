package com.codegym.singleton;

public class Employee {
    public void print(){
//        Printer printer1=new Printer();
//        Printer printer2=new Printer();

        Printer testPrinter=Printer.getInstance();
        testPrinter.connect();
    }
}
