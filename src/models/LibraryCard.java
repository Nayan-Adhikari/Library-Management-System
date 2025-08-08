package models;
import java.util.Date;

public class LibraryCard {
    public int cardId;
    public Date issueDate;
    public Date expiryDate;
    public String status;

    public LibraryCard(int cardId, Date issueDate, Date expiryDate, String status){
        this.cardId = cardId;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.status = status;
    }
}
