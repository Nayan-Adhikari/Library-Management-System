public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public boolean processPayment() {
        System.out.println("Cash payment of ₹" + amount + " on " + date);
        return true;
    }

    @Override
    public String toString() {
        return "Cash Payment ₹" + amount + " on " + date;
    }
}
