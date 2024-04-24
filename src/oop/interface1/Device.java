package oop.interface1;

public abstract class Device implements Movable{


    // imeet pravo implementirovat to chto nujno iz Movable interfeise
    @Override
    public void moveRight() {
        System.out.println("Poverni napravo");
    }

}
