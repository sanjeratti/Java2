package oop.abstraction;

public class Pet extends Animal{

    public Pet(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Mao");

    }
}
