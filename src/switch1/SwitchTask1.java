package switch1;

import java.util.Locale;
import java.util.Scanner;

public class SwitchTask1 {

    public static void main(String[] args) {


        String jay = "June,July,August,";
        String jaz = "March,April,May";
        String kysh = "December,January,February";
        String kuz = "September,October,November,";
        String qv1 = "quartal1";

        // Uslovnie construktsii switch-case
        Scanner scan = new Scanner(System.in);
        String season = scan.next();

        switch (season.toLowerCase()){
            default:
                System.out.println("No season");
                break;
            case "january":
                System.out.println(qv1);
                break;
            case "2":
                System.out.println(jaz);
                break;
            case "3":
                System.out.println(jay);
                break;
            case "4":
                System.out.println(kuz);
                break;
        }
    }
}
