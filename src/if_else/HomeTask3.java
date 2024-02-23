package if_else;

import java.util.Scanner;

public class HomeTask3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hotite kupit mashinu? (true/false)");
        boolean hochukupit = scan.nextBoolean();

        if (hochukupit) {
            System.out.println("Kakuyu marku avtomobilya vy hotite?");
            String carBrand = scan.next();
            if (carBrand.equals("bmw")) {
                System.out.println("Model");
                String car_model = scan.next();
                if (car_model.equals("x7") || car_model.equals("x5")) {
                    System.out.println("Vas budet obslujivat' Maksim! U nas est' v nalichii");
                } else {
                    System.out.println("U nas net takoi modeli");
                }
            } else if (carBrand.equals("honda")) {
                String car_model1 = scan.next();
                if (car_model1.equals("fit")) {
                    System.out.println("Est' v nalichii");
                } else {
                    System.out.println("Net v nalichii");
                }
            }
            System.out.println("U nas est " + carBrand + " v nalichii");
        } else {
            System.out.println("U nas net v nalichii.");
        }
    }
}