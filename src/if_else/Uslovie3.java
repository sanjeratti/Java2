package if_else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Uslovie3 {
    public static void main(String[] args) {


        // nested (Vlojenniy) if statement
        // if (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ukajite Grajdanstvo: true || false");
        boolean citizen = scan.nextBoolean();

        int age = 33;

        if (citizen == true){
            System.out.println("Kirgizskoe grajdanstvo");
            System.out.println("Ukajite svoy voszrast:");
            if (age >= 16) {
                System.out.println("Passport alsan bolot");
            } else {
                System.out.println("ID alganga bolboyt");
            }
        } else {
            System.out.println("Vy ne imeete KG grajdanstvo");

        }

// Domashka  A -->90 - 100
//         B --> 70-89
//                 c ---> 40-69
//                d --> < 40

//        Yasli -- 0 -2
//        Mladshaya gruppa --> 2-4
//        Starshaya gruppa --> 4 - 6
//



    }
}
