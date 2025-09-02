public class Main {
    public static void main(String[] args) {
        // Create library card
        LibraryCard card1 = new LibraryCard("C101");

        // Create users
        Student student = new Student("U101", "Alice", "alice@mail.com", "9999999999", "2000-01-01", "pass123", card1);
        Admin admin = new Admin("A101", "Bob", "bob@mail.com", "8888888888", "1990-05-05", "admin123", new LibraryCard("C102"));

        // Create book
        Book book1 = new Book("B101", "Clean Code", "Robert Martin", "2008");

        // Admin adds book
        admin.addBook(book1);

        // Student requests book
        student.requestBook(book1);

        // Borrow record
        BorrowRecord record = new BorrowRecord("R101", book1, student);
        System.out.println(record);

        // Renew book
        student.renewBook(record);

        // Return late
        record.setReturnDate(record.getDueDate().plusDays(3));
        System.out.println("Penalty: ₹" + student.viewPenalty(record));

        // Payment
        Payment payment = new CashPayment(student.viewPenalty(record));
        payment.processPayment();
    }
}
