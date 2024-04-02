package oop.encapsulation;

public class CarMain {
    public static void main(String[] args) {
        Car lexus = new Car("lexus", "GX470", "autopylot");
        System.out.println(lexus);
        System.out.println(lexus.mark);
        System.out.println(lexus.model);
        System.out.println(lexus.getProgramm());
        lexus.setProgramm("autopilot2");
        System.out.println(lexus.getProgramm());

    }
}
