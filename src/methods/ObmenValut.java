package methods;

import java.util.Scanner;

public class ObmenValut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get username and password from the user
        System.out.println("Valuta:");
        String valuta = scanner.nextLine();

        if (valuta.equalsIgnoreCase("Rubl")) {
            System.out.println("Kakaya u Vas summa?:");
            int summa = scanner.nextInt();
            System.out.println("Hotite Kupit ili prodat?");
            String obmen = scanner.next();
            System.out.println(zum(nbkrRubl(), summa, obmen));
        } else if (valuta.equalsIgnoreCase("Euro")) {
            System.out.println("Kakaya u Vas summa?:");
            int summa = scanner.nextInt();
            System.out.println("Hotite Kupit ili prodat?");
            String obmen = scanner.next();
            System.out.println(zum(nbkrEuro(), summa, obmen));
        }else if (valuta.equalsIgnoreCase("Dollar")) {
            System.out.println("Kakaya u Vas summa?:");
            int summa = scanner.nextInt();
            System.out.println("Hotite Kupit ili prodat?");
            String obmen = scanner.next();
            System.out.println(zum(nbkrDollar(), summa, obmen));


        }
        //   else if (valuta == "Doll") {
      //      System.out.println(zum(nbkrDoll(), summa, obmen));
      //  }

        // System.out.print("Rubl: ");
        // String username = scanner.nextLine();

        //  System.out.println(zum(89.7, 500, "Prodaja"));
        //  System.out.println(zum(89.7, 500, "Pokupka"));

    }

    public static double nbkrEuro() {
        return 99.9;
    }

    public static double nbkrRubl() {
        return 1;
    }
    public static double nbkrDollar() {
        return 89.7;
    }
    public static double dollarToSom() {

        // return 100 * 89.7;

        double course = 89.7;
        int doll = 100;
        double itogo = doll * course;
        return itogo;

    }

    public static double dollarToSom2(double course, int doll) {
        return doll * course;
    }

    public static double RublToSom(double course, int rubl) {
        return rubl * course;
    }

    public static float euroToSom(float course) {

        int euro = 100;
        float itogo = euro * course;
        return itogo;
    }

    public static String zum(double course, int summa, String obmen) {
        if (obmen.equalsIgnoreCase("Pokupka")) {
            return "Pokupka: " + (course - 0.05) * summa;
        } else if (obmen.equalsIgnoreCase("Prodaja")) {
            return "Prodaja: " + (course + 0.05) * summa;
        }
        return "Vy vveli ne pravilno!";

    }

}


