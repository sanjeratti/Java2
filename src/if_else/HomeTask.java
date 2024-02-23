package if_else;

import java.util.Scanner;

public class HomeTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("vedite marku mashin");
        String marka = scanner.nextLine();
        System.out.println("vedite model avto:");
        String model = scanner.nextLine();
        if(marka.equals("BMW") && model.equals("e90")) {
            System.out.println("u nas est v nalichii");

        } else {

            System.out.println("u nas net v nalichii");
            String name = scanner.nextLine();




        }

    }
}