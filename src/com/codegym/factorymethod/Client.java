package com.codegym.factorymethod;

public class Client {
    public static void main(String[] args) {
        Bank testBank=BankFactory.getBank(BankType.VIETCOMBANK);
        Bank demoBank=BankFactory.getBank(BankType.TPBank);
        System.out.println(testBank.getBankName());
    }
}
