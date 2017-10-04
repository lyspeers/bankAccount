package com.company;
import java.util.*;
/**
 * Created by ls059 on 10/4/17.
 */
public class bankAccount {
    public bankAccount(double b, String cName){
        balance = b;
        name = cName;
    }
    public void deposit(double d) {
        balance = balance + d;
    }
    public void withdraw(double w) {
        if (balance > 0) {
            balance = balance - w;
            if(balance<0){
                System.out.print(name + " you have insufficient funds to make that withdraw");
                balance = balance+ w;
            }
        }else{
            System.out.println(name + " you have insufficient funds to make that withdraw");
        }
    }
    public void balanceCheck() {
        System.out.println(balance);
    }
    public double balance;
    public String name;

}
