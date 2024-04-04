package oop.encapsulation;

public class MegacomTariffMain {

    public static void main(String[] args) {
        MegacomTariff Eldik = new MegacomTariff("Eldik",50.0, 200.0,400,100);
        System.out.println(Eldik);
        System.out.println(Eldik.getName());
        Eldik.setAbroadLimit(300);
        System.out.println(Eldik.getMinutesLimit());
        Eldik.setMinutesLimit(299);
    }

}
