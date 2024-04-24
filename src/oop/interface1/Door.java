package oop.interface1;

public class Door implements Movable {

    @Override
    public void moveRight() {
        System.out.println("Open");
    }

    @Override
    public void moveLeft() {
        System.out.println("Close");

    }

}
