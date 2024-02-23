package switch1;

import java.util.Scanner;

public class SwitchUslovie {
    public static void main(String[] args) {
        // case   |   break   |   default

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        switch (number){
//            case 1:
//                System.out.println("Kysh");
//                break;
//            case 2:
//                System.out.println("Jaz");
//                break;
//            default:
//                System.out.println("sezon jok");
//                break;
//            case 3:
//                System.out.println("Jai");
//                break;
//            case 4:
//                System.out.println("Kuz");
//                break;

//        Scanner scan = new Scanner(System.in);
//        String season = scan.next();
//
//        switch (season){
//            default:
//                System.out.println("No season");
//                break;
//            case "Kysh":
//                System.out.println(1);
//                break;
//            case "Jaz":
//                System.out.println(2);
//                break;
//            case "Jai":
//                System.out.println(3);
//                break;
//            case "Kuz":
//                System.out.println(4);
//        }

        String pol = "m";
        switch (pol){
            default:
                System.out.println("tebe v detskiy");
                break;
            case "m":
                System.out.println("mujskoi");
                break;
            case "j":
                System.out.println("jenskiy");
        }


        if (pol.equals("m")){
            System.out.println("mujskoi");
        } else if (pol.equals("j")) {
            System.out.println("jenskiy");
        } else {
            System.out.println("tebe v detskiy");
        }


//        Scanner scan = new Scanner(System.in);
//        String qvartal = scan.next();
//
//        switch (qvartal){
//            case "January":
//            case "February":
//            case "March":
//                System.out.println("I");
//                break;
//        }
//
//        if (qvartal.equals("January") || qvartal.equals("February") || qvartal.equals("Match")){
//            System.out.println("I");
//        }
    }
}
