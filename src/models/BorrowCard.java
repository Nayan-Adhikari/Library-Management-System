package models;

import java.util.Date;

public class BorrowCard {
    public String recordId;
    public Date borrowDate;
    public Date returnDate;
    public Date dueDate;
    public Book book;
    public User borrower;

    public BorrowCard(String recordId,Date borrowDate, Date returnDate, Date dueDate, Book book, User borrower){{
        this.recordId = recordId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.dueDate = dueDate;
        this.book = book;
        this.borrower = borrower;
    }

    }
}
