package oop.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Dad asan = new Dad("Asam", 99, "straight", "curly");
        Dad uson = new Dad("Uson", 99);
        System.out.println(asan);
        System.out.println(uson);

        Son bektur = new Son("Bektur", 45, "gorbatiy", "Pryamie");
        Son tilek = new Son("Tilek", 20);
        System.out.println(bektur);
        System.out.println(tilek);
        System.out.println(bektur.talent());

        System.out.println("-----------");

        GrandSon bek = new GrandSon("Bek", 7, "pryamoy", "curve");
        System.out.println(bek);
        System.out.println(bek);
        System.out.println(bek.talent());


        System.out.println("------------");

        Dad meken = new Son("Meken", 12, "Gorbatiy","korotkie");
        System.out.println(meken);
        System.out.println(meken.talent());

        Dad beken = new Dad("beken", 32, "gorbatiy", "Curly");
        System.out.println(beken);
        System.out.println(beken.talent());




    }

}
