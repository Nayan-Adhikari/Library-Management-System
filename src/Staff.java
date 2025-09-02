public class Staff extends User {
    public Staff(String userId, String name, String email, String phone, String dob, String password, LibraryCard card) {
        super(userId, name, email, phone, dob, password, card);
    }

    public void verifyStudent(Student student) {
        System.out.println("Staff verified student: " + student.getName());
    }

    public void blockLibraryCard(LibraryCard card) {
        card.setStatus("BLOCKED");
        System.out.println("Card " + card.getCardId() + " blocked.");
    }

    @Override
    public String toString() {
        return "Staff - " + super.toString();
    }
}
