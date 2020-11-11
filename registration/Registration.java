package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User:");
        String username = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        System.out.println("Password again:");
        String password2 = scanner.nextLine();

        System.out.println("Email address:");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(username) ? "valid user" : "invalid user");
        System.out.println(userValidator.isValidPassword(password, password2) ? "valid password" : "invalid password");
        System.out.println(userValidator.isValidEmail(email) ? "valid e-mail" : "invalid e-mail");
    }
}
