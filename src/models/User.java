package models;
abstract class User{
    protected String name;
    protected String email;
    protected String phone;
    protected String dob;
    protected String password;
    protected int userId;
    protected LibraryCard libraryCard;

    public User(int userId, String password){
        this.userId = userId;
        this.password = password;
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public User(String name,String phone, String password){
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public User(String name, String email, String phone, String dob, String password, int userId, LibraryCard libraryCard){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.password = password;
        this.userId = userId;
        this.libraryCard = libraryCard;
    }
}