package com.codegym.factorymethod;

public class BankFactory {
    public BankFactory(){

    }
    public static final Bank getBank(BankType bankType){
        switch(bankType){
            case VIETCOMBANK:
                return new VietcomBank();
            case TPBank:
                return new TPBank();
            default:
                throw  new IllegalArgumentException("This bank type is unsupported");
        }
}
}
