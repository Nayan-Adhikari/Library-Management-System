package models;
import java.util.Date;

public abstract class Payment {
    protected double amount;
    protected Date date;

    public Payment(double amount, Date date){
        this.amount = amount;
        this.date = date;
    }

}
