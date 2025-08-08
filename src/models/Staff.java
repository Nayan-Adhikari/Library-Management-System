package models;

public class Staff extends User {
    public Staff(String name, String email, String phone, String dob, String password, int userId, LibraryCard libraryCard){
        super( name,  email,  phone,  dob,  password, userId, libraryCard);
    }
}
