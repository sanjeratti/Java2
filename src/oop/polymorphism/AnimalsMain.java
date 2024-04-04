package oop.polymorphism;

public class AnimalsMain {
    public static void main(String[] args) {
        Animals fox = new Animals(4);
        Animals wolf = new Animals("Barbos", "ovcharka", 4, true);
        Animals lion = new Animals(true);
        Animals cat = new Animals(2,false);
        System.out.println(fox);
        System.out.println(cat);
        System.out.println(wolf);
        System.out.println(lion);
        System.out.println(lion.isWild(true));
        System.out.println(fox.isWild(true));
        System.out.println(wolf.isWild(true));
        System.out.println(cat.isWild(false));
    }
}
