package models;

public class Student extends User{
    public Student(String name, String email, String phone, String dob, String password, int userId, LibraryCard libraryCard){
        super( name,  email,  phone,  dob,  password, userId, libraryCard);
    }
}
