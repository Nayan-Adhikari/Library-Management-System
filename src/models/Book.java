package models;

public class Book {
    public int bookId;
    public String author;
    public String title;
    public String publishYear;
    public boolean isAvailable;

    public Book(int bookId,String author,String title,String publishYear,boolean isAvailable){
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.isAvailable = isAvailable;
    }
}
