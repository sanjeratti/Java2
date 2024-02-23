import java.util.Scanner;

public class Username_Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get username and password from the user
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Simulate authentication (in a real-world scenario, you would check against a database)
        if (authenticate(username, password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }
        scanner.close();
    }
    // Simple authentication method (replace this with a more secure implementation)
    private static boolean authenticate(String username, String password) {
        // In a real-world scenario, you would check against a database
        // Here, we are checking against two sets of hardcoded username and password for demonstration purposes
        return (username.equals("Sanzhar") && password.equals("123456")) ||
                (username.equals("Zarina") && password.equals("111111")) ||
                (username.equals("Zamira") && password.equals("666666"));
    }
}
