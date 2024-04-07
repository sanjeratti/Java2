package oop.inheritance.car;

import oop.inheritance.car.VW;

public class CarMain {
    public static void main(String[] args) {
        VW passat = new VW("passat", 2020, "universal", "diesel");
        VW golf = new VW("golf", 2021);
        System.out.println(passat);
        System.out.println(golf);

        Audi A6 = new Audi("A6", 2023, "universal","Electro");
        Audi A4 = new Audi("A4", 2021, "universal","Petrol");
        System.out.println(A6);
        System.out.println(A4);
        System.out.println(A4.price());
        System.out.println(A6.price());





    }
}
