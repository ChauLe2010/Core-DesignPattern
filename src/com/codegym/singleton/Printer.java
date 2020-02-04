package com.codegym.singleton;

public class Printer {
    private static Printer instance;
    private  Printer(){

    }

    //Lazy initialization
//    public static Printer getInstance(){
//        if(instance==null){
//            instance=new Printer();
//        }
//        return instance;
//    }

    //Thread initialization
//    public synchronized static Printer getInstance(){
//        if(instance==null){
//            instance=new Printer();
//        }
//        return instance;
//    }
    //Thread Safe initialization
    public static Printer getInstance(){
        if(instance==null){
            synchronized (Printer.class){
                if(instance==null)
            instance=new Printer();
            }
        }
        return instance;
    }
    public void connect(){
        System.out.println("Ket noi thanh cong");
    }
}
