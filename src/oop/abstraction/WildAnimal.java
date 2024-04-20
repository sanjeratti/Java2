package oop.abstraction;

public class WildAnimal extends Animal{

    public WildAnimal(String name, int age){
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("RRR");

    }

    @Override
    public void run() {
        super.run();
    }
}
