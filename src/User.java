public abstract class User {
    protected String name;
    protected String email;
    protected String phone;
    protected String dob;
    protected String userId;
    protected String password;
    protected LibraryCard libraryCard;

    public User(String userId, String name, String email, String phone, String dob, String password, LibraryCard libraryCard) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.password = password;
        this.libraryCard = libraryCard;
    }

    public boolean login(String inputUserId, String inputPassword) {
        return this.userId.equals(inputUserId) && this.password.equals(inputPassword);
    }

    public void requestBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book unavailable.");
        }
    }

    public void renewBook(BorrowRecord record) {
        record.setDueDate(record.getDueDate().plusDays(7));
        System.out.println("Renewed. New due date: " + record.getDueDate());
    }

    public double viewPenalty(BorrowRecord record) {
        return record.calculatePenalty();
    }

    public String getName() { return name; }
    public String getUserId() { return userId; }
    public LibraryCard getLibraryCard() { return libraryCard; }

    @Override
    public String toString() {
        return userId + " - " + name;
    }
}
