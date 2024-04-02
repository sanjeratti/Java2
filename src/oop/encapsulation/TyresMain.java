package oop.encapsulation;

public class TyresMain {
    public static void main(String[] args) {
        Tyres pirelli = new Tyres("pirelli","summer",205,55,16);
        System.out.println(pirelli.getInn());
        pirelli.setInn(2025);
        System.out.println(pirelli.getInn());
        System.out.println(pirelli);

        Tyres continental = new Tyres("pirelli","winter",205,55,16);
        System.out.println(continental.getInn());
        continental.setInn(2025);
        System.out.println(continental.getInn());
        System.out.println(continental);
    }
}
