public class Admin extends User {
    public Admin(String userId, String name, String email, String phone, String dob, String password, LibraryCard card) {
        super(userId, name, email, phone, dob, password, card);
    }

    public void addBook(Book book) {
        System.out.println("Admin added book: " + book);
    }

    public void removeBook(Book book) {
        System.out.println("Admin removed book: " + book);
    }

    public void updateBook(Book book) {
        System.out.println("Admin updated book: " + book);
    }

    @Override
    public String toString() {
        return "Admin - " + super.toString();
    }
}
