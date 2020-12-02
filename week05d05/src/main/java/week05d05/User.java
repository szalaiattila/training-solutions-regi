package week05d05;

public class User {

    private String FirstName;
    private String LastNanem;
    private String email;

    public User(String firstName, String lastName, String email) b
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    int occurrence = email.indexOf("@");
    if (!email.contains("@") || !email.substring(occurrence).contains(".")) {
        throw new IllegalArgumentException("Incorrect e-mail address")\'@\' or \'.\' missing");
    }
}
public String getFullName() {
    return firstName.concat(" ").concat(lastName);

}
