import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SignUp {
    public String username;
    public String password;
    public String repeatPassword;

    public SignUp(String username, String password, String repeatPassword) {
        this.username = username;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public boolean validatePassword() {
        if (username.equals("yasirraiyan") && password.equals("Yasyan480") && repeatPassword.equals("Yasyan480")) {
            System.out.println("Registration Successful.");
            return true;
        } else if (username.isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
            System.out.println("Please fill up all fields first!");
            return false;
        } else {
            System.out.println("Registration Failed!");
            return false;
        }
    }
}
