public class CardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public CardPayment(double amount, String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment() {
        if (cardNumber.length() == 16 && cvv.length() == 3) {
            System.out.println("Card payment of ₹" + amount + " processed for " + cardHolderName);
            return true;
        }
        System.out.println("Card payment failed: Invalid details.");
        return false;
    }

    @Override
    public String toString() {
        return "Card Payment ₹" + amount + " by " + cardHolderName + " on " + date;
    }
}
