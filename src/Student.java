public class Student extends User {
    public Student(String userId, String name, String email, String phone, String dob, String password, LibraryCard card) {
        super(userId, name, email, phone, dob, password, card);
    }

    @Override
    public String toString() {
        return "Student - " + super.toString();
    }
}
