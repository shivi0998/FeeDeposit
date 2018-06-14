package UserDefinedExceptions;

public class InsufficientFeesException extends Exception{
    private double amt;
    public InsufficientFeesException(double amt){
        this.amt=amt;
    }
    public double getAmt(){
        return this.amt;
    }
}
