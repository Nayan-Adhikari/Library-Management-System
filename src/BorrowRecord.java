import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowRecord {
    private String recordId;
    private Book book;
    private User borrower;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public BorrowRecord(String recordId, Book book, User borrower) {
        this.recordId = recordId;
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(14); // 2 weeks
    }

    public double calculatePenalty() {
        if (returnDate == null) {
            return 0;
        }
        long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
        return daysLate > 0 ? daysLate * 5.0 : 0.0; // ₹5 per late day
    }

    public void setReturnDate(LocalDate date) {
        this.returnDate = date;
    }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate date) { this.dueDate = date; }

    @Override
    public String toString() {
        return recordId + ": " + book.getTitle() + " borrowed by " + borrower.getName();
    }
}
