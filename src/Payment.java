import java.time.LocalDate;

public abstract class Payment {
    protected double amount;
    protected LocalDate date;

    public Payment(double amount) {
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public double getAmount() { return amount; }
    public LocalDate getDate() { return date; }

    public abstract boolean processPayment();
}
