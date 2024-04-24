package oop.interface1.lustra;

public class MainLustra {
    public static void main(String[] args) {
        Pult lustra = new Lustra();
        lustra.moveDown();
        lustra.moveLeft();
        lustra.moveRight();
        lustra.moveUp();

        Lustra lustra1 = new Lustra();
        lustra1.blur();


        Shtory shtory = new Shtory();
        shtory.moveRight();
        shtory.moveLeft();
        shtory.moveDown();
        shtory.moveUp();


    }

}
