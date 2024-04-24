package oop.interface1;

public class TvSet implements Movable{


    @Override
    public void moveRight() {
        System.out.println("Dvigaysya vpravo");

    }

    @Override
    public void moveLeft(){
        System.out.println("Dvigaysya nalevo");
    }

    public void switchOn(){
        System.out.println("Vkluchaemsya televisor");
    }
    public void switchOff() {
        System.out.println("Otklluchaemsya televisor");
    }
}
