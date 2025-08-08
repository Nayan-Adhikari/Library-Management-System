package models;

public class Admin extends User {
    public Admin(String name, String email, String phone, String dob, String password, int userId, LibraryCard libraryCard){
        super( name,  email,  phone,  dob,  password, userId, libraryCard);
    }
}
