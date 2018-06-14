package Utilities;

import UserDefinedExceptions.InsufficientFeesException;

public class CheckingFees {
    private double feebalance=97450.0;
    private int studentid;
    public CheckingFees(int id){
        studentid=id;
    }
    public void deposit(double fee){
        feebalance=feebalance-fee;
    }
    public void check()throws InsufficientFeesException {
        if(feebalance>=1000){
            throw new InsufficientFeesException(feebalance);
        }
    }
    public double getFeebalance() {
        return feebalance;
    }
    public int getStudentid() {
        return studentid;
    }
}
