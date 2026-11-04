import java.util.Scanner;
import java.util.Locale;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        String lowercaseUsername = username.toLowerCase(Locale.ROOT);
        String lowercasePassword = password.toLowerCase(Locale.ROOT);

        if (lowercaseUsername.equals("admin") && lowercasePassword.equals("python123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }

        scanner.close();
    }
}
