public class Book {
    private String bookId;
    private String title;
    private String author;
    private String publishYear;
    private boolean isAvailable;

    public Book(String bookId, String title, String author, String publishYear) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.isAvailable = true;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { this.isAvailable = available; }

    @Override
    public String toString() {
        return bookId + " - " + title + " by " + author + " (" + publishYear + ") [" +
                (isAvailable ? "Available" : "Borrowed") + "]";
    }
}
