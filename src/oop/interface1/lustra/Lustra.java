package oop.interface1.lustra;

public class Lustra implements Pult{

    @Override
    public void moveRight() {
        System.out.println("Vkluchi Zeleniy svet");
    }

    @Override
    public void moveLeft() {
        System.out.println("Vkluchi Jelty svet");
    }

    @Override
    public void moveDown() {
        System.out.println("otkluchit`");
    }

    @Override
    public void moveUp() {
        System.out.println("Vkluchit`");
    }
    public void blur(){
        System.out.println("Priglushi svet");
    }
}
