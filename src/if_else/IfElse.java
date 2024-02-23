package if_else;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //        if statment
        if (1 > 0){
            System.out.println(true);
        }
        //          if else statement
        if (20>50){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite email");
        String email = scanner.nextLine();

        boolean sobachkasoderjit = false;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                sobachkasoderjit = true;
                System.out.println("Vvedite password");
                String psw = scanner.nextLine();
                boolean registered = false;
                for (int p = 0; p < psw.length(); p++) {
                    if (psw.charAt(p) == '!') {
                        System.out.println("You registered!");
                        registered = true;
                        break;
                    }
                }
                if (!registered) {
                    System.out.println("Password incorrect");
                }
                break; // Exit the loop after processing the email and password
            }
        }

        if (!sobachkasoderjit) {
            System.out.println("Login incorrect");
        }
        }

    }
