package Tasks;
import java.util.Scanner;
public class Flyjump {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dobro pojalovat§ v Fly Jump");
        System.out.println("Byli li u nas ranshe? (da/net)");

        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity

        if (input.equals("da")) {
            // Assuming some calculation for the cost of a fly jump
            double cost = calculateFlyJumpCost();
            System.out.println("Flyjumtyn Baasy : $" + cost);
        } else if (input.equals("net")) {
            System.out.println("Thank you for visiting! Have a great day!");
        } else {
            System.out.println("Nepravilnoiy vvod. pojaluysta vyberite 'da' ili 'net'.");
        }

        scanner.close(); // Closing scanner to prevent resource leak
    }

    // Placeholder method for calculating fly jump cost
    private static double calculateFlyJumpCost() {
        // Insert your calculation logic here
        // For demonstration, returning a hardcoded value
        return 50.0;
    }
}


