package oop.inheritance.car;

import oop.inheritance.car.Audi;

public class Lamborghini extends Audi {
    public Lamborghini(String name, int age, String kusov, String engine) {
        super(name, age, kusov, engine);
    }

    @Override
    public String toString() {
        return "Lamborghini{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kusov='" + kusov + '\'' +
                "engine='" + getEngine() + '\'' +
                '}';
    }

    @Override
    public int price() {
        return 100000;
    }
}
