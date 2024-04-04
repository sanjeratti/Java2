package oop.polymorphism;

public class ManMain {
    public static void main(String[] args) {
        Man adam = new Man ();
        Man adam2 = new Man ("Man");
        Man adam3 = new Man (55);
        Man adam4 = new Man (55,"Man");
        Man adam5 = new Man ("Man", 44);
        System.out.println(adam2.toWork("Men ishtep jatam"));
        System.out.println(adam3);
        System.out.println(adam4);
        System.out.println(adam5);
        System.out.println(adam5);
        System.out.println(adam5.toWork(44, "asdv"));

    }
}
