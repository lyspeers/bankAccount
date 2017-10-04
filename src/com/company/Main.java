package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner c = new Scanner(System.in);
        System.out.println("What is your name");
        String name = c.next();

        Scanner bal = new Scanner(System.in);
        System.out.println("how much do you want to deposit");
        double b = bal.nextDouble();
        bankAccount luke = new bankAccount(b, name);

        Scanner q = new Scanner(System.in);
        System.out.println(name + " Would you like to deposit, withdraw");
        String a = q.next();
        if(a.equals("withdraw")){
            Scanner dep = new Scanner(System.in);
            System.out.println("how much would you like to withdraw");
            double w = bal.nextDouble();
            luke.withdraw(w);
        }  else if(a.equals("deposit")){

        }





        luke.balanceCheck();
        luke.withdraw(7);
    }
}
