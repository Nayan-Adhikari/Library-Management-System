import java.time.LocalDate;

public class LibraryCard {
    private String cardId;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String status;

    public LibraryCard(String cardId) {
        this.cardId = cardId;
        this.issueDate = LocalDate.now();
        this.expiryDate = issueDate.plusYears(1);
        this.status = "ACTIVE";
    }

    public boolean validate() {
        return status.equals("ACTIVE") && LocalDate.now().isBefore(expiryDate);
    }

    public String getCardId() { return cardId; }
    public void setStatus(String status) { this.status = status; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Card ID: " + cardId + " (" + status + ")";
    }
}
