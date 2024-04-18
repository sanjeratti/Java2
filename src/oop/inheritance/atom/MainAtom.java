package oop.inheritance.atom;

public class MainAtom {
    public static void main(String[] args) {
Atom myAtom = new Atom();
        System.out.println("Atom`s construction:" +myAtom.getElectron().getName());
        System.out.println("Atom`s construction:" +myAtom.getProton().getName());
        System.out.println("Atom`s construction:" +myAtom.getNeutron().getName());
    }
}
