package controller;

import UserDefinedExceptions.InsufficientFeesException;
import Utilities.CheckingFees;

import java.util.Scanner;

public class DriverFee {
    public static void main(String args[]){
        Scanner sr=new Scanner(System.in);
        CheckingFees c=new CheckingFees(111);
        System.out.println("The Fees For this semester is 97,450 $");
        System.out.println("Enter amount to deposit");
        double fee=sr.nextDouble();
        c.deposit(fee);
        try{
           c.check();
           System.out.println("Admit card can be issued");
        }catch (InsufficientFeesException e){
            System.out.println("Sorry Admit card can't be issued. You have to pay  "+e.getAmt());
        }
    }
}
