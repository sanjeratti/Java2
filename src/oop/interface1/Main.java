package oop.interface1;

public class Main {

    public static void main(String[] args) {
        Movable movable = new TvSet();
        movable.moveRight();
        movable.moveLeft();

        TvSet tvSet = new TvSet();
        tvSet.switchOn();
        tvSet.switchOff();
        tvSet.moveLeft();
        tvSet.moveRight();

        Movable movableDoor = new Door();
        movableDoor.moveLeft();
        movableDoor.moveRight();
    }
  // in
}
